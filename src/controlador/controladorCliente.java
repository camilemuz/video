package controlador;

import modelo.clase_client;


public class controladorCliente {
	
	public void registrar(String firstName, String lastName, String phone, String mail, String birth, String address, String geo, String date, int us){
		
		clase_client cli= new clase_client(firstName, lastName, phone, mail, birth, address, geo, date, us);
		cli.registro();
	}
	
	public void bloquear(int id, String status, String desc){
		
		clase_client cli= new clase_client(status, id, desc);
		cli.block();
	}
}
