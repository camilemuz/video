package modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controlador.Conectorbd;

public class clase_client {
	
	private String name;
	private String second;
	private String phone;
	private String mail;
	private String birth;
	private String address;
	private String geo;
	private String date;
	private int us;
	private String status;
	private int idClient;
	private String desc;
	
	public clase_client(String name, String second, String phone, String mail, String birth, String address, String geo,
			String date, int us) {
		super();
		this.name = name;
		this.second = second;
		this.phone = phone;
		this.mail = mail;
		this.birth = birth;
		this.address = address;
		this.geo = geo;
		this.date = date;
		this.us = us;
	}
	
	
	public clase_client(String status, int idClient, String desc) {
		super();
		this.status = status;
		this.idClient = idClient;
		this.desc = desc;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGeo() {
		return geo;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getUs() {
		return us;
	}

	public void setUs(int us) {
		this.us = us;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void registro(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO client_management(id_client, first_name, last_name, cellphone, mail, date_of_birth,address_client,geolocation,date_register,users_id_users) VALUES (null,?,?,?,?,?,?,?,?,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setString(1,getName());
	        pst.setString(2, getSecond());
	        pst.setString(3, getPhone());
	        pst.setString(4, getMail());
	        pst.setString(5, getBirth());
	        pst.setString(6, getAddress());
	        pst.setString(7, getGeo());
	        pst.setString(8, getDate());
	        pst.setInt(9, getUs());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
	
	public void block(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO customer_lock(id, client_management_id_client, status, description_status) VALUES (null,?,?,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setInt(1, getIdClient());
	        pst.setString(2,getStatus());
	        pst.setString(3, getDesc());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "BLOQUEO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "BLOQUEO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
	
}
