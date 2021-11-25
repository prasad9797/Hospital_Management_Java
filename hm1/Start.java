package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Scrollbar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1382, 858);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		JPanel container = new JPanel();
		container.setBackground(Color.DARK_GRAY);
		container.setBorder(null);
        JScrollPane jsp = new JScrollPane(container);
        container.setPreferredSize(new Dimension(1000, 3050));
        container.setLayout(null);
        
        JLabel lblZaps = new JLabel("ZAPS");
        lblZaps.setForeground(Color.BLACK);
        lblZaps.setFont(new Font("Arial Black", Font.BOLD, 25));
        lblZaps.setHorizontalAlignment(SwingConstants.CENTER);
        lblZaps.setBounds(29, 65, 99, 44);
        container.add(lblZaps);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.BLACK));
        panel.setBounds(0, 0, 157, 133);
        container.add(panel);
        
        JLabel lblNewLabel = new JLabel("");
        panel.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\logo2.png"));
                
        JLabel lblWellTakeCare = new JLabel("We'll Take Care of It");
        lblWellTakeCare.setForeground(Color.WHITE);
        lblWellTakeCare.setFont(new Font("Arial", Font.BOLD, 40));
        lblWellTakeCare.setBounds(510, 231, 396, 33);
        container.add(lblWellTakeCare);
        
        JLabel lblNewLabel_1 = new JLabel("Find primary care services on your schedule");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(484, 275, 444, 24);
        container.add(lblNewLabel_1);

        JButton btnBookNow = new JButton("Login Now");
        btnBookNow.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		StartUpPage.main(new String[]{});
				frame.dispose();
        		
        	}
        });
        btnBookNow.setForeground(Color.WHITE);
        btnBookNow.setFont(new Font("Arial", Font.BOLD, 16));
        btnBookNow.setIcon(null);
        btnBookNow.setBackground(new Color(153, 0, 0));
        btnBookNow.setBounds(608, 353, 151, 33);
        container.add(btnBookNow);
        
        JButton btnHi = new JButton("hi");
        btnHi.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        container.add(btnHi);
  
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\21Year.jpg"));
        lblNewLabel_2.setBounds(45, 779, 667, 640);
        container.add(lblNewLabel_2);
       
        
        JLabel lblNationallyRankedIn = new JLabel("Nationally Ranked in 6 Specialties");
        lblNationallyRankedIn.setForeground(Color.WHITE);
        lblNationallyRankedIn.setFont(new Font("Arial", Font.BOLD, 25));
        lblNationallyRankedIn.setBounds(840, 817, 507, 33);
        container.add(lblNationallyRankedIn);
        
        JLabel lblRankedIn = new JLabel("Ranked #1 in India");
        lblRankedIn.setFont(new Font("Arial", Font.BOLD, 22));
        lblRankedIn.setForeground(Color.WHITE);
        lblRankedIn.setBounds(840, 851, 507, 33);
        container.add(lblRankedIn);
               
        
        JLabel lblNewLabel_3 = new JLabel("ZAPS Health Academia and Helth Care Center has ");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 17));
        lblNewLabel_3.setBounds(840, 908, 507, 14);
        container.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("once again been recognized for our exceptional care,");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 17));
        lblNewLabel_4.setBounds(840, 948, 507, 14);
        container.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("unmatched expertise and continued excellence.With the");
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 17));
        lblNewLabel_5.setBounds(840, 988, 507, 14);
        container.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("most nationally ranked specialties in India. ZAPS is ");
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 17));
        lblNewLabel_6.setBounds(840, 1028, 507, 14);
        container.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("the name which India trusts for healthcare");
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 17));
        lblNewLabel_7.setBounds(840, 1068, 507, 14);
        container.add(lblNewLabel_7);
        
        JLabel label = new JLabel("");
        label.setBackground(Color.WHITE);
        label.setForeground(new Color(153, 0, 0));
        label.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\Mother22.jpg"));
        label.setBounds(0, 120, 1351, 577);
        container.add(label);

        JLabel lblH = new JLabel("");
        lblH.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\back1.jpg"));
        lblH.setForeground(Color.CYAN);
        lblH.setBackground(new Color(100, 149, 237));
        lblH.setBounds(0, 775, 1347, 623);
        container.add(lblH);
        frame.getContentPane().add(jsp);
        
        JButton btnAboutUs = new JButton("About Us");
        btnAboutUs.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnAboutUs.setFont(new Font("Arial", Font.BOLD, 15));
        btnAboutUs.setBackground(new Color(153, 0, 0));
        btnAboutUs.setForeground(Color.WHITE);
        btnAboutUs.setBounds(648, 93, 124, 26);
        container.add(btnAboutUs);
        
        JButton btnCarre = new JButton("Careers");
        btnCarre.setForeground(Color.WHITE);
        btnCarre.setBackground(new Color(153, 0, 0));
        btnCarre.setFont(new Font("Arial", Font.BOLD, 15));
        btnCarre.setBounds(829, 93, 124, 26);
        container.add(btnCarre);
        
        JButton btnNewButton = new JButton("Contact Us");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ContactUs.main(new String[]{});
				frame.dispose();
        	}
        });
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
        btnNewButton.setBackground(new Color(153, 0, 0));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBounds(1007, 93, 124, 26);
        container.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Terms");
        btnNewButton_1.setBackground(new Color(153, 0, 0));
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBounds(1184, 93, 124, 26);
        container.add(btnNewButton_1);
        
        JLabel lblHome = new JLabel("Home");
        lblHome.setForeground(Color.BLACK);
        lblHome.setFont(new Font("Arial", Font.BOLD, 30));
        lblHome.setBounds(278, 12, 157, 52);
        container.add(lblHome);
        
        
        
	}
}
