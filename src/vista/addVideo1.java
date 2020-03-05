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

public class addVideo1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addVideo1 frame = new addVideo1();
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
	public addVideo1() {
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
		
		JLabel lblTitleMovie = new JLabel("Movie Gender:");
		lblTitleMovie.setForeground(Color.WHITE);
		lblTitleMovie.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblTitleMovie.setBounds(135, 189, 160, 29);
		contentPane.add(lblTitleMovie);
		
		txtFullName = new JTextField();
		txtFullName.setFont(new Font("Arial", Font.PLAIN, 20));
		txtFullName.setColumns(10);
		txtFullName.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtFullName.setBackground(new Color(255, 153, 51));
		txtFullName.setBounds(70, 125, 296, 37);
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
		comboBox.setBounds(125, 232, 170, 29);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 153, 51));
		comboBox_1.setBounds(125, 332, 170, 29);
		contentPane.add(comboBox_1);
		
		JLabel label = new JLabel("Title Movie:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial Black", Font.BOLD, 18));
		label.setBounds(70, 94, 160, 29);
		contentPane.add(label);
		
		JLabel lblYearOfPublication = new JLabel("Year of Publication:");
		lblYearOfPublication.setForeground(Color.WHITE);
		lblYearOfPublication.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblYearOfPublication.setBounds(106, 289, 225, 29);
		contentPane.add(lblYearOfPublication);
		
		JSpinner spinner = new JSpinner();
		spinner.setBackground(new Color(255, 153, 51));
		spinner.setBounds(49, 414, 104, 25);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBackground(new Color(255, 153, 51));
		spinner_1.setBounds(245, 414, 104, 25);
		contentPane.add(spinner_1);
		
		JLabel lblMovieTime = new JLabel("Movie Time:");
		lblMovieTime.setForeground(Color.WHITE);
		lblMovieTime.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblMovieTime.setBounds(39, 372, 135, 29);
		contentPane.add(lblMovieTime);
		
		JLabel lblNumberOfCopies = new JLabel("Number of Copies:");
		lblNumberOfCopies.setForeground(Color.WHITE);
		lblNumberOfCopies.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNumberOfCopies.setBounds(215, 372, 198, 29);
		contentPane.add(lblNumberOfCopies);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setForeground(Color.WHITE);
		lblCost.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblCost.setBounds(169, 464, 61, 29);
		contentPane.add(lblCost);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBackground(new Color(255, 153, 51));
		spinner_2.setBounds(150, 504, 104, 25);
		contentPane.add(spinner_2);
		setLocationRelativeTo(null);
			setUndecorated(true);
	}
}
