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

public class newLoan2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newLoan2 frame = new newLoan2();
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
	public newLoan2() {
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
		
		JLabel lblRegisterClient = new JLabel("VIDEO LOAN");
		lblRegisterClient.setForeground(Color.WHITE);
		lblRegisterClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterClient.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterClient);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(34, 82, 381, 567);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTitleMovie = new JLabel("Return date:");
		lblTitleMovie.setBounds(23, 213, 155, 29);
		panel_1.add(lblTitleMovie);
		lblTitleMovie.setForeground(Color.WHITE);
		lblTitleMovie.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 153, 51));
		comboBox.setBounds(44, 73, 273, 35);
		panel_1.add(comboBox);
		
		JButton button = new JButton("Cancel");
		button.setBounds(10, 489, 135, 50);
		panel_1.add(button);
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button.setBackground(new Color(204, 204, 204));
		
		JButton btnNext = new JButton("Finish");
		btnNext.setBounds(207, 489, 135, 50);
		panel_1.add(btnNext);
		btnNext.setForeground(new Color(0, 102, 102));
		btnNext.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNext.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnNext.setBackground(new Color(204, 204, 204));
		
		JLabel label = new JLabel("Video:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial Black", Font.BOLD, 20));
		label.setBounds(23, 33, 155, 29);
		panel_1.add(label);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 153, 51));
		comboBox_1.setBounds(44, 167, 273, 35);
		panel_1.add(comboBox_1);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(91, 254, 184, 153);
		panel_1.add(calendar);
		
		JLabel label_1 = new JLabel("Days of lan:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		label_1.setBounds(23, 119, 155, 29);
		panel_1.add(label_1);
		
		JButton btnOther = new JButton("Other?");
		btnOther.setForeground(new Color(0, 102, 102));
		btnOther.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnOther.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnOther.setBackground(new Color(204, 204, 204));
		btnOther.setBounds(112, 433, 135, 50);
		panel_1.add(btnOther);
		setLocationRelativeTo(null);
			setUndecorated(true);
	}
}
