package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import controlador.controladorUser;

public class addUser extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;
	private JTextField txtUserName;
	private JTextField txtCellphone;
	private JTextField txtAddress;
	private JTextField txtPassword;
	
	static user user = new user();
	static controladorUser controladorUser = new controladorUser();
	public addUser() {
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
		
		JLabel lblRegisterUser = new JLabel("REGISTER USER\r\n");
		lblRegisterUser.setForeground(Color.WHITE);
		lblRegisterUser.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterUser.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterUser);
		
		txtFullName = new JTextField();
		txtFullName.setFont(new Font("Arial", Font.PLAIN, 20));
		txtFullName.setColumns(10);
		txtFullName.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtFullName.setBackground(new Color(255, 153, 51));
		txtFullName.setBounds(73, 123, 296, 37);
		contentPane.add(txtFullName);
		
		JLabel lblFullName = new JLabel("Full Name:\r\n");
		lblFullName.setForeground(Color.WHITE);
		lblFullName.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblFullName.setBounds(73, 92, 135, 29);
		contentPane.add(lblFullName);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblUsername.setBounds(73, 170, 135, 29);
		contentPane.add(lblUsername);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Arial", Font.PLAIN, 20));
		txtUserName.setColumns(10);
		txtUserName.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtUserName.setBackground(new Color(255, 153, 51));
		txtUserName.setBounds(73, 201, 296, 37);
		contentPane.add(txtUserName);
		
		JLabel lblCellphone = new JLabel("Cellphone:\r\n");
		lblCellphone.setForeground(Color.WHITE);
		lblCellphone.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCellphone.setBounds(73, 248, 135, 29);
		contentPane.add(lblCellphone);
		
		txtCellphone = new JTextField();
		txtCellphone.setFont(new Font("Arial", Font.PLAIN, 20));
		txtCellphone.setColumns(10);
		txtCellphone.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtCellphone.setBackground(new Color(255, 153, 51));
		txtCellphone.setBounds(73, 279, 296, 37);
		contentPane.add(txtCellphone);
		
		JLabel lblAddress = new JLabel("Address:\r\n\r\n");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblAddress.setBounds(73, 326, 135, 29);
		contentPane.add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		txtAddress.setColumns(10);
		txtAddress.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtAddress.setBackground(new Color(255, 153, 51));
		txtAddress.setBounds(73, 357, 296, 37);
		contentPane.add(txtAddress);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPassword.setBounds(73, 404, 135, 29);
		contentPane.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		txtPassword.setColumns(10);
		txtPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtPassword.setBackground(new Color(255, 153, 51));
		txtPassword.setBounds(73, 435, 296, 37);
		contentPane.add(txtPassword);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setVisible(true);
				setVisible(false);
				user.tabla();
			}
		});
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button.setBackground(new Color(204, 204, 204));
		button.setBounds(73, 498, 135, 50);
		contentPane.add(button);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorUser.registrar(txtFullName.getText().toString(), txtUserName.getText().toString(), txtCellphone.getText().toString(), txtPassword.getText().toString(), txtAddress.getText().toString());
				user.setVisible(true);
				setVisible(false);
				user.tabla();
			}
		});
		btnRegister.setForeground(new Color(0, 102, 102));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnRegister.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnRegister.setBackground(new Color(204, 204, 204));
		btnRegister.setBounds(234, 498, 135, 50);
		contentPane.add(btnRegister);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}

}
