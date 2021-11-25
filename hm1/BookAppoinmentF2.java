package hm1;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class BookAppoinmentF2 {

	private JFrame frame;
	static String temp;
	static String id;
	static String Did;
	private JTextField textField;
	private JLabel lblChoseDoctor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppoinmentF2 window = new BookAppoinmentF2();
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
	public BookAppoinmentF2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 702, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(331, 173, 182, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(temp);

		JLabel lblProblem = new JLabel("PROBLEM");
		lblProblem.setForeground(Color.BLACK);
		lblProblem.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblProblem.setBounds(148, 171, 105, 20);
		frame.getContentPane().add(lblProblem);

		lblChoseDoctor = new JLabel("Chose Doctor");
		lblChoseDoctor.setForeground(Color.BLACK);
		lblChoseDoctor.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblChoseDoctor.setBounds(148, 237, 144, 23);
		frame.getContentPane().add(lblChoseDoctor);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(331, 240, 182, 20);
		frame.getContentPane().add(comboBox);
		
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con
					.prepareStatement("select CONCAT(fname,' ', lname) from doctor where specility=?");
			ps.setString(1, temp);
			System.out.println("input " + temp);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				comboBox.addItem(rs.getString(1));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		JButton btnBookSlot = new JButton("BOOK SLOT");
		btnBookSlot.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBookSlot.setForeground(Color.BLACK);
		btnBookSlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String doctor = comboBox.getSelectedItem().toString();
				String FullName=doctor;
				String[] words=FullName.split(" ");
				String Fname=words[0];
				String Lname=words[1];
				try {
					Connection con = DB.getConnection();
					PreparedStatement ps = con.prepareStatement("select doctorid from doctor where fname=? AND lname=?");
					ps.setString(1, Fname);
					ps.setString(2, Lname);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						Did=rs.getString(1);
					}
					con.close();
				} catch (Exception e) {
					System.out.println(e);
				}
				
				BookAppoinmentF3.input(temp, doctor);
				BookAppoinmentF3.inputId(id, Did);
				BookAppoinmentF3.main(new String[] {});
				frame.dispose();
			}
		});
		btnBookSlot.setBounds(329, 342, 171, 23);
		frame.getContentPane().add(btnBookSlot);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAppoinmentF1.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(551, 30, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblBookAppoinment = new JLabel("BOOK APPOINMENT");
		lblBookAppoinment.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblBookAppoinment.setForeground(new Color(0, 0, 128));
		lblBookAppoinment.setBounds(10, 23, 243, 30);
		frame.getContentPane().add(lblBookAppoinment);
		
		JLabel lblNewLabel = new JLabel("Please Select The Doctor You Want");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 91, 416, 30);
		frame.getContentPane().add(lblNewLabel);

		frame.dispose();
	}

	public static void input(String spec) {

		temp = spec;
		// System.out.println("input "+temp);
	}

	public static void inputId(String name) {
		id = name;
	}
}
