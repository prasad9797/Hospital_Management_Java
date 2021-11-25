package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDoctor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDoctor window = new AdminDoctor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminDoctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDoctorRegistration = new JButton("Doctor Registration");
		btnDoctorRegistration.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnDoctorRegistration.setForeground(Color.BLACK);
		btnDoctorRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DoctorRegister.main(new String[] {});
				frame.dispose();
			}
		});
		btnDoctorRegistration.setBounds(119, 105, 187, 23);
		frame.getContentPane().add(btnDoctorRegistration);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSuccess.main(new String[] {});
				frame.dispose();				
			}
		});
		btnBack.setBounds(150, 228, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnViewDoctor = new JButton("View Doctor");
		btnViewDoctor.setForeground(Color.BLACK);
		btnViewDoctor.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnViewDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewDoctor.main(new String[] {});
				frame.dispose();			
			}
		});
		btnViewDoctor.setBounds(119, 161, 187, 23);
		frame.getContentPane().add(btnViewDoctor);
		
		JLabel lblDoctorPanel = new JLabel("DOCTOR PANEL");
		lblDoctorPanel.setForeground(new Color(0, 0, 128));
		lblDoctorPanel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblDoctorPanel.setBounds(10, 31, 187, 29);
		frame.getContentPane().add(lblDoctorPanel);
		
		JLabel label = new JLabel("1:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Arial Black", Font.BOLD, 11));
		label.setBounds(85, 109, 24, 19);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2:");
		label_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(85, 166, 24, 14);
		frame.getContentPane().add(label_1);
	}
}
