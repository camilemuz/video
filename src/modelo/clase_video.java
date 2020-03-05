package modelo;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controlador.Conectorbd;

public class clase_video {
	private int time;
	private int gender;
	private String title;
	private int year;
	private double price;
	private int unit;
	private int us;
	private int tit;
	private String alternative;

	public clase_video(int time, int gender, String title, int year, double price, int unit, int us) {
		super();
		this.time = time;
		this.gender = gender;
		this.title = title;
		this.year = year;
		this.price = price;
		this.unit = unit;
		this.us = us;
	}

	public clase_video(int tit, String alternative) {
		super();
		this.tit = tit;
		this.alternative = alternative;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getUs() {
		return us;
	}

	public void setUs(int us) {
		this.us = us;
	}
	
	public int getTit() {
		return tit;
	}

	public void setTit(int tit) {
		this.tit = tit;
	}

	public String getAlternative() {
		return alternative;
	}

	public void setAlternative(String alternative) {
		this.alternative = alternative;
	}

	public void registro(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		String sqlGuardar="INSERT INTO video_management(id_video, movie_time, gender_id_gender, title, year_publication, price, acquired_unit, users_id_users) VALUES (null,?,?,?,?,?,?,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setInt(1, getTime());
	        pst.setInt(2, getGender());
	        pst.setString(3, getTitle());
	        pst.setInt(4, getYear());
	        pst.setDouble(5, getPrice());
	        pst.setInt(6, getUnit());
	        pst.setInt(7, getUs());
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
		String sqlGuardar="INSERT INTO video_name(id_video_name, alternative_name, video_management_id_video) VALUES (null,?,?)";
		try {
	        PreparedStatement pst=(PreparedStatement) c.prepareStatement(sqlGuardar);
	        pst.setString(1, getAlternative());
	        pst.setInt(2, getTit());
	        pst.executeUpdate();
	        JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
	    	System.out.println(e);
	    	}
	}

	
}
