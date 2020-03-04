package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.toedter.calendar.JDateChooser;

import controlador.Conectorbd;
import controlador.controladorCliente;

public class blockClient extends JFrame {

	private JPanel contentPane;
	private JTextField txtClient;
	private JTextField txtBlock;

	static client client = new client();
	static controladorCliente cliente = new controladorCliente();
	
	public blockClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBackground(new Color(51, 51, 102));
		panel.setBounds(0, 0, 455, 71);
		contentPane.add(panel);
		
		JLabel lblRegisterClient = new JLabel("BLOCK CLIENT");
		lblRegisterClient.setBackground(new Color(51, 51, 51));
		lblRegisterClient.setForeground(Color.WHITE);
		lblRegisterClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterClient.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterClient);
		
		JLabel lblFirstName = new JLabel("Client:");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblFirstName.setBounds(70, 94, 135, 29);
		contentPane.add(lblFirstName);
		
		txtClient = new JTextField();
		txtClient.setFont(new Font("Arial", Font.PLAIN, 20));
		txtClient.setColumns(10);
		txtClient.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtClient.setBackground(new Color(255, 153, 51));
		txtClient.setBounds(70, 125, 296, 37);
		contentPane.add(txtClient);
		
		JLabel lblPhoneNumber = new JLabel("Description Block:");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPhoneNumber.setBounds(70, 172, 215, 29);
		contentPane.add(lblPhoneNumber);
		
		txtBlock = new JTextField();
		txtBlock.setFont(new Font("Arial", Font.PLAIN, 20));
		txtBlock.setColumns(10);
		txtBlock.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtBlock.setBackground(new Color(255, 153, 51));
		txtBlock.setBounds(70, 203, 296, 37);
		contentPane.add(txtBlock);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				client.setVisible(true);
				limpiar();
				setVisible(false);
			}
		});
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button.setBackground(new Color(204, 204, 204));
		button.setBounds(70, 261, 135, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Block");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.bloquear(comparar(), "block", txtBlock.getText().toString());
				client.setVisible(true);
				setVisible(false);
				client.tabla();
			}
		});
		button_1.setForeground(new Color(0, 102, 102));
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button_1.setBackground(new Color(204, 204, 204));
		button_1.setBounds(231, 261, 135, 50);
		contentPane.add(button_1);
		
		
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
	
	public void limpiar() {
		txtClient.setText("");
		txtBlock.setText("");
	}
	
	public static String fecha(){
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("YYYY-MMM-dd");
		return formato.format(fecha);
	}
	
	public int comparar(){
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
		int aux1 = 0;
		try{
	 	String sql1 = "SELECT * FROM client_management "
	 			+ "where last_name = '"+txtClient.getText().toString()+"'";

		Statement st1 = (Statement) c.createStatement();
	    ResultSet rs = st1.executeQuery(sql1);
	    
		while(rs.next()){
				
	    		aux1= rs.getInt("id_client");

	    	}
		}catch (Exception e) {
			//System.out.println(e);
		}
		 return aux1;
		}
	   


}
