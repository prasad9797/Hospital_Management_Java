package hm1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminPatient {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPatient window = new AdminPatient();
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
	public AdminPatient() {
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
		
		JButton btnPatientRegistration = new JButton("Patient Registration");
		btnPatientRegistration.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnPatientRegistration.setForeground(Color.BLACK);
		btnPatientRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientRegister.main(new String[]{});
				frame.dispose();
			}
		});
		btnPatientRegistration.setBounds(105, 98, 193, 23);
		frame.getContentPane().add(btnPatientRegistration);
		
		JButton btnViewPatientRecord = new JButton("View Patient Record");
		btnViewPatientRecord.setForeground(Color.BLACK);
		btnViewPatientRecord.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnViewPatientRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewPatientRecord.setBounds(105, 132, 193, 23);
		frame.getContentPane().add(btnViewPatientRecord);
		
		JButton btnSearchPatientRecord = new JButton("Search Patient Record");
		btnSearchPatientRecord.setForeground(Color.BLACK);
		btnSearchPatientRecord.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnSearchPatientRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnSearchPatientRecord.setBounds(105, 166, 193, 23);
		frame.getContentPane().add(btnSearchPatientRecord);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(323, 28, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("Update Patient Record");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientUpdate.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(105, 200, 193, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblAdminPatientPanel = new JLabel("ADMIN PATIENT PANEL");
		lblAdminPatientPanel.setBackground(new Color(0, 0, 128));
		lblAdminPatientPanel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblAdminPatientPanel.setForeground(new Color(0, 0, 128));
		lblAdminPatientPanel.setBounds(10, 26, 275, 23);
		frame.getContentPane().add(lblAdminPatientPanel);
		
		JLabel label = new JLabel("1:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Arial Black", Font.BOLD, 11));
		label.setBounds(74, 103, 21, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("2:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setBounds(74, 137, 21, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("3:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_1.setBounds(74, 171, 21, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("4:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(74, 205, 21, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
