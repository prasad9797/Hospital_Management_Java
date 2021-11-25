package hm1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class DoctorRegister {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorRegister window = new DoctorRegister();
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
	public DoctorRegister() {
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
		
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		JLabel lblPatientName = new JLabel("Doctor Name");
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

		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gender = "Male";
			}
		});
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(130, 110, 53, 23);
		frame.getContentPane().add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gender = "Female";
			}
		});
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(208, 110, 66, 23);
		frame.getContentPane().add(rdbtnFemale);

		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gender = "Other";
			}
		});
		buttonGroup.add(rdbtnOther);
		rdbtnOther.setBackground(Color.WHITE);
		rdbtnOther.setBounds(298, 110, 59, 23);
		frame.getContentPane().add(rdbtnOther);

		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(21, 166, 76, 14);
		frame.getContentPane().add(lblDateOfBirth);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));
		comboBox.setBounds(107, 216, 46, 20);
		frame.getContentPane().add(comboBox);

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

		JLabel lblProblem = new JLabel("Speciality");
		lblProblem.setBounds(21, 284, 59, 14);
		frame.getContentPane().add(lblProblem);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"GENERAL PHYSICIAN", "DENTIST", "KIDNEY", "CARDIOLOGIST", "NEUROLOGIST", "ORTHOPEDIST", "PATHALOGIST"}));
		comboBox_1.setBounds(107, 281, 156, 20);
		frame.getContentPane().add(comboBox_1);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminDoctor.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setBounds(255, 527, 89, 23);
		frame.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(107, 55, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(255, 55, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 163, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(513, 55, 156, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(513, 111, 156, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(513, 163, 156, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(513, 216, 156, 43);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(513, 281, 156, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		final JButton fName = new JButton("");
		fName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Name Should Not Have Any Number OR Special Character");
			}
		});
		fName.setForeground(Color.WHITE);
		fName.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		fName.setBounds(226, 66, 5, 5);
		frame.getContentPane().add(fName);

		final JButton lName = new JButton("New button");
		lName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name Should Not Have Any Number OR Special Character");
			}
		});
		lName.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		lName.setBounds(368, 62, 5, 5);
		frame.getContentPane().add(lName);

		final JButton phNO1 = new JButton("New button");
		phNO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Phone Number Should Be Of Ten Digits");
			}
		});
		phNO1.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		phNO1.setBounds(694, 62, 5, 5);
		frame.getContentPane().add(phNO1);

		final JButton phNO2 = new JButton("New button");
		phNO2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Phone Number Should Be Of Ten Digits");
			}
		});
		phNO2.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		phNO2.setBounds(694, 118, 5, 5);
		frame.getContentPane().add(phNO2);
		
		final JButton eMail = new JButton("New button");
		eMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Email Format Incorrect");
			}
		});
		eMail.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		eMail.setBounds(694, 170, 5, 5);
		frame.getContentPane().add(eMail);
		
		final JButton gEnder = new JButton("");
		gEnder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		gEnder.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		gEnder.setBounds(363, 114, 5, 5);
		frame.getContentPane().add(gEnder);
		
		final JButton Date = new JButton("New button");
		Date.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		Date.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		Date.setBounds(208, 170, 5, 5);
		frame.getContentPane().add(Date);
		
		final JButton aDDress = new JButton("New button");
		aDDress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		aDDress.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		aDDress.setBounds(694, 231, 5, 5);
		frame.getContentPane().add(aDDress);
		
		final JButton cIty = new JButton("New button");
		cIty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		cIty.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		cIty.setBounds(694, 288, 5, 5);
		frame.getContentPane().add(cIty);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(21, 362, 59, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(107, 359, 106, 20);
		frame.getContentPane().add(passwordField);
		
		final JButton passworD = new JButton("");
		passworD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		passworD.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/white.jpg")));
		passworD.setBounds(226, 371, 5, 5);
		frame.getContentPane().add(passworD);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname = textField.getText();
				String lname = textField_1.getText();
				String dob = textField_2.getText();
				String phno1 = textField_3.getText();
				String phno2 = textField_4.getText();
				String email = textField_5.getText();
				String address = textField_6.getText();
				String city = textField_7.getText();
				String bloodgrp = comboBox.getSelectedItem().toString();
				String specility = comboBox_1.getSelectedItem().toString();
				String gender = Gender;
				String password=String.valueOf(passwordField.getPassword());
				int found = 0;
				
				int j = Validation.isAplha(fname);
				if (fname.length() == 0 || j == 0) {
					fName.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
					found = 1;
				} else
					fName.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));

				j = Validation.isAplha(lname);
				if (lname.length() == 0 || j == 0) {
					lName.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
					found = 1;
				} else
					lName.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));

				j = Validation.isNumber(phno1);
				if (phno1.length() != 10 || j == 0) {
					found = 1;
					phNO1.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					phNO1.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));

				j = Validation.isNumber(phno2);
				if (phno2.length() != 10 || j == 0) {
					found = 1;
					phNO2.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					phNO2.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));
				
				j=Validation.isEmail(email);
				if (j == 0) {
					found = 1;
					eMail.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					eMail.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));
				
				if(Gender.length()==0) {
					found=1;
					gEnder.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					gEnder.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));
				
				if(dob.length()==0) {
					found=1;
					Date.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					Date.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));
				
				if(address.length()==0) {
					found=1;
					aDDress.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					aDDress.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));
				
				if(city.length()==0) {
					found=1;
					cIty.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					cIty.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));
				
				if(password.length()==0) {
					found=1;
					passworD.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/red.png")));
				} else
					passworD.setIcon(new ImageIcon(StaffRegister.class.getResource("/hm1/green.jpg")));

				int doctorid = 0;
				doctorid = (int) ((Math.random() * 9000) + 1000);
				
				if (found == 0) {
				int i = DoctorDao.register(doctorid, fname, lname, gender, dob, bloodgrp, specility, phno1, phno2, email, address, city,password);
				if (i > 0 && found == 0) {
					JOptionPane.showMessageDialog(null,
							"Doctor ID is:" + doctorid + " Doctor added successfully!");
				} else {
					JOptionPane.showMessageDialog(null, "Sorry, unable to register!");
				}
				}
				 else {
						JOptionPane.showMessageDialog(null, "Sorry, unable to register!");
					}
			} 
			
		});
		btnRegister.setBounds(415, 527, 129, 23);
		frame.getContentPane().add(btnRegister);
		
		
	}

}
