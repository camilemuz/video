package controlador;

import modelo.clase_user;

public class controladorUser {
	
	public void registrar(String fullname, String user, String phone, String password, String address){
		
		clase_user us = new clase_user(fullname, user, phone, password, address);
		us.registro();
	}
}
