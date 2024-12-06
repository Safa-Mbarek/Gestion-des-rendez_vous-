package gestionnaires;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entites.Commercial;
import entites.Rdv;

public class GestionnaireAgenda {
	
	public boolean ajouterRdv(Commercial c, Rdv r ) {
		if (! c.getAgenda().contains(r))
			return c.getAgenda().add(r);
		return false;
		
	}
	
	public boolean supprimerRdv(Commercial c, Rdv r ) {
		return c.getAgenda().remove(r);
		
	}
	
	public List<Rdv> getRdvsOfDay(Commercial c,LocalDate d) {
		List<Rdv> rdvs=new ArrayList<Rdv>();
		for(Rdv r: c.getAgenda())
			if (r.getDate().toLocalDate().equals(d))
				rdvs.add(r);
		return rdvs;
		
	}
	public void changeRdvsOfDay(Commercial c, LocalDate d, Duration dr) {
		for(Rdv r: c.getAgenda())
			if (r.getDate().toLocalDate().equals(d))
				r.setDate(r.getDate().plus(dr));
		
	}

}
