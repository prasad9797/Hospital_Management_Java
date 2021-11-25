package hm1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import net.proteanit.sql.DbUtils;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.awt.event.ActionEvent;

public class Billing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	int status;
	String patientid;
	int roomprice;
	int Total=0;
	long Days;
	int Day;
	int dcount;
	private JTextField textField_10;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing window = new Billing();
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
	public Billing() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 778, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientId = new JLabel("PATIENT ID");
		lblPatientId.setForeground(Color.BLACK);
		lblPatientId.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblPatientId.setBounds(10, 33, 125, 25);
		frame.getContentPane().add(lblPatientId);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(145, 37, 113, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setForeground(Color.BLACK);
		lblPatientName.setFont(new Font("Arial", Font.BOLD, 13));
		lblPatientName.setBounds(10, 107, 88, 25);
		frame.getContentPane().add(lblPatientName);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(110, 109, 113, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPatientGender = new JLabel("Patient Gender");
		lblPatientGender.setForeground(Color.BLACK);
		lblPatientGender.setFont(new Font("Arial", Font.BOLD, 13));
		lblPatientGender.setBounds(10, 160, 102, 20);
		frame.getContentPane().add(lblPatientGender);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(110, 157, 113, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblProblem = new JLabel("Problem");
		lblProblem.setForeground(Color.BLACK);
		lblProblem.setFont(new Font("Arial", Font.BOLD, 13));
		lblProblem.setBounds(10, 202, 88, 20);
		frame.getContentPane().add(lblProblem);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBounds(110, 199, 113, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPatientDetails = new JLabel("Patient Details");
		lblPatientDetails.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblPatientDetails.setForeground(Color.BLACK);
		lblPatientDetails.setBounds(0, 69, 135, 14);
		frame.getContentPane().add(lblPatientDetails);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(0, 0, 0), null, Color.BLACK));
		panel.setBounds(0, 90, 294, 181);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.setBounds(22, 382, 604, 118);
		frame.getContentPane().add(panel_1);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"MEDICINE NAME", "QUANTITY", "PRICE", "TOTAL"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		panel_1.add(table);
		panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{table}));
		
		JLabel lblMedicineName = new JLabel("Medicine Name");
		lblMedicineName.setForeground(Color.BLACK);
		lblMedicineName.setFont(new Font("Arial", Font.BOLD, 13));
		lblMedicineName.setBounds(22, 367, 155, 14);
		frame.getContentPane().add(lblMedicineName);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(Color.BLACK);
		lblQuantity.setFont(new Font("Arial", Font.BOLD, 13));
		lblQuantity.setBounds(176, 368, 148, 14);
		frame.getContentPane().add(lblQuantity);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.BLACK);
		lblPrice.setFont(new Font("Arial", Font.BOLD, 13));
		lblPrice.setBounds(328, 368, 124, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(Color.BLACK);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 13));
		lblTotal.setBounds(476, 368, 148, 14);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblTotalMedicineCost = new JLabel("TOTAL MEDICINE COST");
		lblTotalMedicineCost.setForeground(Color.BLACK);
		lblTotalMedicineCost.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblTotalMedicineCost.setBounds(263, 519, 186, 25);
		frame.getContentPane().add(lblTotalMedicineCost);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setBounds(476, 522, 113, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMedicineCost = new JLabel("MEDICINE COST");
		lblMedicineCost.setForeground(Color.BLACK);
		lblMedicineCost.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblMedicineCost.setBounds(0, 311, 177, 25);
		frame.getContentPane().add(lblMedicineCost);
		
		JLabel lblDateOfAdmiting = new JLabel("DATE OF ADMITING");
		lblDateOfAdmiting.setForeground(Color.BLACK);
		lblDateOfAdmiting.setFont(new Font("Arial", Font.BOLD, 13));
		lblDateOfAdmiting.setBounds(408, 90, 135, 25);
		frame.getContentPane().add(lblDateOfAdmiting);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_5.setBounds(553, 93, 199, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDateOfLeaving = new JLabel("DATE OF LEAVING");
		lblDateOfLeaving.setForeground(Color.BLACK);
		lblDateOfLeaving.setFont(new Font("Arial", Font.BOLD, 13));
		lblDateOfLeaving.setBounds(408, 140, 135, 25);
		frame.getContentPane().add(lblDateOfLeaving);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_6.setBounds(553, 143, 199, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTotalCharges = new JLabel("TOTAL CHARGES");
		lblTotalCharges.setForeground(Color.BLACK);
		lblTotalCharges.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblTotalCharges.setBounds(263, 581, 169, 20);
		frame.getContentPane().add(lblTotalCharges);
		
		JLabel lblRoomCharges = new JLabel("ROOM CHARGES");
		lblRoomCharges.setForeground(Color.BLACK);
		lblRoomCharges.setBounds(408, 205, 107, 15);
		frame.getContentPane().add(lblRoomCharges);
		lblRoomCharges.setFont(new Font("Arial", Font.BOLD, 13));
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_8.setBounds(571, 203, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblDoctorCharges = new JLabel("DOCTOR CHARGES");
		lblDoctorCharges.setForeground(Color.BLACK);
		lblDoctorCharges.setBounds(408, 257, 122, 15);
		frame.getContentPane().add(lblDoctorCharges);
		lblDoctorCharges.setFont(new Font("Arial", Font.BOLD, 13));
		
		textField_9 = new JTextField();
		textField_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setBounds(571, 258, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblOtherChargestax = new JLabel("OTHER CHARGES(TAX)");
		lblOtherChargestax.setForeground(Color.BLACK);
		lblOtherChargestax.setBounds(408, 316, 145, 15);
		frame.getContentPane().add(lblOtherChargestax);
		lblOtherChargestax.setFont(new Font("Arial", Font.BOLD, 13));
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_7.setBounds(571, 314, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(386, 197, 323, 157);
		frame.getContentPane().add(panel_2);
		
		textField_10 = new JTextField();
		textField_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_10.setBackground(Color.LIGHT_GRAY);
		textField_10.setBounds(476, 582, 113, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StaffSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(628, 35, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnGenerateBill = new JButton("GENERATE BILL");
		btnGenerateBill.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnGenerateBill.setForeground(Color.BLACK);
		btnGenerateBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status=0;
				patientid = textField.getText();
				try{
					Connection con=DB.getConnection();
					PreparedStatement ps=con.prepareStatement("select * from patient where patientid=?");
					ps.setString(1,patientid);
					ResultSet rs=ps.executeQuery();
					if(rs.next()) {
						status=1;
						String fname = rs.getString(2);
						String lname = rs.getString(3);
						String gender = rs.getString(4);
						String bloodgrp = rs.getString(5);
						String dob = rs.getString(6);
						String phno1 = rs.getString(7);
						String phno2 = rs.getString(8);
						String email = rs.getString(9);
						String problem = rs.getString(10);
						String ward = rs.getString(11);
						String room = rs.getString(12);
						String address = rs.getString(13);
						String city = rs.getString(14);
						String password = rs.getString(15);
						String fess = rs.getString(16);
						String doa = rs.getString(17);
						String dol = rs.getString(18);
						
						String Fullname=fname.concat(" ");
						Fullname=Fullname.concat(lname);
						textField_1.setText(Fullname);
						textField_2.setText(gender);
						textField_3.setText(problem);
						textField_5.setText(doa);
						
						LocalDateTime DOL = LocalDateTime.now();
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
						String Dol = (DOL).format(dtf);
						LocalDateTime DOA = LocalDateTime.parse(doa, dtf);
						
						textField_6.setText(Dol);
						System.out.println("hi:" + ward);
						if(ward.compareTo("General")==0)
						{
							roomprice=550;
						}
						if(ward.compareTo("Special")==0)
						{
							roomprice=650;
						}
						if(ward.compareTo("VIP")==0)
						{
							roomprice=800;
							System.out.println("hi:" + roomprice);
						}
						System.out.println("hi:" + roomprice);
						long diffInMinutes = ChronoUnit.MINUTES.between(DOA, DOL);
						System.out.println("hi:" + diffInMinutes);
						Days=diffInMinutes/(60*24); 
						Day=(int)Days;
						System.out.println("hi:" + Day);
						roomprice=roomprice*Day;
						System.out.println("hi:" + roomprice);
						String Roomprice = String.valueOf(roomprice);
						textField_8.setText(Roomprice);
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
						PreparedStatement ps=con.prepareStatement("select medicinename,quantity,price,total from prescription where patientid=?");
						ps.setString(1, patientid );
						ResultSet rs=ps.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));

						con.close();
					}catch(Exception e1){System.out.println(e);}
					
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("select * from prescription where patientid=?");
						ps.setString(1, patientid );
						ResultSet rs=ps.executeQuery();
						while(rs.next()) {
							String medicinename = rs.getString(2);
							String quantity = rs.getString(3);
							String price = rs.getString(4);
							String total = rs.getString(5);
							
							Total=Total+Integer.parseInt(total);
						}
						String TotaL = String.valueOf(Total);
						textField_4.setText(TotaL);

						con.close();
					}catch(Exception e1){System.out.println(e);}
					
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("select doctorid from appoinment where patientid=?");
						ps.setString(1, patientid );
						ResultSet rs=ps.executeQuery();
						while(rs.next()) {
							//String Dcount = rs.getString(6);
							
							dcount=dcount+1;
						}
						System.out.println("hi:" + dcount);
						dcount=dcount*450;
						String DCount = String.valueOf(dcount);
						textField_9.setText(DCount);

						con.close();
					}catch(Exception e1){System.out.println(e);}
					
					int grandtotal=Total+dcount+roomprice;
					int tax=(grandtotal*10)/100;
					grandtotal=grandtotal+tax;
					String Grandtotal = String.valueOf(grandtotal);
					String TAX = String.valueOf(tax);
					
					textField_7.setText(TAX);
					textField_10.setText(Grandtotal);
				}
				
				if(status==1)
				{
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("delete from patient where patientid=?");
						ps.setString(1, patientid );
						ps.executeUpdate();

						con.close();
					}catch(Exception e1){System.out.println(e);}
					
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("delete from ward where id=?");
						ps.setString(1, patientid );
						ps.executeUpdate();

						con.close();
					}catch(Exception e1){System.out.println(e);}
					
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("delete from appoinment where patientid=?");
						ps.setString(1, patientid );
						ps.executeUpdate();	

						con.close();
					}catch(Exception e1){System.out.println(e);}
					
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("delete from prescription where patientid=?");
						ps.setString(1, patientid );
						ps.executeUpdate();	

						con.close();
					}catch(Exception e1){System.out.println(e);}
				}
			}
		});
		btnGenerateBill.setBounds(382, 35, 161, 23);
		frame.getContentPane().add(btnGenerateBill);
		
		
	}
}
