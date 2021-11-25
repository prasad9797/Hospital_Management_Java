package hm1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DoctorSuccess {

	private JFrame frame;
	static String temp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorSuccess window = new DoctorSuccess();
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
	public DoctorSuccess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(151, 212, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton_1 = new JButton("Change Password");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangeDoctorPassword.input(temp);
				ChangeDoctorPassword.main(new String[]{});
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBounds(151, 165, 190, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblStaffPanel = new JLabel("DOCTOR PANEL");
		lblStaffPanel.setForeground(Color.WHITE);
		lblStaffPanel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblStaffPanel.setBounds(10, 23, 245, 23);
		frame.getContentPane().add(lblStaffPanel);
		
		JButton btnMyDetails = new JButton("My Details");
		btnMyDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyDetailDoctor.input(temp);
				MyDetailDoctor.main(new String[]{});
				frame.dispose();
			}
		});
		btnMyDetails.setBounds(151, 65, 190, 23);
		frame.getContentPane().add(btnMyDetails);
		
		JButton btnViewAppoinments = new JButton("View Appoinments");
		btnViewAppoinments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAppoinmentDoctor.input(temp);
				ViewAppoinmentDoctor.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewAppoinments.setBounds(151, 99, 190, 23);
		frame.getContentPane().add(btnViewAppoinments);
		
		JButton btnPrecriptionForPatient = new JButton("Prescription For Patient");
		btnPrecriptionForPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrescriptionDoctor.main(new String[]{});
				frame.dispose();
			}
		});
		btnPrecriptionForPatient.setBounds(151, 131, 190, 23);
		frame.getContentPane().add(btnPrecriptionForPatient);
		
		System.out.println("input "+temp);
	}
	
public static void input(String name) {
		
		temp=name;
		System.out.println("input "+temp);
	}

}
