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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class video extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscar;

	static client client = new client();
	static configuration configuration = new configuration();
	static videoLoan loan = new videoLoan();
	static user user = new user();
	
	public video() {
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
		btnClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				client.setVisible(true);
				setVisible(false);
			}
		});
		btnClient.setForeground(new Color(0, 102, 102));
		btnClient.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnClient.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnClient.setBackground(new Color(204, 204, 204));
		btnClient.setBounds(20, 53, 223, 50);
		panel_botones.add(btnClient);
		
		
		JButton btnVideo = new JButton("Video");
		btnVideo.setForeground(new Color(255, 255, 255));
		btnVideo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnVideo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnVideo.setBackground(new Color(51, 51, 51));
		btnVideo.setBounds(20, 126, 223, 50);
		panel_botones.add(btnVideo);
		
		JButton btnVideoLoan = new JButton("Video Loan");
		btnVideoLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loan.setVisible(true);
				setVisible(false);
			}
		});
		btnVideoLoan.setForeground(new Color(0, 102, 102));
		btnVideoLoan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnVideoLoan.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnVideoLoan.setBackground(new Color(204, 204, 204));
		btnVideoLoan.setBounds(20, 199, 223, 50);
		panel_botones.add(btnVideoLoan);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setVisible(true);
				setVisible(false);
			}
		});
		btnUser.setForeground(new Color(0, 102, 102));
		btnUser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnUser.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnUser.setBackground(new Color(204, 204, 204));
		btnUser.setBounds(20, 273, 223, 50);
		panel_botones.add(btnUser);
		
		JButton btnConfiguration = new JButton("Configuration");
		btnConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configuration.setVisible(true);
				setVisible(false);
			}
		});
		btnConfiguration.setForeground(new Color(0, 102, 102));
		btnConfiguration.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnConfiguration.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnConfiguration.setBackground(new Color(204, 204, 204));
		btnConfiguration.setBounds(20, 346, 223, 50);
		panel_botones.add(btnConfiguration);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(0, 102, 102));
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnExit.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnExit.setBackground(new Color(204, 204, 204));
		btnExit.setBounds(20, 421, 223, 50);
		panel_botones.add(btnExit);
		
		JPanel panel_video = new JPanel();
		panel_video.setLayout(null);
		panel_video.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_video.setBackground(new Color(255, 153, 51));
		panel_video.setBounds(304, 130, 806, 517);
		contentPane.add(panel_video);
		
		JLabel lblVideo = new JLabel("VIDEO");
		lblVideo.setForeground(Color.WHITE);
		lblVideo.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 32));
		lblVideo.setBounds(38, 27, 141, 26);
		panel_video.add(lblVideo);
		
		JButton btnAddVideo = new JButton("Add  Video");
		btnAddVideo.setForeground(new Color(0, 102, 102));
		btnAddVideo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnAddVideo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnAddVideo.setBackground(new Color(204, 204, 204));
		btnAddVideo.setBounds(10, 65, 184, 36);
		panel_video.add(btnAddVideo);
		

		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\stive\\Downloads\\buscar.png"));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 32));
		label_1.setBounds(368, 27, 49, 36);
		panel_video.add(label_1);
		
		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(414, 27, 382, 30);
		panel_video.add(txtBuscar);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}

}
