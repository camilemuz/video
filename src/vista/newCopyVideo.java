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
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;

public class newCopyVideo extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newCopyVideo frame = new newCopyVideo();
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
	public newCopyVideo() {
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
		
		JLabel lblRegisterClient = new JLabel("NEW COPY VIDEO");
		lblRegisterClient.setForeground(Color.WHITE);
		lblRegisterClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterClient.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterClient);
		
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
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(34, 82, 381, 589);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtFullName = new JTextField();
		txtFullName.setBounds(55, 96, 273, 28);
		panel_1.add(txtFullName);
		txtFullName.setFont(new Font("Arial", Font.PLAIN, 20));
		txtFullName.setColumns(10);
		txtFullName.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtFullName.setBackground(new Color(255, 153, 51));
		
		JLabel lblTitleMovie = new JLabel("Title movie:");
		lblTitleMovie.setBounds(30, 44, 155, 29);
		panel_1.add(lblTitleMovie);
		lblTitleMovie.setForeground(Color.WHITE);
		lblTitleMovie.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		JLabel lblNumberOfCoy = new JLabel("Number of copies:");
		lblNumberOfCoy.setForeground(Color.WHITE);
		lblNumberOfCoy.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNumberOfCoy.setBounds(30, 174, 223, 29);
		panel_1.add(lblNumberOfCoy);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(55, 228, 273, 35);
		panel_1.add(comboBox);
		setLocationRelativeTo(null);
			setUndecorated(true);
	}
}
