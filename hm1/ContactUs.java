package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUs {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUs window = new ContactUs();
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
	public ContactUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(new Color(0, 153, 204));
		frame.setBounds(100, 100, 788, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblContactUs = new JLabel("CONTACT US");
		lblContactUs.setForeground(new Color(0, 0, 0));
		lblContactUs.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblContactUs.setBounds(10, 24, 186, 59);
		frame.getContentPane().add(lblContactUs);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\Contact og.png"));
		label.setBounds(10, 140, 46, 40);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("0220-256589");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_1.setBounds(66, 147, 130, 20);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\Contact og.png"));
		label_2.setBounds(10, 201, 56, 40);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("9854756942");
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_3.setBounds(66, 208, 130, 33);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\Email1.png"));
		label_4.setBounds(10, 283, 56, 40);
		frame.getContentPane().add(label_4);
		
		JLabel lblZapshospitalgmailcom = new JLabel("zapshospital@gmail.com");
		lblZapshospitalgmailcom.setForeground(new Color(0, 0, 0));
		lblZapshospitalgmailcom.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblZapshospitalgmailcom.setBounds(66, 291, 226, 32);
		frame.getContentPane().add(lblZapshospitalgmailcom);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\fax1.png"));
		label_5.setBounds(10, 349, 46, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("+1 555 444-3333");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_6.setBounds(66, 366, 172, 33);
		frame.getContentPane().add(label_6);
		
		JLabel lblQualityCareWith = new JLabel("Quality care with affortable price.");
		lblQualityCareWith.setForeground(new Color(0, 0, 0));
		lblQualityCareWith.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblQualityCareWith.setBounds(304, 141, 404, 33);
		frame.getContentPane().add(lblQualityCareWith);
		
		JLabel lblWeAreAlways = new JLabel("We are always ready to help you.");
		lblWeAreAlways.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblWeAreAlways.setForeground(new Color(0, 0, 0));
		lblWeAreAlways.setBounds(304, 181, 404, 29);
		frame.getContentPane().add(lblWeAreAlways);
		
		JLabel lblWeAreAlways_1 = new JLabel("We are always there to take care of you.");
		lblWeAreAlways_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblWeAreAlways_1.setForeground(new Color(0, 0, 0));
		lblWeAreAlways_1.setBounds(304, 221, 443, 33);
		frame.getContentPane().add(lblWeAreAlways_1);
		
		JLabel lblContactUsAnytime = new JLabel("Contact us anytime 24X7.");
		lblContactUsAnytime.setForeground(new Color(0, 0, 0));
		lblContactUsAnytime.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblContactUsAnytime.setBounds(304, 256, 372, 33);
		frame.getContentPane().add(lblContactUsAnytime);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.setBounds(428, 376, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\Contactback1.png"));
		label_7.setBounds(0, 0, 772, 444);
		frame.getContentPane().add(label_7);
	}
}
