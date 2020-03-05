package vista;




import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import controlador.Conectorbd;
import controlador.controladorVideo;

import javax.swing.JComboBox;
import javax.swing.JSpinner;


public class addVideo1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMovie;
	private JComboBox cbGender;
	private JTextField txtYear;
	private JTextField txtTime;
	private JTextField txtCost;
	private JTextField txtCopy;
	
	static video video = new video();
	static addVideo1 addVideo1 = new addVideo1();
	static controladorVideo controladorVideo = new controladorVideo();
	static addVideo2 addVideo2 = new addVideo2();

	
	public addVideo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 580);
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
		panel.setBounds(0, 0, 450, 71);
		contentPane.add(panel);
		
		JLabel lblRegisterUser = new JLabel("REGISTER VIDEO");
		lblRegisterUser.setForeground(Color.WHITE);
		lblRegisterUser.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterUser.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterUser);
		
		txtMovie = new JTextField();
		txtMovie.setFont(new Font("Arial", Font.PLAIN, 20));
		txtMovie.setColumns(10);
		txtMovie.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtMovie.setBackground(new Color(255, 153, 51));
		txtMovie.setBounds(33, 123, 385, 37);
		contentPane.add(txtMovie);
		
		JLabel lblFullName = new JLabel("Title Movie:");
		lblFullName.setForeground(Color.WHITE);
		lblFullName.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblFullName.setBounds(33, 93, 148, 29);
		contentPane.add(lblFullName);
		
		JLabel lblUsername = new JLabel("Gender:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblUsername.setBounds(33, 187, 135, 29);
		contentPane.add(lblUsername);
		
		JLabel lblCellphone = new JLabel("Movie Time:");
		lblCellphone.setForeground(Color.WHITE);
		lblCellphone.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCellphone.setBounds(33, 287, 155, 29);
		contentPane.add(lblCellphone);
		
		JLabel lblAddress = new JLabel("Cost:");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblAddress.setBounds(234, 287, 135, 29);
		contentPane.add(lblAddress);
		
		JLabel lblPassword = new JLabel("Number Copy:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPassword.setBounds(33, 377, 175, 29);
		contentPane.add(lblPassword);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video.setVisible(true);
				setVisible(false);
				video.tabla();
			}
		});
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button.setBackground(new Color(204, 204, 204));
		button.setBounds(73, 498, 135, 50);
		contentPane.add(button);
		
		JButton btnRegister = new JButton("Next");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controladorVideo.registrar(Integer.parseInt(txtTime.getText().toString()), gen(), txtMovie.getText().toString(), Integer.parseInt(txtYear.getText().toString()), Double.parseDouble(txtCost.getText().toString()), Integer.parseInt(txtCopy.getText().toString()), 1);
				} catch (NumberFormatException | SQLException e1) {
					e1.printStackTrace();
				}
				addVideo2.setVisible(true);
				setVisible(false);
				video.tabla();
			}
		});
		btnRegister.setForeground(new Color(0, 102, 102));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnRegister.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnRegister.setBackground(new Color(204, 204, 204));
		btnRegister.setBounds(234, 498, 135, 50);
		contentPane.add(btnRegister);
		
		cbGender = new JComboBox();
		cbGender.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		cbGender.setFont(new Font("Arial", Font.BOLD, 20));
		cbGender.setBounds(33, 218, 184, 37);
		contentPane.add(cbGender);
		
		ArrayList<String> lista = new ArrayList<>();
		String sql 	="SELECT gender_video FROM gender";
		Conectorbd conector = new Conectorbd();
		Connection conn = conector.conexion();
		try{
			Statement str = (Statement) conn.createStatement();
			ResultSet r = str.executeQuery(sql);
			while(r.next()){
				lista.add(r.getString("gender_video"));
			}
			for(int i=0; i<lista.size(); i++){
				cbGender.addItem(lista.get(i));
			}
			
		}catch (Exception e) {
		}
		JLabel lblYearPublication = new JLabel("Year Publication:");
		lblYearPublication.setForeground(Color.WHITE);
		lblYearPublication.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblYearPublication.setBounds(234, 187, 216, 29);
		contentPane.add(lblYearPublication);
		
		txtYear = new JTextField();
		txtYear.setFont(new Font("Arial", Font.PLAIN, 20));
		txtYear.setColumns(10);
		txtYear.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtYear.setBackground(new Color(255, 153, 51));
		txtYear.setBounds(234, 218, 184, 37);
		contentPane.add(txtYear);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Arial", Font.PLAIN, 20));
		txtTime.setColumns(10);
		txtTime.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtTime.setBackground(new Color(255, 153, 51));
		txtTime.setBounds(33, 312, 184, 37);
		contentPane.add(txtTime);
		
		txtCost = new JTextField();
		txtCost.setFont(new Font("Arial", Font.PLAIN, 20));
		txtCost.setColumns(10);
		txtCost.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtCost.setBackground(new Color(255, 153, 51));
		txtCost.setBounds(234, 312, 184, 37);
		contentPane.add(txtCost);
		
		txtCopy = new JTextField();
		txtCopy.setFont(new Font("Arial", Font.PLAIN, 20));
		txtCopy.setColumns(10);
		txtCopy.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtCopy.setBackground(new Color(255, 153, 51));
		txtCopy.setBounds(33, 403, 184, 37);
		contentPane.add(txtCopy);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
	
	public void limpiar() {
		txtMovie.setText("");
	}
	
	public int gen() throws SQLException{
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
	 	String sql = "SELECT * FROM gender";
		Statement st = (Statement) c.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    int aux = 0;
		while(rs.next()){
	    	if(cbGender.getSelectedItem().toString().equals(rs.getString("gender_video").toString())){
	    		aux= Integer.parseInt(rs.getString("id_gender"));
	        	
	    	}
		}
	    return aux;
	}
}
