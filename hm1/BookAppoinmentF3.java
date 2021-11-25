package hm1;

import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class BookAppoinmentF3 {

	private JFrame frame;
	private int avail1 = 1, avail2 = 1, avail3 = 1, avail4 = 1, avail5 = 1, avail6 = 1, avail7 = 1, avail8 = 1;
	private int avail9 = 1, avail10 = 1, avail11 = 1, avail12 = 1, avail13 = 1, avail14 = 1, avail15 = 1, avail16 = 1;
	private int avail17 = 1, avail18 = 1, avail19 = 1, avail20 = 1, avail21 = 1, avail22 = 1, avail23 = 1, avail24 = 1;
	int set, check1, check2, check3, check4, check5, check6, check7, check8, found;
	int check9, check10, check11, check12, check13, check14, check15, check16;
	int check17, check18, check19, check20, check21, check22, check23, check24;
	static String temp;
	static String temp1;
	static String Pid;
	static String Did;
	String slot;
	String date;
	String time;
	String day;
	String patientid;
	String doctorid;
	String doctorname;
	String patientname;
	String Day;
	String Time;
	String Date;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JTextField textField_3;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_20;
	private JButton btnNewButton_21;
	private JButton btnNewButton_22;
	private JButton btnNewButton_23;
	private JButton btnBook;
	private JTextField textField_4;
	private JButton btnBack;
	private JLabel lblBookAppoinment;
	private JLabel lblSpecialization;
	private JLabel lblDoctorName;
	private JLabel lblPleaseSelectA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppoinmentF3 window = new BookAppoinmentF3();
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
	public BookAppoinmentF3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 937, 714);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);

		GregorianCalendar calendar = new GregorianCalendar();
		java.util.Date now = calendar.getTime();
		DateFormat fmt = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
		System.out.println(simpleDateformat.format(now));
		final String N1 = simpleDateformat.format(now);
		final String N11 = fmt.format(now);
		
	
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setForeground(Color.BLACK);
		textField.setBounds(422, 126, 155, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(temp);

		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(422, 179, 155, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(temp1);

		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(35, 238, 102, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(N1);


		// DateFormat fmt = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		// String formattedDate;
		calendar.add(calendar.DAY_OF_MONTH, 1);
		java.util.Date tomorrow = calendar.getTime();
		final String N2 = simpleDateformat.format(tomorrow);
		final String N22 = fmt.format(tomorrow);
		System.out.println("1 "+N2+"2 "+N22);
		
		
		calendar.add(calendar.DAY_OF_MONTH, 1);
		java.util.Date dayaftertom = calendar.getTime();
		final String N3 = simpleDateformat.format(dayaftertom);
		final String N33 = fmt.format(dayaftertom);
		System.out.println("4 "+N3+"5 "+N33);
		

		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		textField_3.setBackground(Color.DARK_GRAY);
		textField_3.setBounds(35, 353, 102, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(N2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Arial Black", Font.BOLD, 13));
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setBounds(35, 468, 102, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setText(N3);

		btnNewButton = new JButton("9:45");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check1 == 1) {
					check1 = 0;
					set = 0;
					slot = null;
					btnNewButton.setBackground(Color.WHITE);
				} else if (avail1 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check1 = 1;
					set = 1;
					btnNewButton.setBackground(Color.GREEN);
					slot = "1";
				}
			}
		});
		btnNewButton.setBounds(169, 235, 89, 23);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("10:30");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (check2 == 1) {
					check2 = 0;
					set = 0;
					slot = null;
					btnNewButton_1.setBackground(Color.WHITE);
				} else if (avail2 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check2 = 1;
					set = 1;
					btnNewButton_1.setBackground(Color.GREEN);
					slot = "2";
				}
			}
		});
		btnNewButton_1.setBounds(301, 235, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("11:15");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (check3 == 1) {
					check3 = 0;
					set = 0;
					slot = null;
					btnNewButton_2.setBackground(Color.WHITE);
				} else if (avail3 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check3 = 1;
					set = 1;
					btnNewButton_2.setBackground(Color.GREEN);
					slot = "3";
				}
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(422, 235, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		btnNewButton_3 = new JButton("12:00");
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check4 == 1) {
					check4 = 0;
					set = 0;
					slot = null;
					btnNewButton_3.setBackground(Color.WHITE);
				} else if (avail4 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check4 = 1;
					set = 1;
					btnNewButton_3.setBackground(Color.GREEN);
					slot = "4";
				}
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(546, 235, 89, 23);
		frame.getContentPane().add(btnNewButton_3);

		btnNewButton_4 = new JButton("2:45");
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check5 == 1) {
					check5 = 0;
					set = 0;
					slot = null;
					btnNewButton_4.setBackground(Color.WHITE);
				} else if (avail5 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check5 = 1;
					set = 1;
					btnNewButton_4.setBackground(Color.GREEN);
					slot = "5";
				}
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(667, 235, 89, 23);
		frame.getContentPane().add(btnNewButton_4);

		btnNewButton_5 = new JButton("3:30");
		btnNewButton_5.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check6 == 1) {
					check6 = 0;
					set = 0;
					slot = null;
					btnNewButton_5.setBackground(Color.WHITE);
				} else if (avail6 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check6 = 1;
					set = 1;
					btnNewButton_5.setBackground(Color.GREEN);
					slot = "6";
				}
			}
		});
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(786, 235, 89, 23);
		frame.getContentPane().add(btnNewButton_5);

		btnNewButton_6 = new JButton("4:15");
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check7 == 1) {
					check7 = 0;
					set = 0;
					slot = null;
					btnNewButton_6.setBackground(Color.WHITE);
				} else if (avail7 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check7 = 1;
					set = 1;
					btnNewButton_6.setBackground(Color.GREEN);
					slot = "7";
				}
			}
		});
		btnNewButton_6.setBounds(169, 292, 89, 23);
		frame.getContentPane().add(btnNewButton_6);

		btnNewButton_7 = new JButton("5:00");
		btnNewButton_7.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check8 == 1) {
					check8 = 0;
					set = 0;
					slot = null;
					btnNewButton_7.setBackground(Color.WHITE);
				} else if (avail8 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check8 = 1;
					set = 1;
					btnNewButton_7.setBackground(Color.GREEN);
					slot = "8";
				}
			}
		});
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.setBounds(301, 292, 89, 23);
		frame.getContentPane().add(btnNewButton_7);

		try {

			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from appoinment where doctorid=? AND day=? AND date=?");
			ps.setString(1, Did);
			ps.setString(2, N1);
			ps.setString(3, N11);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				// avail1=1;avail2=1;avail3=1;avail4=1;avail5=1;
				slot = rs.getString(1);
				date = rs.getString(2);
				time = rs.getString(3);
				day = rs.getString(4);
				patientid = rs.getString(5);
				doctorid = rs.getString(6);
				doctorname= rs.getString(7);
				patientname=rs.getString(8);
				
				int result = Integer.parseInt(slot);
				// System.out.println(" "+Room+" "+ID);

				if (result == 1 && patientid != null) {
					// System.out.println("1 "+Room+" "+ID);
					avail1 = 0;
					btnNewButton.setBackground(Color.RED);
				}
				if (result == 2 && patientid != null) {
					// System.out.println("2 "+Room+" "+ID);
					avail2 = 0;
					btnNewButton_1.setBackground(Color.RED);
				}

				if (result == 3 && patientid != null) {
					// System.out.println("3 "+Room+" "+ID);
					avail3 = 0;
					btnNewButton_2.setBackground(Color.RED);
				}

				if (result == 4 && patientid != null) {
					// System.out.println("4 "+Room+" "+ID);
					avail4 = 0;
					btnNewButton_3.setBackground(Color.RED);
				}

				if (result == 5 && patientid != null) {
					// System.out.println("5 "+Room+" "+ID);
					avail5 = 0;
					btnNewButton_4.setBackground(Color.RED);
				}

				if (result == 6 && patientid != null) {
					// System.out.println("5 "+Room+" "+ID);
					avail6 = 0;
					btnNewButton_5.setBackground(Color.RED);
				}

				if (result == 7 && patientid != null) {
					// System.out.println("5 "+Room+" "+ID);
					avail7 = 0;
					btnNewButton_6.setBackground(Color.RED);
				}

				if (result == 8 && patientid != null) {
					// System.out.println("5 "+Room+" "+ID);
					avail8 = 0;
					btnNewButton_7.setBackground(Color.RED);
				}
			}

			slot = null;

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		btnNewButton_8 = new JButton("9:45");
		btnNewButton_8.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check9 == 1) {
					check9 = 0;
					set = 0;
					slot = null;
					btnNewButton_8.setBackground(Color.WHITE);
				} else if (avail9 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check9 = 1;
					set = 1;
					btnNewButton_8.setBackground(Color.GREEN);
					slot = "9";
				}
			}
		});
		btnNewButton_8.setBounds(169, 350, 89, 23);
		frame.getContentPane().add(btnNewButton_8);

		btnNewButton_9 = new JButton("10:30");
		btnNewButton_9.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setBackground(Color.WHITE);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check10 == 1) {
					check10 = 0;
					set = 0;
					slot = null;
					btnNewButton_9.setBackground(Color.WHITE);
				} else if (avail10 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check10 = 1;
					set = 1;
					btnNewButton_9.setBackground(Color.GREEN);
					slot = "10";
				}
			}
		});
		btnNewButton_9.setBounds(301, 351, 89, 23);
		frame.getContentPane().add(btnNewButton_9);

		btnNewButton_10 = new JButton("11:15");
		btnNewButton_10.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_10.setForeground(Color.BLACK);
		btnNewButton_10.setBackground(Color.WHITE);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check11 == 1) {
					check11 = 0;
					set = 0;
					slot = null;
					btnNewButton_10.setBackground(Color.WHITE);
				} else if (avail11 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check11 = 1;
					set = 1;
					btnNewButton_10.setBackground(Color.GREEN);
					slot = "11";
				}
			}
		});
		btnNewButton_10.setBounds(422, 351, 89, 23);
		frame.getContentPane().add(btnNewButton_10);

		btnNewButton_11 = new JButton("12:00");
		btnNewButton_11.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_11.setForeground(Color.BLACK);
		btnNewButton_11.setBackground(Color.WHITE);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check12 == 1) {
					check12 = 0;
					set = 0;
					slot = null;
					btnNewButton_11.setBackground(Color.WHITE);
				} else if (avail12 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check12 = 1;
					set = 1;
					btnNewButton_11.setBackground(Color.GREEN);
					slot = "12";
				}
			}
		});
		btnNewButton_11.setBounds(546, 351, 89, 23);
		frame.getContentPane().add(btnNewButton_11);

		btnNewButton_12 = new JButton("2:45");
		btnNewButton_12.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_12.setForeground(Color.BLACK);
		btnNewButton_12.setBackground(Color.WHITE);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check13 == 1) {
					check13 = 0;
					set = 0;
					slot = null;
					btnNewButton_12.setBackground(Color.WHITE);
				} else if (avail13 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check13 = 1;
					set = 1;
					btnNewButton_12.setBackground(Color.GREEN);
					slot = "13";
				}
			}
		});
		btnNewButton_12.setBounds(667, 351, 89, 23);
		frame.getContentPane().add(btnNewButton_12);

		btnNewButton_13 = new JButton("3:30");
		btnNewButton_13.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_13.setForeground(Color.BLACK);
		btnNewButton_13.setBackground(Color.WHITE);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check14 == 1) {
					check14 = 0;
					set = 0;
					slot = null;
					btnNewButton_13.setBackground(Color.WHITE);
				} else if (avail14 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check14 = 1;
					set = 1;
					btnNewButton_13.setBackground(Color.GREEN);
					slot = "14";
				}
			}
		});
		btnNewButton_13.setBounds(786, 351, 89, 23);
		frame.getContentPane().add(btnNewButton_13);

		btnNewButton_14 = new JButton("4:15");
		btnNewButton_14.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_14.setForeground(Color.BLACK);
		btnNewButton_14.setBackground(Color.WHITE);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check15 == 1) {
					check15 = 0;
					set = 0;
					slot = null;
					btnNewButton_14.setBackground(Color.WHITE);
				} else if (avail15 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check15 = 1;
					set = 1;
					btnNewButton_14.setBackground(Color.GREEN);
					slot = "15";
				}
			}
		});
		btnNewButton_14.setBounds(169, 409, 89, 23);
		frame.getContentPane().add(btnNewButton_14);

		btnNewButton_15 = new JButton("5:00");
		btnNewButton_15.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_15.setForeground(Color.BLACK);
		btnNewButton_15.setBackground(Color.WHITE);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (check16 == 1) {
					check16 = 0;
					set = 0;
					slot = null;
					btnNewButton_15.setBackground(Color.WHITE);
				} else if (avail16 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check16 = 1;
					set = 1;
					btnNewButton_15.setBackground(Color.GREEN);
					slot = "16";
				}
			}
		});
		btnNewButton_15.setBounds(301, 409, 89, 23);
		frame.getContentPane().add(btnNewButton_15);

		try {

			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from appoinment where doctorid=? AND day=? AND date=?");
			ps.setString(1, Did);
			ps.setString(2, N2);
			ps.setString(3, N22);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slot = rs.getString(1);
				date = rs.getString(2);
				time = rs.getString(3);
				day = rs.getString(4);
				patientid = rs.getString(5);
				doctorid = rs.getString(6);
				doctorname= rs.getString(7);
				patientname=rs.getString(8);
				
				int result = Integer.parseInt(slot);

				if (result == 9 && patientid != null) {
					avail9 = 0;
					btnNewButton_8.setBackground(Color.RED);
				}
				if (result == 10 && patientid != null) {
					avail10 = 0;
					btnNewButton_9.setBackground(Color.RED);
				}

				if (result == 11 && patientid != null) {
					avail11 = 0;
					btnNewButton_10.setBackground(Color.RED);
				}

				if (result == 12 && patientid != null) {
					avail12 = 0;
					btnNewButton_11.setBackground(Color.RED);
				}

				if (result == 13 && patientid != null) {
					avail13 = 0;
					btnNewButton_12.setBackground(Color.RED);
				}

				if (result == 14 && patientid != null) {
					avail14 = 0;
					btnNewButton_13.setBackground(Color.RED);
				}

				if (result == 15 && patientid != null) {
					avail15 = 0;
					btnNewButton_14.setBackground(Color.RED);
				}

				if (result == 16 && patientid != null) {
					avail16 = 0;
					btnNewButton_15.setBackground(Color.RED);
				}
			}

			slot = null;

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
  
		btnNewButton_16 = new JButton("9:45");
		btnNewButton_16.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_16.setForeground(Color.BLACK);
		btnNewButton_16.setBackground(Color.WHITE);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check17 == 1) {
					check17 = 0;
					set = 0;
					slot = null;
					btnNewButton_16.setBackground(Color.WHITE);
				} else if (avail17 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check17 = 1;
					set = 1;
					btnNewButton_16.setBackground(Color.GREEN);
					slot = "17";
				}
			}
		});
		btnNewButton_16.setBounds(169, 465, 89, 23);
		frame.getContentPane().add(btnNewButton_16);

		btnNewButton_17 = new JButton("10:30");
		btnNewButton_17.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_17.setForeground(Color.BLACK);
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check18 == 1) {
					check18 = 0;
					set = 0;
					slot = null;
					btnNewButton_17.setBackground(Color.WHITE);
				} else if (avail18 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check18 = 1;
					set = 1;
					btnNewButton_17.setBackground(Color.GREEN);
					slot = "18";
				}
			}
		});
		btnNewButton_17.setBackground(Color.WHITE);
		btnNewButton_17.setBounds(301, 465, 89, 23);
		frame.getContentPane().add(btnNewButton_17);

		btnNewButton_18 = new JButton("11:15");
		btnNewButton_18.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_18.setForeground(Color.BLACK);
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check19 == 1) {
					check19 = 0;
					set = 0;
					slot = null;
					btnNewButton_18.setBackground(Color.WHITE);
				} else if (avail19 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check19 = 1;
					set = 1;
					btnNewButton_18.setBackground(Color.GREEN);
					slot = "19";
				}
			}
		});
		btnNewButton_18.setBackground(Color.WHITE);
		btnNewButton_18.setBounds(422, 465, 89, 23);
		frame.getContentPane().add(btnNewButton_18);

		btnNewButton_19 = new JButton("12:00");
		btnNewButton_19.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_19.setForeground(Color.BLACK);
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check20 == 1) {
					check20 = 0;
					set = 0;
					slot = null;
					btnNewButton_19.setBackground(Color.WHITE);
				} else if (avail20 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check20 = 1;
					set = 1;
					btnNewButton_19.setBackground(Color.GREEN);
					slot = "20";
				}
			}
		});
		btnNewButton_19.setBackground(Color.WHITE);
		btnNewButton_19.setBounds(546, 465, 89, 23);
		frame.getContentPane().add(btnNewButton_19);

		btnNewButton_20 = new JButton("2:45");
		btnNewButton_20.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_20.setForeground(Color.BLACK);
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check21 == 1) {
					check21 = 0;
					set = 0;
					slot = null;
					btnNewButton_20.setBackground(Color.WHITE);
				} else if (avail21 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check21 = 1;
					set = 1;
					btnNewButton_20.setBackground(Color.GREEN);
					slot = "21";
				}
			}
		});
		btnNewButton_20.setBackground(Color.WHITE);
		btnNewButton_20.setBounds(667, 465, 89, 23);
		frame.getContentPane().add(btnNewButton_20);

		btnNewButton_21 = new JButton("3:30");
		btnNewButton_21.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_21.setForeground(Color.BLACK);
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check22 == 1) {
					check22 = 0;
					set = 0;
					slot = null;
					btnNewButton_21.setBackground(Color.WHITE);
				} else if (avail22 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check22 = 1;
					set = 1;
					btnNewButton_21.setBackground(Color.GREEN);
					slot = "22";
				}
			}
		});
		btnNewButton_21.setBackground(Color.WHITE);
		btnNewButton_21.setBounds(786, 465, 89, 23);
		frame.getContentPane().add(btnNewButton_21);

		btnNewButton_22 = new JButton("4:15");
		btnNewButton_22.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_22.setForeground(Color.BLACK);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check23 == 1) {
					check23 = 0;
					set = 0;
					slot = null;
					btnNewButton_22.setBackground(Color.WHITE);
				} else if (avail23 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check23 = 1;
					set = 1;
					btnNewButton_22.setBackground(Color.GREEN);
					slot = "23";
				}
			}
		});
		btnNewButton_22.setBackground(Color.WHITE);
		btnNewButton_22.setBounds(169, 517, 89, 23);
		frame.getContentPane().add(btnNewButton_22);

		btnNewButton_23 = new JButton("5:00");
		btnNewButton_23.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_23.setForeground(Color.BLACK);
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (check24 == 1) {
					check24 = 0;
					set = 0;
					slot = null;
					btnNewButton_23.setBackground(Color.WHITE);
				} else if (avail24 == 0) {
					JOptionPane.showMessageDialog(null, "This Slot Of Time is not available");
				}

				else if (set == 1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Time Slot");
				else {
					check24 = 1;
					set = 1;
					btnNewButton_23.setBackground(Color.GREEN);
					slot = "24";
				}
			}
		});
		btnNewButton_23.setBackground(Color.WHITE);
		btnNewButton_23.setBounds(301, 517, 89, 23);
		frame.getContentPane().add(btnNewButton_23);
		
		
		try {

			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from appoinment where doctorid=? AND day=? AND date=?");
			ps.setString(1, Did);
			ps.setString(2, N3);
			ps.setString(3, N33);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				slot = rs.getString(1);
				date = rs.getString(2);
				time = rs.getString(3);
				day = rs.getString(4);
				patientid = rs.getString(5);
				doctorid = rs.getString(6);
				doctorname= rs.getString(7);
				patientname=rs.getString(8);
				
				int result = Integer.parseInt(slot);

				if (result == 17 && patientid != null) {
					avail17 = 0;
					btnNewButton_16.setBackground(Color.RED);
				}
				if (result == 18 && patientid != null) {
					avail18 = 0;
					btnNewButton_17.setBackground(Color.RED);
				}

				if (result == 19 && patientid != null) {
					avail19 = 0;
					btnNewButton_18.setBackground(Color.RED);
				}

				if (result == 20 && patientid != null) {
					avail20 = 0;
					btnNewButton_19.setBackground(Color.RED);
				}

				if (result == 21 && patientid != null) {
					avail21 = 0;
					btnNewButton_20.setBackground(Color.RED);
				}

				if (result == 22 && patientid != null) {
					avail22 = 0;
					btnNewButton_21.setBackground(Color.RED);
				}

				if (result == 23 && patientid != null) {
					avail23 = 0;
					btnNewButton_22.setBackground(Color.RED);
				}

				if (result == 24 && patientid != null) {
					avail24 = 0;
					btnNewButton_23.setBackground(Color.RED);
				}
			}

			slot = null;

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		btnBook = new JButton("BOOK");
		btnBook.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBook.setForeground(Color.BLACK);
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int choice = Integer.parseInt(slot);
				if(choice<=8)
				{
					Day=N1;
					Date=N11;
				}
				if(choice>8 && choice <=16)
				{
					Day=N2;
					Date=N22;
				}
				if(choice>16 && choice <=24)
				{
					Day=N3;
					Date=N33;
				}
				if(choice==1)
				{
					Time="9:45";
				}
				if(choice==2)
				{
					Time="10:30";
				}
				if(choice==3)
				{
					Time="11:15";
				}
				if(choice==4)
				{
					Time="12:00";
				}
				if(choice==5)
				{
					Time="2:45";
				}
				if(choice==6)
				{
					Time="3:30";
				}
				if(choice==7)
				{
					Time="4:15";
				}
				if(choice==8)
				{
					Time="5:00";
				}
				if(choice==9)
				{
					Time="9:45";
				}
				if(choice==10)
				{
					Time="10:30";
				}
				if(choice==11)
				{
					Time="11:15";
				}
				if(choice==12)
				{
					Time="12:00";
				}
				if(choice==13)
				{
					Time="2:45";
				}
				if(choice==14)
				{
					Time="3:30";
				}
				if(choice==15)
				{
					Time="4:15";
				}
				if(choice==16)
				{
					Time="5:00";
				}
				if(choice==17)
				{
					Time="9:45";
				}
				if(choice==18)
				{
					Time="10:30";
				}
				if(choice==19)
				{
					Time="11:15";
				}
				if(choice==20)
				{
					Time="12:00";
				}
				if(choice==21)
				{
					Time="2:45";
				}
				if(choice==22)
				{
					Time="3:30";
				}
				if(choice==23)
				{
					Time="4:15";
				}
				if(choice==24)
				{
					Time="5:00";
				}
				
				if(slot!=null)
				{

					
					
					try {
						Connection con = DB.getConnection();
						PreparedStatement ps = con
								.prepareStatement("select CONCAT(fname,' ', lname) from patient where patientid=?");
						ps.setString(1, Pid);
						ResultSet rs = ps.executeQuery();
						while (rs.next()) {
							 patientname = rs.getString(1);
						}
						con.close();
					} catch (Exception e) {
						System.out.println(e);
					}
					
					System.out.println(patientname);
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("insert into appoinment values(?,?,?,?,?,?,?,?)");
						ps.setString(1,slot);
						ps.setString(2,Date);
						ps.setString(3,Time);
						ps.setString(4,Day);
						ps.setString(5,Pid);
						ps.setString(6,Did);
						ps.setString(7, temp1);
						ps.setString(8, patientname);
						ps.executeUpdate();
						con.close();
						
							JOptionPane.showMessageDialog(null, "Appoinment Is Booked");

						frame.dispose();
					}catch(Exception e){System.out.println(e);}
				}
				else
					JOptionPane.showMessageDialog(null, "Please Select A Time Slot");
			}
		});
		btnBook.setBounds(388, 623, 89, 23);
		frame.getContentPane().add(btnBook);
		
		btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(739, 45, 89, 23);
		frame.getContentPane().add(btnBack);
		
		lblBookAppoinment = new JLabel("BOOK APPOINMENT");
		lblBookAppoinment.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblBookAppoinment.setForeground(new Color(0, 0, 128));
		lblBookAppoinment.setBounds(10, 11, 230, 29);
		frame.getContentPane().add(lblBookAppoinment);
		
		lblSpecialization = new JLabel("Specialization");
		lblSpecialization.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblSpecialization.setForeground(Color.BLACK);
		lblSpecialization.setBounds(281, 126, 131, 20);
		frame.getContentPane().add(lblSpecialization);
		
		lblDoctorName = new JLabel("Doctor Name");
		lblDoctorName.setForeground(Color.BLACK);
		lblDoctorName.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblDoctorName.setBounds(281, 179, 131, 20);
		frame.getContentPane().add(lblDoctorName);
		
		lblPleaseSelectA = new JLabel("Please Select A Time Slot");
		lblPleaseSelectA.setForeground(Color.BLACK);
		lblPleaseSelectA.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblPleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectA.setBounds(248, 72, 451, 14);
		frame.getContentPane().add(lblPleaseSelectA);

	}

	public static void input(String name, String doctor) {

		temp = name;
		temp1 = doctor;
		// System.out.println("input "+temp);
	}

	public static void inputId(String id, String did) {
		Pid = id;
		Did = did;
	}
}
