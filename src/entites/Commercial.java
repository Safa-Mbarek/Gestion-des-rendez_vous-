package entites;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Commercial {
	private String num;
	private String nom;
	private List<Rdv> agenda;
	
	public Commercial(String num, String nom) {
		super();
		this.num = num;
		this.nom = nom;
		this.agenda= new ArrayList<Rdv>();
	}

	public List<Rdv> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Rdv> agenda) {
		this.agenda = agenda;
	}
	
	

}
