package hm1;

//import hm1.WardBean;
import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PatientRegister {

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
	
	String Ward;
	String Fees="0";
	static int Found;
	/**
	 * Launch the application.
	 */
	static int result;
	private JPasswordField passwordField;
	
	 
	 public static void recive(int Result)
		{
		 result=Result;
			System.out.println("33  "+result);
		}
	 
	 
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientRegister window = new PatientRegister();
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
	public PatientRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		//final WardBean WB=new WardBean();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 785, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		final int patientid;
		patientid = (int) ((Math.random() * 9000) + 1000);

		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setForeground(Color.BLACK);
		lblPatientName.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblPatientName.setBounds(10, 122, 106, 20);
		frame.getContentPane().add(lblPatientName);

		textField = new JTextField();
		textField.setBounds(139, 122, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(271, 122, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblFirstName.setForeground(Color.BLACK);
		lblFirstName.setBounds(139, 97, 86, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblLastName.setForeground(Color.BLACK);
		lblLastName.setBounds(271, 97, 86, 14);
		frame.getContentPane().add(lblLastName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblGender.setBounds(10, 170, 106, 14);
		frame.getContentPane().add(lblGender);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(Color.BLACK);
		rdbtnMale.setFont(new Font("Arial Black", Font.BOLD, 11));
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gender = "Male";
			}
		});
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBackground(Color.DARK_GRAY);
		rdbtnMale.setBounds(139, 165, 86, 23);
		frame.getContentPane().add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(Color.BLACK);
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 11));
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gender = "Female";
			}
		});
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBackground(Color.DARK_GRAY);
		rdbtnFemale.setBounds(271, 166, 86, 23);
		frame.getContentPane().add(rdbtnFemale);

		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setForeground(Color.BLACK);
		lblDateOfBirth.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblDateOfBirth.setBounds(10, 207, 99, 14);
		frame.getContentPane().add(lblDateOfBirth);

		textField_2 = new JTextField();
		textField_2.setBounds(139, 205, 121, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		final JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 11));
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));
		comboBox.setBounds(139, 247, 86, 20);
		frame.getContentPane().add(comboBox);

		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblBloodGroup.setForeground(Color.BLACK);
		lblBloodGroup.setBounds(10, 250, 106, 14);
		frame.getContentPane().add(lblBloodGroup);

		JLabel lblPhoneNumber = new JLabel("Phone Number 1");
		lblPhoneNumber.setForeground(Color.BLACK);
		lblPhoneNumber.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblPhoneNumber.setBounds(446, 126, 131, 14);
		frame.getContentPane().add(lblPhoneNumber);

		JLabel lblNewLabel = new JLabel("Phone Number 2");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setBounds(446, 171, 131, 14);
		frame.getContentPane().add(lblNewLabel);

		textField_3 = new JTextField();
		textField_3.setBounds(609, 126, 121, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(609, 168, 121, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_1.setBounds(446, 212, 110, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField_5 = new JTextField();
		textField_5.setBounds(609, 209, 121, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblAddress.setBounds(446, 251, 106, 14);
		frame.getContentPane().add(lblAddress);

		textField_6 = new JTextField();
		textField_6.setBounds(609, 250, 121, 46);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(446, 317, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_7 = new JTextField();
		textField_7.setBounds(609, 314, 121, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JLabel lblProblem = new JLabel("Problem");
		lblProblem.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblProblem.setForeground(Color.BLACK);
		lblProblem.setBounds(10, 301, 99, 14);
		frame.getContentPane().add(lblProblem);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "ALLERGY", "INTENSIVE CARE", "ANESTHESIOLOGY",
				"CARDIOLOGY", "ENT", "NEUROLOGY", "ORTHOPEDICS", "PATHALOGY", "RADIOLOGY", "SURGERY" }));
		comboBox_1.setBounds(137, 298, 150, 20);
		frame.getContentPane().add(comboBox_1);

		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminPatient.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setBounds(628, 20, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblPassword.setBounds(446, 375, 99, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(609, 372, 121, 20);
		frame.getContentPane().add(passwordField);	

		final JButton fName = new JButton("");
		fName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Name Should Not Have Any Number OR Special Character");
			}
		});
		fName.setForeground(Color.WHITE);
		fName.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		fName.setBounds(235, 137, 5, 5);
		frame.getContentPane().add(fName);

		final JButton lName = new JButton("New button");
		lName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name Should Not Have Any Number OR Special Character");
			}
		});
		lName.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		lName.setBounds(376, 129, 5, 5);
		frame.getContentPane().add(lName);

		final JButton phNO1 = new JButton("New button");
		phNO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Phone Number Should Be Of Ten Digits");
			}
		});
		phNO1.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		phNO1.setBounds(740, 133, 5, 5);
		frame.getContentPane().add(phNO1);

		final JButton phNO2 = new JButton("New button");
		phNO2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Phone Number Should Be Of Ten Digits");
			}
		});
		phNO2.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		phNO2.setBounds(739, 185, 5, 5);
		frame.getContentPane().add(phNO2);
		
		final JButton eMail = new JButton("New button");
		eMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Email Format Incorrect");
			}
		});
		eMail.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		eMail.setBounds(740, 212, 5, 5);
		frame.getContentPane().add(eMail);
		
		final JButton gEnder = new JButton("");
		gEnder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		gEnder.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		gEnder.setBounds(376, 170, 5, 5);
		frame.getContentPane().add(gEnder);
		
		final JButton Date = new JButton("New button");
		Date.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		Date.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		Date.setBounds(282, 212, 5, 5);
		frame.getContentPane().add(Date);
		
		final JButton aDDress = new JButton("New button");
		aDDress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		aDDress.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		aDDress.setBounds(740, 270, 5, 5);
		frame.getContentPane().add(aDDress);
		
		final JButton cIty = new JButton("New button");
		cIty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Field Cannot Be Left Empty");
			}
		});
		cIty.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/white.jpg")));
		cIty.setBounds(740, 322, 5, 5);
		frame.getContentPane().add(cIty);
	
		JButton btnNewButton = new JButton("General 550 RS");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(""+patientid);
				String PatID = Integer.toString(patientid);
				 Ward="General";
			//	WB.setiD(PatID);
			//	WB.setWarD(Ward);
			//int RooM =	WardSelection.main(Ward,PatID);
				//frame.dispose();
			//	WB.getRooM();
			//	System.out.println(""+PatID);
				//WardSelection WS=new WardSelection(Ward,PatID);
				WardSelection.input(Ward,PatID);
				WardSelection.main(new String[] {});
			//	frame.dispose();
				//int roOM=WardSelection.send();
			//	WardSelection.input(Ward,PatID);
				//System.out.println("33 3 "+result);
				Fees="550";
			}
		});
		btnNewButton.setBounds(10, 407, 144, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Special 650 RS");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PatID = Integer.toString(patientid);
				 Ward="Special";
				WardSelection.input(Ward,PatID);
				WardSelection.main(new String[] {});
				Fees="650";
			//	frame.dispose();
			}
		});
		btnNewButton_1.setBounds(164, 407, 146, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("VIP 800 RS");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PatID = Integer.toString(patientid);
				 Ward="VIP";
				WardSelection.input(Ward,PatID);
				WardSelection.main(new String[] {});
				System.out.println("Room CHeck 1 "+Found);
				Fees="800";
				
			}
		});
		btnNewButton_2.setBounds(322, 407, 114, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblSelectWard = new JLabel("Select Ward");
		lblSelectWard.setForeground(Color.BLACK);
		lblSelectWard.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblSelectWard.setBounds(109, 359, 131, 14);
		frame.getContentPane().add(lblSelectWard);
		

		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Found==0)
					Fees="0";
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
				String password=String.valueOf(passwordField.getPassword());
				String fees=Fees;
				LocalDateTime Doa = LocalDateTime.now();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
				String doa=(Doa).format(dtf);
				
				int found = 0;

				int j = Validation.isAplha(fname);
				if (fname.length() == 0 || j == 0) {
					fName.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
					found = 1;
				} else
					fName.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));

				j = Validation.isAplha(lname);
				if (lname.length() == 0 || j == 0) {
					lName.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
					found = 1;
				} else
					lName.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));

				j = Validation.isNumber(phno1);
				if (phno1.length() != 10 || j == 0) {
					found = 1;
					phNO1.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
				} else
					phNO1.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));

				j = Validation.isNumber(phno2);
				if (phno2.length() != 10 || j == 0) {
					found = 1;
					phNO2.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
				} else
					phNO2.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));
				
				j=Validation.isEmail(email);
				if (j == 0) {
					found = 1;
					eMail.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
				} else
					eMail.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));
				
				if(Gender.length()==0) {
					found=1;
					gEnder.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
				} else
					gEnder.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));
				
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
					Date.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
				} else
					Date.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));
				
				if(address.length()==0) {
					found=1;
					aDDress.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
				} else
					aDDress.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));
				
				if(city.length()==0) {
					found=1;
					cIty.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/red.png")));
				} else
					cIty.setIcon(new ImageIcon(PatientRegister.class.getResource("/hm1/green.jpg")));


				

				if (found == 0) {
					int i = PatientDao.register(patientid, fname, lname, gender, dob, bloodgrp, phno1, phno2, email,
							problem, ward, null, address, city,password,fees,doa,null);
					if (i > 0 && found == 0) {
						String PatID = Integer.toString(patientid);
						WardSelection.Set(PatID);
						JOptionPane.showMessageDialog(null,
								"Patient ID is:" + patientid + " Patient added successfully!");
					} else {
						JOptionPane.showMessageDialog(null, "Sorry, unable to register!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Sorry, unable to register!");
				}
			}
		});
		btnRegister.setBounds(340, 517, 106, 23);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblPatientRegistration = new JLabel("PATIENT REGISTRATION");
		lblPatientRegistration.setForeground(new Color(0, 0, 128));
		lblPatientRegistration.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblPatientRegistration.setBounds(4, 11, 306, 34);
		frame.getContentPane().add(lblPatientRegistration);
		
		JLabel lblPleaseFillThe = new JLabel("Please Fill The Following Spaces");
		lblPleaseFillThe.setForeground(Color.BLACK);
		lblPleaseFillThe.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblPleaseFillThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseFillThe.setBounds(220, 56, 336, 25);
		frame.getContentPane().add(lblPleaseFillThe);
									
	}
	
public static void roomCheck(int founD) {
		Found=founD;
		System.out.println("Room CHeck"+Found);
	}
}
