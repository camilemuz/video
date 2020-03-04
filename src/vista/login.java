package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import controlador.Conectorbd;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPasswordLogin;
	
	static newAccount account = new newAccount();
	static client client = new client();
	
	public static void main(String[] args) {
		login login = new login();
		login.setVisible(true);
}
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBackground(new Color(51, 51, 102));
		panel.setBounds(0, 0, 507, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTituloLogin = new JLabel("VIDEO CLUB LOGIN");
		lblTituloLogin.setForeground(new Color(255, 255, 255));
		lblTituloLogin.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblTituloLogin.setBounds(26, 23, 230, 26);
		panel.add(lblTituloLogin);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\stive\\Downloads\\cine (1).png"));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(434, 0, 73, 71);
		panel.add(label);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
		txtUsuario.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtUsuario.setBackground(new Color(255, 153, 51));
		txtUsuario.setBounds(106, 154, 296, 37);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPasswordLogin = new JPasswordField();
		txtPasswordLogin.setFont(new Font("Arial", Font.PLAIN, 20));
		txtPasswordLogin.setBackground(new Color(255, 153, 51));
		txtPasswordLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtPasswordLogin.setBounds(106, 230, 296, 37);
		contentPane.add(txtPasswordLogin);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(106, 123, 135, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPassword.setBounds(106, 201, 121, 29);
		contentPane.add(lblPassword);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnCancel.setBackground(new Color(204, 204, 204));
		btnCancel.setForeground(new Color(0, 102, 102));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnCancel.setBounds(106, 336, 135, 50);
		contentPane.add(btnCancel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			int n1=0;
			public void actionPerformed(ActionEvent e) {
				verificar();
				n1++;
				if(n1==3){
					System.exit(0);
					n1=0;
				}
			}
		});
		btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnLogin.setBackground(new Color(204, 204, 204));
		btnLogin.setForeground(new Color(0, 102, 102));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnLogin.setBounds(267, 336, 135, 50);
		contentPane.add(btnLogin);
		
		JLabel lblClickHereTo = new JLabel("click here to create a new account");
		lblClickHereTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				account.setVisible(true);
				setVisible(false);
			}
		});
		lblClickHereTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickHereTo.setForeground(Color.WHITE);
		lblClickHereTo.setFont(new Font("Leelawadee UI Semilight", Font.BOLD | Font.ITALIC, 15));
		lblClickHereTo.setBounds(106, 289, 296, 29);
		contentPane.add(lblClickHereTo);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
	
	public void verificar(){
		Conectorbd conector = new Conectorbd();
		Connection connection = conector.conexion();
		String user=txtUsuario.getText().toString();
		String pass= String.valueOf(txtPasswordLogin.getPassword());
		int resultado =0;
		int n=0;
		String sql ="select * from users where user='"+user+"' and password='"+pass+"'";
		try{
			Statement st = (Statement) connection.createStatement();
			ResultSet rs =st.executeQuery(sql);

			
			if(rs.next()){
				resultado=1;

				if(resultado==1){
				
					client.setVisible(true);
					setVisible(false);
				}	
			}else{
				n++;
				JOptionPane.showMessageDialog(null, "Datos Incorrectos ");
				txtPasswordLogin.setText("");
				txtUsuario.setText("");
				if(n>=3){
					System.exit(0);
				}
			}
		}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error en el Acceso, Vuelva a Intentarlo ");
		}
}
}
