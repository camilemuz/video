package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class user extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user frame = new user();
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
	public user() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 681);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBackground(new Color(51, 51, 102));
		panel.setBounds(0, 0, 1120, 89);
		contentPane.add(panel);
		
		JLabel lblVideoClub = new JLabel("VIDEO CLUB");
		lblVideoClub.setForeground(Color.WHITE);
		lblVideoClub.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 32));
		lblVideoClub.setBounds(59, 35, 230, 26);
		panel.add(lblVideoClub);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\stive\\Downloads\\cine (1).png"));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(1047, 10, 73, 71);
		panel.add(label);
		
		JPanel panel_botones = new JPanel();
		panel_botones.setBackground(new Color(255, 153, 51));
		panel_botones.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_botones.setBounds(30, 130, 264, 517);
		contentPane.add(panel_botones);
		panel_botones.setLayout(null);
		
		JButton btnClient = new JButton("Client");
		btnClient.setForeground(new Color(0, 102, 102));
		btnClient.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnClient.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnClient.setBackground(new Color(204, 204, 204));
		btnClient.setBounds(20, 53, 223, 50);
		panel_botones.add(btnClient);
		
		
		JButton btnVideo = new JButton("Video");
		btnVideo.setForeground(new Color(0, 102, 102));
		btnVideo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnVideo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnVideo.setBackground(new Color(204, 204, 204));
		btnVideo.setBounds(20, 126, 223, 50);
		panel_botones.add(btnVideo);
		
		JButton btnVideoLoan = new JButton("Video Loan");
		btnVideoLoan.setForeground(new Color(0, 102, 102));
		btnVideoLoan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnVideoLoan.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnVideoLoan.setBackground(new Color(204, 204, 204));
		btnVideoLoan.setBounds(20, 199, 223, 50);
		panel_botones.add(btnVideoLoan);
		
		JButton btnUser = new JButton("User");
		btnUser.setForeground(new Color(255, 255, 255));
		btnUser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnUser.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnUser.setBackground(new Color(51, 51, 51));
		btnUser.setBounds(20, 273, 223, 50);
		panel_botones.add(btnUser);
		
		JButton btnConfiguration = new JButton("Configuration");
		btnConfiguration.setForeground(new Color(0, 102, 102));
		btnConfiguration.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnConfiguration.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnConfiguration.setBackground(new Color(204, 204, 204));
		btnConfiguration.setBounds(20, 346, 223, 50);
		panel_botones.add(btnConfiguration);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(0, 102, 102));
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnExit.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnExit.setBackground(new Color(204, 204, 204));
		btnExit.setBounds(20, 421, 223, 50);
		panel_botones.add(btnExit);
		
		JPanel panel_user = new JPanel();
		panel_user.setLayout(null);
		panel_user.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_user.setBackground(new Color(255, 153, 51));
		panel_user.setBounds(304, 130, 806, 517);
		contentPane.add(panel_user);
		
		JLabel lbluser = new JLabel("USER");
		lbluser.setForeground(Color.WHITE);
		lbluser.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 32));
		lbluser.setBounds(38, 27, 235, 26);
		panel_user.add(lbluser);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.setForeground(new Color(0, 102, 102));
		btnAddUser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnAddUser.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnAddUser.setBackground(new Color(204, 204, 204));
		btnAddUser.setBounds(10, 65, 184, 36);
		panel_user.add(btnAddUser);
		
	
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\stive\\Downloads\\buscar.png"));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 32));
		label_1.setBounds(368, 27, 49, 36);
		panel_user.add(label_1);
		
		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(414, 27, 382, 30);
		panel_user.add(txtBuscar);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
}
