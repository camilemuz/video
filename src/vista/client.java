package vista;



import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controlador.Conectorbd;
import net.proteanit.sql.DbUtils;


import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class client extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscar;
	private JTable table;
	
	static video video = new video();
	static videoLoan loan = new videoLoan();
	static configuration configuration = new configuration();
	static user user = new user();
	static addClient addClient = new addClient();
	static blockClient blockClient = new blockClient();
	
	public client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 681);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
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
		btnClient.setForeground(new Color(255, 255, 255));
		btnClient.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnClient.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnClient.setBackground(new Color(51, 51, 51));
		btnClient.setBounds(20, 53, 223, 50);
		panel_botones.add(btnClient);
		
		JButton btnVideo = new JButton("Video");
		btnVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				video.setVisible(true);
				setVisible(false);
			}
		});
		btnVideo.setForeground(new Color(0, 102, 102));
		btnVideo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnVideo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnVideo.setBackground(new Color(204, 204, 204));
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
		
		JPanel panel_cliente = new JPanel();
		panel_cliente.setLayout(null);
		panel_cliente.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_cliente.setBackground(new Color(255, 153, 51));
		panel_cliente.setBounds(304, 130, 806, 517);
		contentPane.add(panel_cliente);
		
		JLabel lblClient = new JLabel("CLIENT");
		lblClient.setForeground(Color.WHITE);
		lblClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 32));
		lblClient.setBounds(38, 27, 141, 26);
		panel_cliente.add(lblClient);
		
		JButton btnAddClient = new JButton("Add  Client");
		btnAddClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addClient.setVisible(true);
				setVisible(false);
			}
		});
		btnAddClient.setForeground(new Color(0, 102, 102));
		btnAddClient.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnAddClient.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnAddClient.setBackground(new Color(204, 204, 204));
		btnAddClient.setBounds(10, 65, 184, 36);
		panel_cliente.add(btnAddClient);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(414, 27, 382, 30);
		panel_cliente.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel lblicono = new JLabel("");
		lblicono.setIcon(new ImageIcon("C:\\Users\\stive\\Downloads\\buscar.png"));
		lblicono.setForeground(Color.WHITE);
		lblicono.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 32));
		lblicono.setBounds(368, 27, 49, 36);
		panel_cliente.add(lblicono);
		
		
		table=new JTable(){
			public boolean isCellEditable(int rowIndex,int colIndex){
				return false;
			}
		};
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 130, 786, 377);
		panel_cliente.add(scrollPane);
		
		JButton btnBlockClient = new JButton("Block  Client");
		btnBlockClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blockClient.setVisible(true);
				setVisible(false);
			}
		});
		btnBlockClient.setForeground(new Color(0, 102, 102));
		btnBlockClient.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBlockClient.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnBlockClient.setBackground(new Color(204, 204, 204));
		btnBlockClient.setBounds(220, 65, 184, 36);
		panel_cliente.add(btnBlockClient);
		
		
		tabla();
		
	}
	
	public void tabla(){
		
		Conectorbd conector = new Conectorbd();
		Connection c = conector.conexion();
			try {
				String SqlRecuperar ="SELECT id_client,first_name,last_name,cellphone,mail,address_client from client_management";
				PreparedStatement pst = (PreparedStatement) c.prepareStatement(SqlRecuperar);
				ResultSet rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
			} catch (Exception e) {
				System.out.println(e);
		      }
		}
}
