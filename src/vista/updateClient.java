package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import com.toedter.calendar.JCalendar;
import javax.swing.border.LineBorder;

public class updateClient extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	private JTextField txtAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateClient frame = new updateClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public updateClient() {
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
		
		JLabel lblRegisterClient = new JLabel("UPDATE CLIENT");
		lblRegisterClient.setForeground(Color.WHITE);
		lblRegisterClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterClient.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterClient);
		
		JLabel label = new JLabel("Full Name:\r\n");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial Black", Font.BOLD, 20));
		label.setBounds(70, 94, 135, 29);
		contentPane.add(label);
		
		txtFullName = new JTextField();
		txtFullName.setFont(new Font("Arial", Font.PLAIN, 20));
		txtFullName.setColumns(10);
		txtFullName.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtFullName.setBackground(new Color(255, 153, 51));
		txtFullName.setBounds(70, 125, 296, 37);
		contentPane.add(txtFullName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPhoneNumber.setBounds(70, 172, 178, 29);
		contentPane.add(lblPhoneNumber);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtPhoneNumber.setBackground(new Color(255, 153, 51));
		txtPhoneNumber.setBounds(70, 203, 296, 37);
		contentPane.add(txtPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblEmail.setBounds(70, 250, 135, 29);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtEmail.setBackground(new Color(255, 153, 51));
		txtEmail.setBounds(70, 281, 296, 37);
		contentPane.add(txtEmail);
		
		JLabel label_3 = new JLabel("Address:\r\n\r\n");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		label_3.setBounds(70, 328, 135, 29);
		contentPane.add(label_3);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		txtAddress.setColumns(10);
		txtAddress.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtAddress.setBackground(new Color(255, 153, 51));
		txtAddress.setBounds(70, 359, 296, 37);
		contentPane.add(txtAddress);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(102, 418, 220, 152);
		contentPane.add(calendar);
		
		JCalendar calendar_1 = new JCalendar();
		calendar.getDayChooser().getDayPanel().add(calendar_1);
		
		JButton button = new JButton("Cancel");
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button.setBackground(new Color(204, 204, 204));
		button.setBounds(70, 604, 135, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Register");
		button_1.setForeground(new Color(0, 102, 102));
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button_1.setBackground(new Color(204, 204, 204));
		button_1.setBounds(231, 604, 135, 50);
		contentPane.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(34, 82, 381, 589);
		contentPane.add(panel_1);
		setLocationRelativeTo(null);
			setUndecorated(true);
	}
}
