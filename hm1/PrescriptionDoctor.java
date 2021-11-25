package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.Component;

public class PrescriptionDoctor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	String patientid;
	String medicine ;
	String price;
	String Quantity ;
	String Fprice;
	int status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrescriptionDoctor window = new PrescriptionDoctor();
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
	public PrescriptionDoctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 735, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBounds(0, 206, 719, 169);
		frame.getContentPane().add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(300);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(300);
		panel.add(table);
		
		JLabel lblPatientId = new JLabel("Patient ID");
		lblPatientId.setFont(new Font("Arial", Font.BOLD, 13));
		lblPatientId.setBounds(10, 23, 96, 25);
		frame.getContentPane().add(lblPatientId);
		
		textField = new JTextField();
		textField.setBounds(110, 26, 152, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMedicin = new JLabel("Medicine");
		lblMedicin.setFont(new Font("Arial", Font.BOLD, 13));
		lblMedicin.setBounds(10, 85, 96, 25);
		frame.getContentPane().add(lblMedicin);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CROCINE", "ASPIRIN", "NAMOSLATE", "GLUCOSE", "TARIVID", "CANESTEN", "DICLOFENAC", "ANTACIDS", "VERMOX", "OVEX", "OMEE", "AVIL", "HIDRASEC", "UTINOR", "PARIET", "CIPROXIN", "CYPROSTAT", "ANDROCUR", "DESTOLIT", "URSOFALK", "ORS", "URSOGAL", "OMNI GEL", "DETTOL", "BERADINE", "LIVER-52", "METHYLPHENIDA", "BETA-BLOCKER", "BENZODIAZEPINIE", "Z-DRUG", "ANTIPSYCHOTIC", "SSRI-ANTIDEPRE", "MAOI-DRUG", "BICASUL", "NASAL DECONGE", "EXPECTORANTS", "COUGH SUPRESS", "ANTI HISTAMINE", "ACERAMINOPHENE", "HPV VACCINE", "SYRINGE", "INJECTION", "MORFIN", "ORISTAT", "ZALASTA", "ZANTAC", "ZEFFIX", "ZINNAT", "ZOFRAN", "ZOCOR"}));
		comboBox.setBounds(110, 88, 152, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setFont(new Font("Arial", Font.BOLD, 13));
		lblQuantity.setBounds(431, 96, 101, 25);
		frame.getContentPane().add(lblQuantity);
		
		textField_1 = new JTextField();
		textField_1.setBounds(542, 99, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(431, 25, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblMedicineName = new JLabel("MEDICINE NAME");
		lblMedicineName.setBounds(260, 192, 96, 14);
		frame.getContentPane().add(lblMedicineName);
		
		JLabel lblQuantity_1 = new JLabel("QUANTITY");
		lblQuantity_1.setBounds(366, 192, 86, 14);
		frame.getContentPane().add(lblQuantity_1);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status=0;
				patientid = textField.getText();
				try{
					Connection con=DB.getConnection();
					PreparedStatement ps=con.prepareStatement("select * from patient where patientid=?");
					ps.setString(1,patientid);
					ResultSet rs=ps.executeQuery();
					if(rs.next()) {
						medicine = comboBox.getSelectedItem().toString();
						
						if(medicine=="CROCINE" || medicine=="ASPIRIN"|| medicine=="TARIVID"|| medicine=="CANESTEN"|| medicine=="DICLOFENAC" || medicine=="ANTACIDS"|| medicine=="VERMOX"|| medicine=="OVEX"|| medicine=="OMEE"|| medicine=="AVIL"|| medicine=="HIDRASEC"|| medicine=="UTINOR")
						{
							 price="3";
						}
						if(medicine=="NAMOSLATE"|| medicine=="GLUCOSE" || medicine== "PARIET"|| medicine=="CIPROXIN"|| medicine=="DETTOL"|| medicine=="BERADINE"|| medicine=="LIVER-52" || medicine=="ZANTAC"|| medicine=="ZEFFIX"|| medicine=="ZINNAT"|| medicine=="ZOFRAN"|| medicine=="ZOCOR")
						{
							 price="6";
						}
						if(medicine=="CYPROSTAT"|| medicine=="ANDROCUR"|| medicine=="DESTOLIT"|| medicine=="URSOFALK"|| medicine=="ORS"|| medicine=="URSOGAL"|| medicine=="OMNI GEL")
						{
							price="10";
						}
						if(medicine=="METHYLPHENIDA"|| medicine=="BETA-BLOCKER"|| medicine=="BENZODIAZEPINIE"|| medicine=="Z-DRUG"|| medicine=="ANTIPSYCHOTIC"|| medicine== "SSRI-ANTIDEPRE"|| medicine=="MAOI-DRUG"|| medicine=="BICASUL"|| medicine=="NASAL DECONGE"|| medicine=="EXPECTORANTS"|| medicine=="COUGH SUPRESS"|| medicine== "ANTI HISTAMINE"|| medicine=="ACERAMINOPHENE"|| medicine=="HPV VACCINE"|| medicine=="SYRINGE"|| medicine=="INJECTION"|| medicine=="MORFIN"|| medicine=="ORISTAT")
						{
							price="15";
						}
						
						Quantity = textField_1.getText();
						int fprice=Integer.parseInt(price)*Integer.parseInt(Quantity);
						Fprice=String.valueOf(fprice);
						status=1;
					}
					else {

		                JOptionPane.showMessageDialog(null, "ID not Found");
		            }

					con.close();
				}catch(Exception e1){System.out.println(e1);}
				
				if(status==1)
				{
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("insert into prescription values(?,?,?,?,?)");
						ps.setString(1,patientid);
						ps.setString(2,medicine);
						ps.setString(3,Quantity);
						ps.setString(4,price);
						ps.setString(5,Fprice);
						ps.executeUpdate();
						con.close();
						
							JOptionPane.showMessageDialog(null, "Medicine Is Added");

						//frame.dispose();
					}catch(Exception e2){System.out.println(e);}
					
					
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("select medicinename,quantity from prescription where patientid=?");
						ps.setString(1,patientid);
						ResultSet rs=ps.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						con.close();
					}catch(Exception e1){System.out.println(e1);}
				}
			}
		});
		btnSave.setBounds(331, 433, 89, 23);
		frame.getContentPane().add(btnSave);
	}
}
