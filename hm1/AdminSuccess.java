package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class AdminSuccess {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSuccess window = new AdminSuccess();
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
	public AdminSuccess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 623, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPatient = new JButton("PATIENT");
		btnPatient.setForeground(Color.BLACK);
		btnPatient.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPatient.main(new String[]{});
				frame.dispose();
			}
		});
		btnPatient.setBounds(25, 258, 118, 23);
		frame.getContentPane().add(btnPatient);
		
		JButton btnStaff = new JButton("STAFF");
		btnStaff.setForeground(Color.BLACK);
		btnStaff.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminStaff.main(new String[]{});
				frame.dispose();
			}
		});
		btnStaff.setBounds(237, 258, 118, 23);
		frame.getContentPane().add(btnStaff);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(459, 36, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblAdminPanel = new JLabel("ADMIN PANEL");
		lblAdminPanel.setForeground(new Color(0, 0, 128));
		lblAdminPanel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblAdminPanel.setBounds(10, 27, 210, 37);
		frame.getContentPane().add(lblAdminPanel);
		
		JButton btnDoctor = new JButton("DOCTOR");
		btnDoctor.setForeground(Color.BLACK);
		btnDoctor.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminDoctor.main(new String[] {});
				frame.dispose();
			}
		});
		btnDoctor.setBounds(443, 258, 118, 23);
		frame.getContentPane().add(btnDoctor);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\DoctorNew.png"));
		label.setBounds(420, 97, 150, 150);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\repNew1.png"));
		lblNewLabel.setBounds(218, 97, 150, 150);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\patientNew.png"));
		label_1.setBounds(10, 97, 150, 150);
		frame.getContentPane().add(label_1);
		
		
	}
}
