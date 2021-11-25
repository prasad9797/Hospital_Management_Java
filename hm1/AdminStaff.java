package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminStaff {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminStaff window = new AdminStaff();
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
	public AdminStaff() {
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
		
		JButton btnStaffRegistration = new JButton("Staff Registration");
		btnStaffRegistration.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnStaffRegistration.setForeground(Color.BLACK);
		btnStaffRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffRegister.main(new String[]{});
				frame.dispose();
			}
		});
		btnStaffRegistration.setBounds(130, 114, 161, 23);
		frame.getContentPane().add(btnStaffRegistration);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(317, 29, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnViewStaff = new JButton("View Staff");
		btnViewStaff.setForeground(Color.BLACK);
		btnViewStaff.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnViewStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStaff.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewStaff.setBounds(130, 170, 161, 23);
		frame.getContentPane().add(btnViewStaff);
		
		JLabel lblAdminStaffPanel = new JLabel("ADMIN STAFF PANEL");
		lblAdminStaffPanel.setBackground(new Color(0, 0, 128));
		lblAdminStaffPanel.setForeground(new Color(0, 0, 128));
		lblAdminStaffPanel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblAdminStaffPanel.setBounds(10, 23, 260, 29);
		frame.getContentPane().add(lblAdminStaffPanel);
		
		JLabel lblNewLabel = new JLabel("1:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(107, 119, 13, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(107, 175, 13, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
