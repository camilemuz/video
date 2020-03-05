package controlador;

import modelo.clase_actor;
import modelo.clase_gender;
import modelo.clase_nomination;

public class controladorConfiguracion {
	
	public void registrar_gender(String gender){
		
		clase_gender gen = new clase_gender(gender);
		gen.registro();
	}
	
	public void registrar_nomination(String nomination){
		
		clase_nomination nom = new clase_nomination(nomination);
		nom.registro();
	}
	
	public void registrar_actor(String actor){
		
		clase_actor ac = new clase_actor(actor);
		ac.registro();
	}
}
