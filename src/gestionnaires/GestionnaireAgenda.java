package gestionnaires;

import java.time.*;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import entites.*;

public class GestionnaireAgenda {
	
	public boolean ajouterRdv(Commercial c, Rdv r) {
		if (c == null || r == null || c.getAgenda().contains(r))
			return false;
		return c.getAgenda().add(r);
	}

	public boolean supprimerRdv(Commercial c, Rdv r) {
		if (c == null || r == null)
			return false;
		return c.getAgenda().remove(r);
	}

	public List<Rdv> getRdvsOfDay(Commercial c, LocalDate d) {
		List<Rdv> lst = new ArrayList<>();
		if(c!=null && d!=null)
			for (Rdv v:c.getAgenda())
				if (v.getDate().toLocalDate().equals(d))
					lst.add(v);
		return lst;
	}
		
	public void changeRdvsOfDay(Commercial c, LocalDate d, Duration dr) {
		if(c!=null && d!=null && dr!=null)
			for (Rdv v:getRdvsOfDay(c, d))
				v.setDate(v.getDate().plus(dr));
	}
	
	
	
	
	
	
	
	
	
	

}
