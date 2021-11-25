package hm1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;

public class AdminLogin extends JFrame {
	
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
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblUsername.setBounds(35, 90, 102, 26);
		frame.getContentPane().add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(180, 142, 130, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.setBounds(88, 202, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setBounds(18, 26, 159, 28);
		frame.getContentPane().add(lblAdminLogin);
		lblAdminLogin.setForeground(new Color(0, 0, 128));
		lblAdminLogin.setFont(new Font("Arial Black", Font.BOLD, 17));
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnLogin.setBounds(227, 203, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(179, 95, 130, 20);
		frame.getContentPane().add(textField);
		//	frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JLabel lblPassword = new JLabel("PASSWORD");
			lblPassword.setForeground(Color.BLACK);
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 13));
			lblPassword.setBounds(35, 138, 102, 27);
			frame.getContentPane().add(lblPassword);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				if(name.equals("prasad")&&password.equals("prasad")){
					AdminSuccess.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Is Incorrect","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}
			}
		});
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartUpPage.main(new String[]{});
				frame.dispose();
			}
		});
	}
}
