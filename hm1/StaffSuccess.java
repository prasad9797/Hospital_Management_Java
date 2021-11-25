package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class StaffSuccess {

	private JFrame frame;
	static String temp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSuccess window = new StaffSuccess();
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
	public StaffSuccess() {
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
				StaffPatientRegister.main(new String[]{});
				frame.dispose();
			}
		});
		btnPatientRegistration.setBounds(140, 109, 190, 23);
		frame.getContentPane().add(btnPatientRegistration);
		
		JButton btnBack = new JButton("LOG OUT");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(298, 26, 102, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("View Patient");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("input "+temp);
				StaffViewPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(140, 143, 190, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Change Password");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangeStaffPassword.input(temp);
				ChangeStaffPassword.main(new String[]{});
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBounds(140, 177, 190, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblStaffPanel = new JLabel("STAFF PANEL");
		lblStaffPanel.setForeground(new Color(0, 0, 128));
		lblStaffPanel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblStaffPanel.setBounds(10, 23, 145, 23);
		frame.getContentPane().add(lblStaffPanel);
		
		JButton btnMyDetails = new JButton("My Details");
		btnMyDetails.setForeground(Color.BLACK);
		btnMyDetails.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnMyDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyDetailStaff.input(temp);
				MyDetailStaff.main(new String[]{});
				frame.dispose();
			}
		});
		btnMyDetails.setBounds(140, 75, 190, 23);
		frame.getContentPane().add(btnMyDetails);
		
		JButton btnBilling = new JButton("Billing");
		btnBilling.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBilling.setForeground(Color.BLACK);
		btnBilling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Billing.main(new String[]{});
				frame.dispose();
			}
		});
		btnBilling.setBounds(140, 211, 190, 23);
		frame.getContentPane().add(btnBilling);
		
		JLabel lblNewLabel = new JLabel("1:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(108, 80, 22, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_1.setBounds(108, 114, 22, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(108, 148, 22, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4:");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3.setBounds(108, 182, 22, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(108, 216, 22, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		System.out.println("input "+temp);
	}
	
	public static void input(String name) {
		
		temp=name;
		System.out.println("input "+temp);
	}
}
