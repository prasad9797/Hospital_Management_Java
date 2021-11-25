package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;

public class StaffLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLogin window = new StaffLogin();
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
	public StaffLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.RED);
		frame.setBackground(Color.RED);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERID            ");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setBackground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblUsername.setBounds(52, 84, 130, 18);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(192, 82, 133, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD   ");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblPassword.setBounds(52, 133, 130, 17);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(192, 130, 133, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				
			//	int status=0;
				
				try{
					Connection con=DB.getConnection();
					PreparedStatement ps=con.prepareStatement("select staffid,password from staff where staffid=? AND password=? AND post='RECIPTIONIST'");
					ps.setString(1,name);
					ps.setString(2,password);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						StaffSuccess.input(name);
						StaffSuccess.main(new String[]{});
						frame.dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Username or Password is Incorrect!!");
					con.close();
				}
				catch(Exception E){System.out.println(E);}
			}
		});
		btnLogin.setBounds(236, 194, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StartUpPage.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(93, 194, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblStaffLogin = new JLabel("STAFF LOGIN");
		lblStaffLogin.setForeground(new Color(0, 0, 128));
		lblStaffLogin.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblStaffLogin.setBounds(10, 29, 206, 23);
		frame.getContentPane().add(lblStaffLogin);
		
		
	}
}
