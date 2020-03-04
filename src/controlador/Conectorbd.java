package controlador;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class Conectorbd {
Connection conectar = null;
	
	public Connection conexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/video_club","root","");
			//JOptionPane.showMessageDialog(null, "Coneccion exitosa");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de coneccion");
		}
		return conectar;
	}
}
