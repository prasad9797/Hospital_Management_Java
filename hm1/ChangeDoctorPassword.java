package hm1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ChangeDoctorPassword {

	private JFrame frame;
	static String temp;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeDoctorPassword window = new ChangeDoctorPassword();
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
	public ChangeDoctorPassword() {
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
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setBounds(46, 91, 107, 21);
		frame.getContentPane().add(lblNewPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 91, 108, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setBounds(46, 147, 107, 14);
		frame.getContentPane().add(lblRetypePassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(163, 144, 108, 20);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblChangePassword = new JLabel("CHANGE PASSWORD");
		lblChangePassword.setForeground(Color.WHITE);
		lblChangePassword.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblChangePassword.setBounds(23, 21, 228, 29);
		frame.getContentPane().add(lblChangePassword);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=String.valueOf(passwordField.getPassword());
				String repassword=String.valueOf(passwordField_1.getPassword());
				int Compare=password.compareTo(repassword);
				System.out.println(""+Compare);
				if(Compare==0)
				{
					try{
						
					Connection con=DB.getConnection();
					PreparedStatement ps=con.prepareStatement("update doctor set password=? where doctorid=?");
					ps.setString(1,password);
					ps.setString(2,temp);
					ps.executeUpdate();
					con.close();	
					JOptionPane.showMessageDialog(null, "Password Is Changed Successfully");
				}catch(Exception E){System.out.println(E);}
				}
				else
					JOptionPane.showMessageDialog(null, "Both the Password Do Not Match");
			}
		});
		btnSubmit.setBounds(237, 203, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(94, 203, 89, 23);
		frame.getContentPane().add(btnBack);
	}


	public static void input(String name) {
		
		temp=name;
		System.out.println("input "+temp);
	}	

}
