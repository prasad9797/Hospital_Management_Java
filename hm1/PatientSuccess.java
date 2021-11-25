package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientSuccess {

	private JFrame frame;
	static String temp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientSuccess window = new PatientSuccess();
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
	public PatientSuccess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientPanel = new JLabel("PATIENT PANEL");
		lblPatientPanel.setForeground(new Color(0, 0, 128));
		lblPatientPanel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblPatientPanel.setBounds(10, 24, 234, 25);
		frame.getContentPane().add(lblPatientPanel);
		
		JButton btnMyDetails = new JButton("My Details");
		btnMyDetails.setForeground(Color.BLACK);
		btnMyDetails.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnMyDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyDetailPatient.input(temp);
				MyDetailPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnMyDetails.setBounds(63, 99, 152, 23);
		frame.getContentPane().add(btnMyDetails);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnChangePassword.setForeground(Color.BLACK);
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePatientPassword.input(temp);
				ChangePatientPassword.main(new String[]{});
				frame.dispose();
			}
		});
		btnChangePassword.setBounds(329, 99, 165, 23);
		frame.getContentPane().add(btnChangePassword);
		
		JButton btnNewButton = new JButton("Book Appoinment");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookAppoinmentF1.input(temp);
				BookAppoinmentF1.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(63, 166, 152, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel Appoinment");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelAppoinment.input(temp);
				CancelAppoinment.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(329, 166, 165, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Appoinment");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAppoinmentPatient.input(temp);
				ViewAppoinmentPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(63, 236, 152, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogOut.setBounds(390, 28, 107, 23);
		frame.getContentPane().add(btnLogOut);
		
		JButton btnNewButton_3 = new JButton("View Prescription");
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewPrescriptionPatient.input(temp);
				ViewPrescriptionPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(329, 236, 165, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("1:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setBounds(36, 104, 17, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(36, 171, 17, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(36, 241, 17, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(302, 104, 17, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(302, 171, 17, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("6:");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBounds(302, 241, 17, 14);
		frame.getContentPane().add(lblNewLabel_5);
		frame.setBounds(100, 100, 554, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void input(String name) {
		
		temp=name;
//		System.out.println("input "+temp);
	}
}
