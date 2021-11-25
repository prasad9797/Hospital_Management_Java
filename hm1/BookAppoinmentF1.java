package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class BookAppoinmentF1 {

	private JFrame frame;
	static String spec;
	static String id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppoinmentF1 window = new BookAppoinmentF1();
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
	public BookAppoinmentF1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 782, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().setLayout(null);
		
	//	frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JButton btnGeneralPhysician = new JButton("GENERAL PHYSICIAN");
		btnGeneralPhysician.setForeground(Color.BLACK);
		btnGeneralPhysician.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnGeneralPhysician.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				spec="GENERAL PHYSICIAN";
				BookAppoinmentF2.input(spec);
				BookAppoinmentF2.inputId(id);
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnGeneralPhysician.setBounds(83, 186, 208, 23);
		frame.getContentPane().add(btnGeneralPhysician);
		
		JButton btnDentist = new JButton("DENTIST");
		btnDentist.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnDentist.setForeground(Color.BLACK);
		btnDentist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spec="DENTIST";
				BookAppoinmentF2.input(spec);
				BookAppoinmentF2.inputId(id);
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnDentist.setBounds(467, 186, 197, 23);
		frame.getContentPane().add(btnDentist);
		
		JButton btnKidney = new JButton("KIDNEY");
		btnKidney.setForeground(Color.BLACK);
		btnKidney.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnKidney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spec="KIDENY";
				BookAppoinmentF2.input(spec);
				BookAppoinmentF2.inputId(id);
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnKidney.setBounds(83, 269, 208, 23);
		frame.getContentPane().add(btnKidney);
		
		JButton btnCardiologist = new JButton("CARDIOLOGIST");
		btnCardiologist.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnCardiologist.setForeground(Color.BLACK);
		btnCardiologist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spec="CARDIOLOGIST";
				BookAppoinmentF2.input(spec);
				BookAppoinmentF2.inputId(id);
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnCardiologist.setBounds(467, 269, 197, 23);
		frame.getContentPane().add(btnCardiologist);
		
		JButton btnNeurologist = new JButton("NEUROLOGIST");
		btnNeurologist.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNeurologist.setForeground(Color.BLACK);
		btnNeurologist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spec="NEUROLOGIST";
				BookAppoinmentF2.input(spec);
				BookAppoinmentF2.inputId(id);
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnNeurologist.setBounds(83, 348, 208, 23);
		frame.getContentPane().add(btnNeurologist);
		
		JButton btnOrthologist = new JButton("ORTHOPEDIST");
		btnOrthologist.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnOrthologist.setForeground(Color.BLACK);
		btnOrthologist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spec="ORTHOPEDIST";
				BookAppoinmentF2.input(spec);
				BookAppoinmentF2.inputId(id);
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnOrthologist.setBounds(467, 348, 197, 23);
		frame.getContentPane().add(btnOrthologist);
		
		JButton btnPathalogist = new JButton("PATHALOGIST");
		btnPathalogist.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnPathalogist.setForeground(Color.BLACK);
		btnPathalogist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spec="PATHALOGIST";
				BookAppoinmentF2.input(spec);
				BookAppoinmentF2.inputId(id);
				BookAppoinmentF2.main(new String[]{});
				frame.dispose();
			}
		});
		btnPathalogist.setBounds(282, 427, 208, 23);
		frame.getContentPane().add(btnPathalogist);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(589, 48, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblPleaseSelectThe = new JLabel("Please Select The Type Of Specilist You Want To Book");
		lblPleaseSelectThe.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblPleaseSelectThe.setForeground(Color.BLACK);
		lblPleaseSelectThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectThe.setBounds(57, 108, 590, 28);
		frame.getContentPane().add(lblPleaseSelectThe);
		
		JLabel lblBookAppoinment = new JLabel("BOOK APPOINMENT");
		lblBookAppoinment.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblBookAppoinment.setForeground(new Color(0, 0, 128));
		lblBookAppoinment.setBounds(23, 37, 208, 38);
		frame.getContentPane().add(lblBookAppoinment);
		
		JLabel lblNewLabel = new JLabel("1:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(57, 191, 16, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_1.setBounds(57, 274, 16, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_2.setBounds(57, 353, 16, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(441, 191, 16, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5:");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_4.setBounds(441, 274, 16, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("6:");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_5.setBounds(441, 353, 16, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("7:");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBounds(256, 432, 16, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
	
	
public static void input(String name) {
		
		id=name;
	//	System.out.println("input "+temp);
	}
}
