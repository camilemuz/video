package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import controlador.Conectorbd;
import controlador.controladorVideo;

public class addVideo3 extends JFrame {

	private JPanel contentPane;
	private JComboBox cbNominationWon;

	static video video = new video();
	static controladorVideo controladorVideo = new controladorVideo();
	
	public addVideo3(){
		setBounds(100, 100, 446, 402);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBackground(new Color(51, 51, 102));
		panel.setBounds(0, 0, 446, 71);
		contentPane.add(panel);
		
		JLabel lblRegisterUser = new JLabel("REGISTER VIDEO");
		lblRegisterUser.setForeground(Color.WHITE);
		lblRegisterUser.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterUser.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterUser);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controladorVideo.regitrar4(won());
					video.setVisible(true);
					setVisible(false);
					JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO");
				} catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "REGISTRO SIN EXITO");
				}
			}
		});
		btnRegister.setForeground(new Color(0, 102, 102));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnRegister.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnRegister.setBackground(new Color(204, 204, 204));
		btnRegister.setBounds(257, 301, 135, 50);
		contentPane.add(btnRegister);
		

		
		JLabel Nomination = new JLabel("Nomination Won:");
		Nomination.setForeground(Color.WHITE);
		Nomination.setFont(new Font("Arial Black", Font.BOLD, 20));
		Nomination.setBounds(120, 108, 216, 29);
		contentPane.add(Nomination);
		
		cbNominationWon = new JComboBox();
		cbNominationWon.setFont(new Font("Arial", Font.BOLD, 20));
		cbNominationWon.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		cbNominationWon.setBounds(62, 147, 310, 37);
		contentPane.add(cbNominationWon);
		try {
		ArrayList<String> lista = new ArrayList<>();
		String sql 	="SELECT nomination_name FROM nomination, nomination_video "
				+ "where video_management_id_video = '"+ vi1() +"'"
						+ "and id_nomination_video = id_nomination";
		Conectorbd conector = new Conectorbd();
		Connection conn = conector.conexion();
		try{
			Statement str = (Statement) conn.createStatement();
			ResultSet r = str.executeQuery(sql);
			while(r.next()){
				lista.add(r.getString("nomination_name"));
			}
			for(int i=0; i<lista.size(); i++){
				cbNominationWon.addItem(lista.get(i));
			}
			
		}catch (Exception e) {
		}
		}catch (Exception e) {
		}
		
		JButton btnOther = new JButton("Other");
		btnOther.setForeground(new Color(0, 102, 102));
		btnOther.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnOther.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnOther.setBackground(new Color(204, 204, 204));
		btnOther.setBounds(61, 301, 135, 50);
		contentPane.add(btnOther);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
	
	public int won() throws SQLException{
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
	 	String sql = "SELECT * FROM nomination, nomination_video "
	 			+ "where video_management_id_video = '"+ vi1()+"'";
		Statement st = (Statement) c.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    int aux = 0;
		while(rs.next()){
	    	if(cbNominationWon.getSelectedItem().toString().equals(rs.getString("nomination_name").toString())){
	    		aux= Integer.parseInt(rs.getString("id_nomination"));
	        	
	    	}
		}
	    return aux;
	}
	
	
	public int vi1() throws SQLException{
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
	 	String sql = "SELECT MAX(id_video) FROM video_management";
		Statement st = (Statement) c.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    int aux = 0;
		if(rs.next()){
	    	aux=rs.getInt(1);
		}
	    return aux;
	}
}
