package modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controlador.Conectorbd;

public class clase_actor {
	
	private String actor;
	private int act;
	private int video;

	public clase_actor(String actor) {
		super();
		this.actor = actor;
	}

	public clase_actor(int act, int video) {
		super();
		this.act = act;
		this.video = video;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public int getVideo() {
		return video;
	}

	public void setVideo(int video) {
		this.video = video;
	}

	public int getAct() {
		return act;
	}

	public void setAct(int act) {
		this.act = act;
	}

	public void registro(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO actor(id_actor, full_name) VALUES (null,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setString(1,getActor());
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
		String sqlGuardar="INSERT INTO video_actor(id_video_actor, video_management_id_video, actor_id_actor) VALUES (null,?,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setInt(1, getVideo());
	        pst.setInt(2, getAct());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}
}
