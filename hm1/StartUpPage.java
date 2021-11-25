package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class StartUpPage extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUpPage window = new StartUpPage();
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
	public StartUpPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setTitle("CureIT");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(StartUpPage.class.getResource("/hm1/frameIcon.jpg")));
		frame.setBounds(100, 100, 1414, 812);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frame.dispose();				
			}
		});
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setBackground(UIManager.getColor("Button.highlight"));
		btnAdmin.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnAdmin.setBounds(563, 285, 124, 23);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnNewButton = new JButton("PATIENT");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton.setBounds(563, 604, 124, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RECIPTION");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StaffLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_1.setBounds(721, 285, 124, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DOCTOR");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(711, 604, 124, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(697, 78, 2, 591);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(71, 364, 1219, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\AdminNew.png"));
		label.setBounds(563, 124, 124, 150);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\repNew1.png"));
		label_1.setBounds(711, 124, 150, 150);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\patientNew.png"));
		label_2.setBounds(552, 437, 135, 156);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\DoctorNew.png"));
		label_3.setBounds(697, 437, 138, 156);
		frame.getContentPane().add(label_3);
		
		JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setForeground(new Color(0, 0, 128));
		lblAdminLogin.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblAdminLogin.setBounds(104, 71, 159, 39);
		frame.getContentPane().add(lblAdminLogin);
		
		JLabel lblPatientLogin = new JLabel("PATIENT LOGIN");
		lblPatientLogin.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblPatientLogin.setForeground(new Color(0, 0, 128));
		lblPatientLogin.setBounds(104, 414, 166, 31);
		frame.getContentPane().add(lblPatientLogin);
		
		JLabel lblReciptionistLogin = new JLabel("RECIPTIONIST LOGIN");
		lblReciptionistLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblReciptionistLogin.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblReciptionistLogin.setForeground(new Color(0, 0, 128));
		lblReciptionistLogin.setBounds(997, 86, 245, 24);
		frame.getContentPane().add(lblReciptionistLogin);
		
		JLabel lblDoctorLogin = new JLabel("DOCTOR LOGIN");
		lblDoctorLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorLogin.setForeground(new Color(0, 0, 128));
		lblDoctorLogin.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblDoctorLogin.setBounds(997, 414, 245, 31);
		frame.getContentPane().add(lblDoctorLogin);
	}
}
