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

import controlador.controladorConfiguracion;

public class gender extends JFrame {

	private JPanel contentPane;
	private JTextField txtGender;
	
	static configuration configuration = new configuration();
	static controladorConfiguracion configuracion = new controladorConfiguracion();
	
	public gender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBackground(new Color(51, 51, 102));
		panel.setBounds(0, 0, 455, 71);
		contentPane.add(panel);
		
		JLabel lblRegisterClient = new JLabel("REGISTER GENDER");
		lblRegisterClient.setBackground(new Color(51, 51, 51));
		lblRegisterClient.setForeground(Color.WHITE);
		lblRegisterClient.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 22));
		lblRegisterClient.setBounds(26, 23, 230, 26);
		panel.add(lblRegisterClient);
		
		JLabel lblFirstName = new JLabel("Gender:");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblFirstName.setBounds(58, 122, 135, 29);
		contentPane.add(lblFirstName);
		
		txtGender = new JTextField();
		txtGender.setFont(new Font("Arial", Font.PLAIN, 20));
		txtGender.setColumns(10);
		txtGender.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		txtGender.setBackground(new Color(255, 153, 51));
		txtGender.setBounds(58, 153, 296, 37);
		contentPane.add(txtGender);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configuration.setVisible(true);
				setVisible(false);
				configuration.tabla2();
			}
		});
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		button.setBackground(new Color(204, 204, 204));
		button.setBounds(10, 233, 135, 50);
		contentPane.add(button);
		
		JButton btnOther = new JButton("Other");
		btnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configuracion.registrar_gender(txtGender.getText().toString());
				limpiar();
				
			}
		});
		btnOther.setForeground(new Color(0, 102, 102));
		btnOther.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnOther.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnOther.setBackground(new Color(204, 204, 204));
		btnOther.setBounds(155, 233, 135, 50);
		contentPane.add(btnOther);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configuracion.registrar_gender(txtGender.getText().toString());
				configuration.setVisible(true);
				limpiar();
				setVisible(false);
				configuration.tabla2();
			}
		});
		btnFinish.setForeground(new Color(0, 102, 102));
		btnFinish.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnFinish.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnFinish.setBackground(new Color(204, 204, 204));
		btnFinish.setBounds(310, 233, 135, 50);
		contentPane.add(btnFinish);
		
		
		setLocationRelativeTo(null);
		setUndecorated(true);
	}

	public void limpiar() {
		txtGender.setText("");
	}
}
