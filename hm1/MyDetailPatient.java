package hm1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyDetailPatient {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	private JFrame frame;
	static String temp;
	private JTextField textField_7;
	private JTextField textField_7_1;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDetailPatient window = new MyDetailPatient();
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
	public MyDetailPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 785, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setBounds(21, 90, 76, 20);
		frame.getContentPane().add(lblPatientName);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(130, 90, 106, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(274, 90, 99, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(130, 65, 86, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(274, 65, 86, 14);
		frame.getContentPane().add(lblLastName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(21, 138, 46, 14);
		frame.getContentPane().add(lblGender);

		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(21, 185, 76, 14);
		frame.getContentPane().add(lblDateOfBirth);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(130, 182, 106, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setBounds(21, 235, 76, 14);
		frame.getContentPane().add(lblBloodGroup);

		JLabel lblPhoneNumber = new JLabel("Phone Number 1");
		lblPhoneNumber.setBounds(446, 58, 99, 14);
		frame.getContentPane().add(lblPhoneNumber);

		JLabel lblNewLabel = new JLabel("Phone Number 2");
		lblNewLabel.setBounds(446, 114, 99, 14);
		frame.getContentPane().add(lblNewLabel);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(555, 55, 121, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(555, 111, 121, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(446, 166, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(555, 163, 121, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(446, 219, 106, 14);
		frame.getContentPane().add(lblAddress);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(555, 203, 121, 46);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setBounds(446, 284, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(555, 281, 121, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JLabel lblProblem = new JLabel("Problem");
		lblProblem.setBounds(21, 284, 59, 14);
		frame.getContentPane().add(lblProblem);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientSuccess.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setBounds(255, 527, 89, 23);
		frame.getContentPane().add(btnBack);
		
		textField_7_1 = new JTextField();
		textField_7_1.setEditable(false);
		textField_7_1.setBounds(130, 135, 106, 20);
		frame.getContentPane().add(textField_7_1);
		textField_7_1.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(130, 232, 106, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(130, 281, 106, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(130, 11, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblPatientId = new JLabel("Patient ID");
		lblPatientId.setBounds(21, 14, 76, 14);
		frame.getContentPane().add(lblPatientId);
		
		JLabel lblNewLabel_3 = new JLabel("Ward");
		lblNewLabel_3.setBounds(21, 333, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(130, 330, 106, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Room");
		lblNewLabel_4.setBounds(21, 381, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(130, 378, 106, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fees");
		lblNewLabel_5.setBounds(446, 381, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setBounds(555, 378, 121, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Date OF Admit");
		lblNewLabel_6.setBounds(446, 333, 99, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBounds(555, 330, 121, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from patient where patientid=?");
			ps.setString(1,temp);
				ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String gender = rs.getString(4);
				String dob = rs.getString(5);
				String bloodgrp = rs.getString(6);				
				String phno1 = rs.getString(7);
				String phno2 = rs.getString(8);
				String email = rs.getString(9);
				String problem=rs.getString(10);
				String ward = rs.getString(11);
				String room = rs.getString(12);
				String address = rs.getString(13);
				String city = rs.getString(14);
				String password = rs.getString(15);
				String fees = rs.getString(16);
				String doa = rs.getString(17);
				
				
				textField.setText(fname);
				textField_1.setText(lname);
				textField_7_1.setText(gender);
				textField_8.setText(bloodgrp);
				textField_2.setText(dob);
	 			textField_9.setText(problem);
				textField_3.setText(phno1);
				textField_4.setText(phno2);
				textField_5.setText(email);
				textField_6.setText(address);
				textField_7.setText(city);
				textField_11.setText(temp);
				textField_12.setText(ward);
				textField_13.setText(room);
				textField_14.setText(fees);
				textField_15.setText(doa);
				
				con.close();
		
	}}catch(Exception e){System.out.println(e);}
	}
	
	
	public static void input(String name) {
		
		temp=name;
		System.out.println("input "+temp);
	}
}
