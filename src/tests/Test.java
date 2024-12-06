package tests;

import java.time.*;
import entites.*;
import gestionnaires.GestionnaireAgenda;


public class Test {

	public static void main(String[] args) {
		
		  Commercial c= new Commercial("1", "Ahmed"); 
		  GestionnaireAgenda g= new GestionnaireAgenda(); 
		  g.ajouterRdv(c, new Rdv(LocalDateTime.of(2023,3,25,15,30), "Café Mama Rosa","Walid")); 
		  g.ajouterRdv(c, new Rdv(LocalDateTime.of(2023, 3,26,9,30), "Café Belvue","Ahmed"));
		  g.ajouterRdv(c, new Rdv(LocalDateTime.of(2023, 3,26,11,15), "Restaurant Tonton","Slim")); 
		  g.ajouterRdv(c, new Rdv(LocalDateTime.of(2023,3,27,9,0), "Café Belvue","Ali")); 
		  g.ajouterRdv(c, new Rdv(LocalDateTime.of(2022, 3,27,14,30), "Café Claudana","Mahdi"));
		  g.changeRdvsOfDay(c, LocalDate.of(2023, 3, 27), Duration.ofMinutes(90));
		  
		  for (Rdv r:c.getAgenda())
			  System.out.println(r);
		 
		
		

	}

}
