package hm1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class SearchPatient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	//private JTextField textField_8;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPatient window = new SearchPatient();
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
	public SearchPatient() {
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
		lblPatientName.setBounds(21, 163, 76, 20);
		frame.getContentPane().add(lblPatientName);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(130, 138, 86, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(271, 138, 86, 14);
		frame.getContentPane().add(lblLastName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(21, 206, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setBounds(21, 304, 76, 14);
		frame.getContentPane().add(lblBloodGroup);

		JLabel lblPhoneNumber = new JLabel("Phone Number 1");
		lblPhoneNumber.setBounds(429, 58, 103, 14);
		frame.getContentPane().add(lblPhoneNumber);

		JLabel lblNewLabel = new JLabel("Phone Number 2");
		lblNewLabel.setBounds(429, 114, 103, 14);
		frame.getContentPane().add(lblNewLabel);		

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(429, 166, 63, 14);
		frame.getContentPane().add(lblNewLabel_1);	

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(429, 219, 103, 14);
		frame.getContentPane().add(lblAddress);		

		JLabel lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setBounds(429, 284, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblProblem = new JLabel("Problem");
		lblProblem.setBounds(21, 359, 59, 14);
		frame.getContentPane().add(lblProblem);
		
		JLabel lblRoom = new JLabel("Room");
		lblRoom.setBounds(21, 458, 46, 14);
		frame.getContentPane().add(lblRoom);

		JLabel lblWard = new JLabel("Ward");
		lblWard.setBounds(21, 411, 86, 14);
		frame.getContentPane().add(lblWard);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 163, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(271, 163, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 203, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(130, 253, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(542, 55, 147, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(542, 111, 147, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(542, 163, 147, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(542, 216, 147, 54);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(542, 281, 147, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(105, 356, 86, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(105, 408, 86, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(105, 455, 86, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblEnterPatientId = new JLabel("Enter Patient ID");
		lblEnterPatientId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterPatientId.setBounds(21, 44, 126, 28);
		frame.getContentPane().add(lblEnterPatientId);
		
		textField_16 = new JTextField();
		textField_16.setBounds(157, 50, 86, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(21, 256, 89, 14);
		frame.getContentPane().add(lblDateOfBirth);
		
		textField_7 = new JTextField();
		textField_7.setBounds(130, 298, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(284, 542, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String id= textField_16.getText();
					Connection con=DB.getConnection();
					PreparedStatement ps=con.prepareStatement("select * from patient where patientid=?");
					ps.setString(1,id);
					ResultSet rs=ps.executeQuery();
					if(rs.next()) {
						String fname = rs.getString(2);
						String lname = rs.getString(3);
						String gender = rs.getString(4);
						String bloodgrp = rs.getString(5);
						String dob = rs.getString(6);
						String phno1 = rs.getString(7);
						String phno2 = rs.getString(8);
						String email = rs.getString(9);
						String problem = rs.getString(10);
						String ward = rs.getString(11);
						String room = rs.getString(12);
						String address = rs.getString(13);
						String city = rs.getString(14);
						
						textField_2.setText(fname);
						textField_3.setText(lname);
						textField_4.setText(gender);
						textField_5.setText(bloodgrp);
						textField_7.setText(dob);
						textField_6.setText(phno1);
						textField_9.setText(phno2);
						textField_10.setText(email);
						textField_13.setText(problem);
						textField_14.setText(ward);
						textField_15.setText(room);
						textField_11.setText(address);
						textField_12.setText(city);
					}
					else {

		                JOptionPane.showMessageDialog(null, "Name not Found");

		            }

					con.close();
				}catch(Exception e){System.out.println(e);}
			}
		});
		btnSearch.setBounds(429, 542, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		

	}

}
