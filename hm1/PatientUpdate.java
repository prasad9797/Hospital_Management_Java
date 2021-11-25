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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;

public class PatientUpdate extends JFrame{
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private String Gender="";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	int check=0;
	String Ward;
	String patientid;
	/**
	 * Launch the application.
	 */
//	static int result;
	
	
	 
	// public static void recive(int Result)
	//	{
	//	 result=Result;
		//	System.out.println("33  "+result);
		//}
	 
	 
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientUpdate window = new PatientUpdate();
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
	public PatientUpdate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		//final WardBean WB=new WardBean();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 785, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setBounds(21, 135, 76, 14);
		frame.getContentPane().add(lblPatientName);
		
		final JTextField textField_8;
		textField_8 = new JTextField();
		textField_8.setBounds(168, 33, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(130, 132, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(271, 132, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(130, 107, 86, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(271, 105, 86, 14);
		frame.getContentPane().add(lblLastName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(21, 182, 46, 14);
		frame.getContentPane().add(lblGender);

		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setEnabled(false);
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gender = "Male";
			}
		});
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(130, 178, 53, 23);
		frame.getContentPane().add(rdbtnMale);

		final JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setEnabled(false);
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gender = "Female";
			}
		});
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(201, 178, 66, 23);
		frame.getContentPane().add(rdbtnFemale);

		final JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setEnabled(false);
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gender = "Other";
			}
		});
		buttonGroup.add(rdbtnOther);
		rdbtnOther.setBackground(Color.WHITE);
		rdbtnOther.setBounds(298, 178, 59, 23);
		frame.getContentPane().add(rdbtnOther);

		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(21, 219, 76, 14);
		frame.getContentPane().add(lblDateOfBirth);

		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(129, 216, 121, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		final JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));
		comboBox.setBounds(130, 264, 46, 20);
		frame.getContentPane().add(comboBox);

		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setBounds(21, 267, 76, 14);
		frame.getContentPane().add(lblBloodGroup);

		JLabel lblPhoneNumber = new JLabel("Phone Number 1");
		lblPhoneNumber.setBounds(446, 58, 99, 14);
		frame.getContentPane().add(lblPhoneNumber);

		JLabel lblNewLabel = new JLabel("Phone Number 2");
		lblNewLabel.setBounds(446, 114, 99, 14);
		frame.getContentPane().add(lblNewLabel);

		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(555, 55, 121, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBounds(555, 111, 121, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(446, 166, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setBounds(555, 163, 121, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(446, 219, 106, 14);
		frame.getContentPane().add(lblAddress);

		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setBounds(555, 203, 121, 46);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setBounds(446, 284, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setBounds(555, 281, 121, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JLabel lblProblem = new JLabel("Problem");
		lblProblem.setBounds(21, 359, 59, 14);
		frame.getContentPane().add(lblProblem);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "ALLERGY", "INTENSIVE CARE", "ANESTHESIOLOGY",
				"CARDIOLOGY", "ENT", "NEUROLOGY", "ORTHOPEDICS", "PATHALOGY", "RADIOLOGY", "SURGERY" }));
		comboBox_1.setBounds(130, 356, 137, 20);
		frame.getContentPane().add(comboBox_1);
		
		

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminPatient.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setBounds(255, 527, 89, 23);
		frame.getContentPane().add(btnBack);

		final JButton fName = new JButton("");
		fName.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		fName.setBackground(Color.WHITE);
		fName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Name Should Not Have Any Number OR Special Character");
			}
		});
		fName.setForeground(Color.WHITE);
		fName.setBounds(229, 139, 5, 5);
		frame.getContentPane().add(fName);

		final JButton lName = new JButton("New button");
		lName.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		lName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name Should Not Have Any Number OR Special Character");
			}
		});
		lName.setBounds(363, 139, 5, 5);
		frame.getContentPane().add(lName);

		final JButton phNO1 = new JButton("New button");
		phNO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Phone Number Should Be Of Ten Digits");
			}
		});
		phNO1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		phNO1.setBounds(694, 62, 5, 5);
		frame.getContentPane().add(phNO1);

		final JButton phNO2 = new JButton("New button");
		phNO2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Phone Number Should Be Of Ten Digits");
			}
		});
		phNO2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		phNO2.setBounds(694, 118, 5, 5);
		frame.getContentPane().add(phNO2);
		
		final JButton eMail = new JButton("New button");
		eMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Email Format Incorrect");
			}
		});
		eMail.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		eMail.setBounds(694, 170, 5, 5);
		frame.getContentPane().add(eMail);
		
		final JButton gEnder = new JButton("");
		gEnder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		gEnder.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		gEnder.setBounds(363, 191, 5, 5);
		frame.getContentPane().add(gEnder);
		
		final JButton Date = new JButton("New button");
		Date.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		Date.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		Date.setBounds(261, 170, 5, 5);
		frame.getContentPane().add(Date);
		
		final JButton aDDress = new JButton("New button");
		aDDress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		aDDress.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		aDDress.setBounds(694, 231, 5, 5);
		frame.getContentPane().add(aDDress);
		
		final JButton cIty = new JButton("New button");
		cIty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		cIty.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		cIty.setBounds(694, 288, 5, 5);
		frame.getContentPane().add(cIty);
		
		JLabel lblEnterPatientId = new JLabel("Enter Patient ID");
		lblEnterPatientId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterPatientId.setBounds(21, 31, 137, 20);
		frame.getContentPane().add(lblEnterPatientId);
		
		
	
		final JButton btnNewButton = new JButton("General 550 RS");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WardDeallocation.Set(patientid);
			//	System.out.println("322"+patientid);
			//	String PatID = Integer.toString(patientid);
				 Ward="General";
			//	WB.setiD(PatID);
			//	WB.setWarD(Ward);
			//int RooM =	WardSelection.main(Ward,PatID);
				//frame.dispose();
			//	WB.getRooM();
			//	System.out.println(""+PatID);
				//WardSelection WS=new WardSelection(Ward,PatID);
				WardSelection.input(Ward,patientid);
				WardSelection.main(new String[] {});
			//	frame.dispose();
				//int roOM=WardSelection.send();
			//	WardSelection.input(Ward,PatID);
			//	System.out.println("33 3 "+result);
			
			}
		});
		btnNewButton.setBounds(10, 454, 131, 23);
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Special 650 RS");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WardDeallocation.Set(patientid);
			//	String PatID = Integer.toString(patientid);
				 Ward="Special";
				WardSelection.input(Ward,patientid);
				WardSelection.main(new String[] {});
			//	frame.dispose();
			}
		});
		btnNewButton_1.setBounds(151, 454, 123, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("VIP 800 RS");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hi"+patientid);
				WardDeallocation.Set(patientid);
				System.out.println("bye");
			//	String PatID = Integer.toString(patientid);
				 Ward="VIP";
				WardSelection.input(Ward,patientid);
				WardSelection.main(new String[] {});
				
			}
		});
		btnNewButton_2.setBounds(282, 454, 99, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblSelectWard = new JLabel("Select Ward");
		lblSelectWard.setBounds(119, 411, 77, 14);
		frame.getContentPane().add(lblSelectWard);
		

		final JButton btnRegister = new JButton("REGISTER");
		btnRegister.setEnabled(false);
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
			//	String room = textField_9.getText();
				String ward = Ward;
				String bloodgrp = comboBox.getSelectedItem().toString();
				String problem = comboBox_1.getSelectedItem().toString();
				String gender = Gender;
				int found = 0;

				int j = Validation.isAplha(fname);
				if (fname.length() == 0 || j == 0) {
					fName.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
					found = 1;
				} else
					fName.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));

				j = Validation.isAplha(lname);
				if (lname.length() == 0 || j == 0) {
					lName.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
					found = 1;
				} else
					lName.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));

				j = Validation.isNumber(phno1);
				if (phno1.length() != 10 || j == 0) {
					found = 1;
					phNO1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					phNO1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));

				j = Validation.isNumber(phno2);
				if (phno2.length() != 10 || j == 0) {
					found = 1;
					phNO2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					phNO2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
				
				j=Validation.isEmail(email);
				if (j == 0) {
					found = 1;
					eMail.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					eMail.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
				
				if(Gender.length()==0) {
					found=1;
					gEnder.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					gEnder.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
				
				/*if(ward.length()==0) {
					found=1;
					wardNo.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					wardNo.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
				
				if(room.length()==0) {
					found=1;
					roomNo.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					roomNo.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
				*/
				if(dob.length()==0) {
					found=1;
					Date.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					Date.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
				
				if(address.length()==0) {
					found=1;
					aDDress.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					aDDress.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
				
				if(city.length()==0) {
					found=1;
					cIty.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				} else
					cIty.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));

				

				if (found == 0) {
					try{
						//String id=textField_8.getText();
						
						Connection con=DB.getConnection();
						
						PreparedStatement ps=con.prepareStatement("update patient set fname=?,lname=?, gender=?, bloodgrp=?, dob=?, phno1=?, phno2=?, email=?, problem=?, ward=?,room=null, address=?, city=? where patientid=?");
						ps.setString(1,fname);
						ps.setString(2,lname);
						ps.setString(3,gender);
						ps.setString(4,bloodgrp);
						ps.setString(5,dob);
						ps.setString(6,phno1);
						ps.setString(7,phno2);
						ps.setString(8,email);
						ps.setString(9,problem);
						ps.setString(10,ward);
						ps.setString(11,null);
						ps.setString(12,address);
						ps.setString(11,city);
						ps.setString(13,patientid);
						WardSelection.Set(patientid);
						JOptionPane.showMessageDialog(null,
								"Patient ID is:" + patientid + " Patient Record Updated Successfully!");
					//	ps.setString(2,Ward);
						//ps.setString(3,Room);
						ps.executeUpdate();
						con.close();
						
						//	JOptionPane.showMessageDialog(null, "Room Is Registered");

			
					}catch(Exception E){System.out.println(E);}
				} else {
					JOptionPane.showMessageDialog(null, "Sorry, unable to register!");
				}
			}
		});
		btnRegister.setBounds(386, 527, 106, 23);
		frame.getContentPane().add(btnRegister);
		
		JButton btnEdit = new JButton("UPDATE");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				patientid=textField_8.getText();
				if (patientid.length()!=0)
					check=1;
				else 
					check=0;
				System.out.println(""+patientid);
				
				if(check==1)
				{
					try{
					Connection con=DB.getConnection();
					PreparedStatement ps1=con.prepareStatement("select * from patient where patientid=?");
					ps1.setString(1,patientid);
					ResultSet rs=ps1.executeQuery();
					if(rs.next())
					{
						textField.setEnabled(true);
						textField_1.setEnabled(true);
						textField_2.setEnabled(true);
						textField_3.setEnabled(true);
						textField_4.setEnabled(true);
						textField_5.setEnabled(true);
						textField_6.setEnabled(true);
						textField_7.setEnabled(true);
						rdbtnMale.setEnabled(true);
						rdbtnFemale.setEnabled(true);
						rdbtnOther.setEnabled(true);
						comboBox.setEnabled(true);
						comboBox_1.setEnabled(true);
						btnNewButton.setEnabled(true);
						btnNewButton_1.setEnabled(true);
						btnNewButton_2.setEnabled(true);
						btnRegister.setEnabled(true);
					}
					else
						JOptionPane.showMessageDialog(null, "There Is No Such Patient ID");
					con.close();
					}catch(Exception e){System.out.println(e);}
				}
				else
					JOptionPane.showMessageDialog(null, "Field Cannot Be Empty");
			}
		});
		btnEdit.setBounds(271, 32, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		
		
		
		
		

		

		
	}
}
