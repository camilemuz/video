package modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controlador.Conectorbd;

public class clase_nomination {
	
	private String nomination;
	private int nom;
	private int video;
	private int earned;

	public clase_nomination(String nomination) {
		super();
		this.nomination = nomination;
	}

	public clase_nomination(int nom, int video) {
		super();
		this.nom = nom;
		this.video = video;
	}

	public clase_nomination(int earned) {
		super();
		this.earned = earned;
	}

	public String getNomination() {
		return nomination;
	}

	public void setNomination(String nomination) {
		this.nomination = nomination;
	}
	
	public int getNom() {
		return nom;
	}

	public void setNom(int nom) {
		this.nom = nom;
	}

	public int getVideo() {
		return video;
	}

	public void setVideo(int video) {
		this.video = video;
	}

	public int getEarned() {
		return earned;
	}

	public void setEarned(int earned) {
		this.earned = earned;
	}

	public void registro(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO nomination(id_nomination, nomination_name) VALUES (null,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setString(1,getNomination());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
	
	public void registro1(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO nomination_video(id_nomination_video, video_management_id_video, nomination_id_nomination) VALUES (null,?,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setInt(1, getVideo());
	        pst.setInt(2, getNom());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
	
	public void registro2(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO nomination_earned(id_nomination_earned, nomination_video_id_nomination_video) VALUES (null,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setInt(1, getEarned());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
}
