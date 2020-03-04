package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;

import controlador.controladorCliente;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class addClient extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JDateChooser txtbirthday;
	
	static client client = new client();
	static controladorCliente cliente = new controladorCliente();
	
	private JTextField txtLast;
	public addClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 682);
		contentPane = new JPanel();
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
		
		JLabel lblRegisterClient = new JLabel("REGISTER CLIENT");
		lblRegisterClient.setBackground(new Color(51, 51, 51));
		lblRegisterClient.setForeground(Color.WHITE);
		lblRegisterClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterClient.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterClient);
		
		JLabel lblFirstName = new JLabel("First Name:\r\n");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblFirstName.setBounds(70, 94, 135, 29);
		contentPane.add(lblFirstName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Arial", Font.PLAIN, 20));
		txtName.setColumns(10);
		txtName.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtName.setBackground(new Color(255, 153, 51));
		txtName.setBounds(70, 125, 296, 37);
		contentPane.add(txtName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPhoneNumber.setBounds(70, 253, 178, 29);
		contentPane.add(lblPhoneNumber);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtPhoneNumber.setBackground(new Color(255, 153, 51));
		txtPhoneNumber.setBounds(70, 284, 296, 37);
		contentPane.add(txtPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblEmail.setBounds(70, 331, 135, 29);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtEmail.setBackground(new Color(255, 153, 51));
		txtEmail.setBounds(70, 362, 296, 37);
		contentPane.add(txtEmail);
		
		JLabel label_3 = new JLabel("Address:\r\n\r\n");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		label_3.setBounds(70, 409, 135, 29);
		contentPane.add(label_3);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		txtAddress.setColumns(10);
		txtAddress.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtAddress.setBackground(new Color(255, 153, 51));
		txtAddress.setBounds(70, 440, 296, 37);
		contentPane.add(txtAddress);
		
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
		button.setBounds(70, 604, 135, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Register");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.registrar(txtName.getText().toString(), txtLast.getText().toString(), txtPhoneNumber.getText().toString(), txtEmail.getText().toString(), txtbirthday.getDateFormatString().toString(), txtAddress.getText().toString(), "51° 30’ 30’’ N; 0° 7’ 32’’ O", fecha().toString(), 1);
				limpiar();
				client.setVisible(true);
				setVisible(false);
				client.tabla();
			}
		});
		button_1.setForeground(new Color(0, 102, 102));
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button_1.setBackground(new Color(204, 204, 204));
		button_1.setBounds(231, 604, 135, 50);
		contentPane.add(button_1);
		
		JLabel lblLastName = new JLabel("Last Name:\r\n");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblLastName.setBounds(70, 175, 135, 29);
		contentPane.add(lblLastName);
		
		txtLast = new JTextField();
		txtLast.setFont(new Font("Arial", Font.PLAIN, 20));
		txtLast.setColumns(10);
		txtLast.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtLast.setBackground(new Color(255, 153, 51));
		txtLast.setBounds(70, 206, 296, 37);
		contentPane.add(txtLast);
		
		JLabel lblBirthday = new JLabel("Birthday:");
		lblBirthday.setForeground(Color.WHITE);
		lblBirthday.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblBirthday.setBounds(70, 487, 135, 29);
		contentPane.add(lblBirthday);
		
		txtbirthday = new JDateChooser();
		txtbirthday.setBounds(70, 526, 296, 37);
		contentPane.add(txtbirthday);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
	
	public void limpiar() {
		txtAddress.setText("");
		txtName.setText("");
		txtEmail.setText("");
		txtLast.setText("");
		txtPhoneNumber.setText("");
	}
	
	public static String fecha(){
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("YYYY-MMM-dd");
		return formato.format(fecha);
	}
}
