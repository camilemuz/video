package vista;


import java.awt.Color;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import controlador.Conectorbd;
import controlador.controladorVideo;

public class addVideo2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtAlternative;
	private JComboBox cbNomination;
	private JComboBox cbActor;
	
	static controladorVideo controladorVideo= new controladorVideo();
	static addVideo3 addVideo3 = new addVideo3();
	
	public addVideo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		txtAlternative = new JTextField();
		txtAlternative.setFont(new Font("Arial", Font.PLAIN, 20));
		txtAlternative.setColumns(10);
		txtAlternative.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtAlternative.setBackground(new Color(255, 153, 51));
		txtAlternative.setBounds(33, 123, 385, 37);
		contentPane.add(txtAlternative);
		
		JLabel lblFullName = new JLabel("Title Alternative:");
		lblFullName.setForeground(Color.WHITE);
		lblFullName.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblFullName.setBounds(33, 93, 198, 29);
		contentPane.add(lblFullName);
		
		JLabel lblUsername = new JLabel("Actor:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblUsername.setBounds(33, 187, 135, 29);
		contentPane.add(lblUsername);
		
		JButton btnRegister = new JButton("Next");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controladorVideo.regitrar1(vi(), ac());
					controladorVideo.regitrar2(nom(), vi());
					controladorVideo.regitrar3(vi(), txtAlternative.getText().toString());
					addVideo3.setVisible(true);
					limpiar();
					setVisible(false);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnRegister.setForeground(new Color(0, 102, 102));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnRegister.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnRegister.setBackground(new Color(204, 204, 204));
		btnRegister.setBounds(257, 301, 135, 50);
		contentPane.add(btnRegister);
		
		cbActor = new JComboBox();
		cbActor.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		cbActor.setFont(new Font("Arial", Font.BOLD, 20));
		cbActor.setBounds(33, 218, 184, 37);
		contentPane.add(cbActor);
		
		ArrayList<String> lista = new ArrayList<>();
		String sql 	="SELECT full_name FROM actor";
		Conectorbd conector = new Conectorbd();
		Connection conn = conector.conexion();
		try{
			Statement str = (Statement) conn.createStatement();
			ResultSet r = str.executeQuery(sql);
			while(r.next()){
				lista.add(r.getString("full_name"));
			}
			for(int i=0; i<lista.size(); i++){
				cbActor.addItem(lista.get(i));
			}
			
		}catch (Exception e) {
		}
		
		JLabel Nomination = new JLabel("Nomination:");
		Nomination.setForeground(Color.WHITE);
		Nomination.setFont(new Font("Arial Black", Font.BOLD, 20));
		Nomination.setBounds(234, 187, 216, 29);
		contentPane.add(Nomination);
		
		cbNomination = new JComboBox();
		cbNomination.setFont(new Font("Arial", Font.BOLD, 20));
		cbNomination.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		cbNomination.setBounds(234, 218, 184, 37);
		contentPane.add(cbNomination);
		
		ArrayList<String> lista1 = new ArrayList<>();
		String sql1 ="SELECT nomination_name FROM nomination";
		try{
			Statement str1 = (Statement) conn.createStatement();
			ResultSet r1 = str1.executeQuery(sql1);
			while(r1.next()){
				lista1.add(r1.getString("nomination_name"));
			}
			for(int i=0; i<lista1.size(); i++){
				cbNomination.addItem(lista1.get(i));
			}
			
		}catch (Exception e) {
		}
		
		JButton btnOther = new JButton("Other");
		btnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controladorVideo.regitrar1(vi(), ac());
					controladorVideo.regitrar2(nom(), vi());
					controladorVideo.regitrar3(vi(), txtAlternative.getText().toString());
					limpiar();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnOther.setForeground(new Color(0, 102, 102));
		btnOther.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnOther.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnOther.setBackground(new Color(204, 204, 204));
		btnOther.setBounds(61, 301, 135, 50);
		contentPane.add(btnOther);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}

	public int ac() throws SQLException{
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
	 	String sql = "SELECT * FROM actor";
		Statement st = (Statement) c.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    int aux = 0;
		while(rs.next()){
	    	if(cbActor.getSelectedItem().toString().equals(rs.getString("full_name").toString())){
	    		aux= Integer.parseInt(rs.getString("id_actor"));
	        	
	    	}
		}
	    return aux;
	}
	
	public int nom() throws SQLException{
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
	 	String sql = "SELECT * FROM nomination";
		Statement st = (Statement) c.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    int aux = 0;
		while(rs.next()){
	    	if(cbNomination.getSelectedItem().toString().equals(rs.getString("nomination_name").toString())){
	    		aux= Integer.parseInt(rs.getString("id_nomination"));
	        	
	    	}
		}
	    return aux;
	}
	
	public int vi() throws SQLException{
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
	
	public void limpiar() {
		txtAlternative.setText("");
	}
}
