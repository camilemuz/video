package modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controlador.Conectorbd;

public class clase_user {
	
	private String fullName;
	private String user;
	private String phone;
	private String password;
	private String address;
	public clase_user(String fullName, String user, String phone, String password, String address) {
		super();
		this.fullName = fullName;
		this.user = user;
		this.phone = phone;
		this.password = password;
		this.address = address;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void registro(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO users(id_user, name, user, phone_number, password, address_user) VALUES (null,?,?,?,?,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setString(1,getFullName());
	        pst.setString(2, getUser());
	        pst.setString(3, getPhone());
	        pst.setString(4, getPassword());
	        pst.setString(5, getAddress());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
}
