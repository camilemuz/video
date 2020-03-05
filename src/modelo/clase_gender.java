package modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controlador.Conectorbd;

public class clase_gender {
	private String gender;

	public clase_gender(String gender) {
		super();
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void registro(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO gender(id_gender, gender_video) VALUES (null,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setString(1,getGender());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
}
