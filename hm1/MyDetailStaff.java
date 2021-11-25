package hm1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyDetailStaff extends JFrame{
	
	static String temp;

	private JFrame frame;
	private String Gender="";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDetailStaff window = new MyDetailStaff();
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
	public MyDetailStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("input11 "+temp);
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 785, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientName = new JLabel("Staff Name");
		lblPatientName.setBounds(21, 55, 76, 20);
		frame.getContentPane().add(lblPatientName);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(107, 30, 86, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(255, 30, 86, 14);
		frame.getContentPane().add(lblLastName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(21, 114, 46, 14);
		frame.getContentPane().add(lblGender);

		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(21, 166, 76, 14);
		frame.getContentPane().add(lblDateOfBirth);

		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setBounds(21, 219, 76, 14);
		frame.getContentPane().add(lblBloodGroup);

		JLabel lblPhoneNumber = new JLabel("Phone Number 1");
		lblPhoneNumber.setBounds(400, 58, 103, 14);
		frame.getContentPane().add(lblPhoneNumber);

		JLabel lblNewLabel = new JLabel("Phone Number 2");
		lblNewLabel.setBounds(400, 114, 103, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(400, 166, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(400, 219, 113, 14);
		frame.getContentPane().add(lblAddress);

		JLabel lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setBounds(400, 284, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblProblem = new JLabel("Post");
		lblProblem.setBounds(21, 284, 59, 14);
		frame.getContentPane().add(lblProblem);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StaffSuccess.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setBounds(255, 527, 89, 23);
		frame.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(107, 55, 106, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(255, 55, 103, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(107, 163, 106, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(513, 55, 156, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(513, 111, 156, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(513, 163, 156, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(513, 216, 156, 43);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(513, 281, 156, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(107, 216, 106, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(107, 281, 106, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(107, 111, 106, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from staff where staffid=?");
			ps.setString(1,temp);
				ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String gender = rs.getString(4);
				String dob = rs.getString(5);
				String bloodgrp = rs.getString(6);
				String post=rs.getString(7);
				String phno1 = rs.getString(8);
				String phno2 = rs.getString(9);
				String email = rs.getString(10);
				String address = rs.getString(11);
				String city = rs.getString(12);
				
				textField.setText(fname);
				textField_1.setText(lname);
				textField_10.setText(gender);
				textField_8.setText(bloodgrp);
				textField_2.setText(dob);
	 			textField_9.setText(post);
				textField_3.setText(phno1);
				textField_4.setText(phno2);
				textField_5.setText(email);
				textField_6.setText(address);
				textField_7.setText(city);
				
				con.close();
		
	}}catch(Exception e){System.out.println(e);}
		}
	
	public static void input(String name) {
		
		temp=name;
		System.out.println("input1 "+temp);
	}
}
