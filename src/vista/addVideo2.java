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
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addVideo2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addVideo2 frame = new addVideo2();
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
	public addVideo2() {
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
		
		JLabel lblRegisterClient = new JLabel("REGISTER VIDEO");
		lblRegisterClient.setForeground(Color.WHITE);
		lblRegisterClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterClient.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterClient);
		
		JLabel lblTitleMovie = new JLabel("Actor:");
		lblTitleMovie.setForeground(Color.WHITE);
		lblTitleMovie.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblTitleMovie.setBounds(70, 186, 72, 29);
		contentPane.add(lblTitleMovie);
		
		txtFullName = new JTextField();
		txtFullName.setFont(new Font("Arial", Font.PLAIN, 20));
		txtFullName.setColumns(10);
		txtFullName.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtFullName.setBackground(new Color(255, 153, 51));
		txtFullName.setBounds(70, 138, 296, 37);
		contentPane.add(txtFullName);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 153, 51));
		comboBox.setBounds(70, 226, 123, 29);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("Title Movie:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial Black", Font.BOLD, 18));
		label.setBounds(70, 94, 160, 29);
		contentPane.add(label);
		
		JLabel lblYearOfPublication = new JLabel("Title Alternative:");
		lblYearOfPublication.setForeground(Color.WHITE);
		lblYearOfPublication.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblYearOfPublication.setBounds(70, 389, 225, 29);
		contentPane.add(lblYearOfPublication);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(255, 153, 51));
		comboBox_2.setBounds(70, 327, 123, 29);
		contentPane.add(comboBox_2);
		
		JLabel lblNomination = new JLabel("Nomination:");
		lblNomination.setForeground(Color.WHITE);
		lblNomination.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNomination.setBounds(70, 279, 135, 29);
		contentPane.add(lblNomination);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		textField.setBackground(new Color(255, 153, 51));
		textField.setBounds(70, 437, 296, 37);
		contentPane.add(textField);
		
		JButton btnOther = new JButton("Other?");		
		btnOther.setForeground(new Color(0, 102, 102));
		btnOther.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnOther.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnOther.setBackground(new Color(204, 204, 204));
		btnOther.setBounds(148, 534, 135, 50);
		contentPane.add(btnOther);
		setLocationRelativeTo(null);
			setUndecorated(true);
	}
}