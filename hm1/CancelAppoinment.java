package hm1;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;

import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CancelAppoinment {

	private JFrame frame;
	private JTable table;
	static String id;
	private JTextField textField;
	private JTextField textField_2;
	private JButton btnCancelAppoinment;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelAppoinment window = new CancelAppoinment();
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
	public CancelAppoinment() {
		initialize();
		
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select slot,date,time,day,doctorname,doctorid from appoinment where patientid=?");
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			con.close();
		}catch(Exception e){System.out.println(e);}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 907, 964);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1370, 137);
		frame.getContentPane().add(scrollPane);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
		comboBox.setBounds(682, 201, 116, 20);
		frame.getContentPane().add(comboBox);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"SLOT", "DATE", "TIME", "DAY", "DOCTOR NAME", "DOCTOR ID"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(4).setPreferredWidth(93);
		scrollPane.setViewportView(table);
		
		JLabel lblSelectTheSlot = new JLabel("Select The Slot");
		lblSelectTheSlot.setBackground(Color.WHITE);
		lblSelectTheSlot.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSelectTheSlot.setBounds(329, 197, 100, 27);
		frame.getContentPane().add(lblSelectTheSlot);
		
		textField = new JTextField();
		textField.setBounds(439, 201, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSelectTheDay = new JLabel("Select The Day");
		lblSelectTheDay.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSelectTheDay.setBounds(578, 198, 94, 27);
		frame.getContentPane().add(lblSelectTheDay);
		
		JLabel lblSelectDoctorId = new JLabel("Select Doctor ID");
		lblSelectDoctorId.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSelectDoctorId.setBounds(329, 255, 100, 27);
		frame.getContentPane().add(lblSelectDoctorId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(439, 259, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);	
		
		btnCancelAppoinment = new JButton("CANCEL APPOINMENT");
		btnCancelAppoinment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Slot = textField.getText();
				String Day = comboBox.getSelectedItem().toString();
				String Doctorid = textField_2.getText();
				
				int status=0;
				try{
					Connection con=DB.getConnection();
					PreparedStatement ps=con.prepareStatement("delete from appoinment where slot=? AND day=? AND doctorid=? AND patientid=?");
					ps.setString(1, Slot);
					ps.setString(2, Day);
					ps.setString(3, Doctorid);
					ps.setString(4, id);
					status=ps.executeUpdate();
					con.close();
				}
				catch(Exception e){System.out.println(e);}
				if(status==0)
				{
					JOptionPane.showMessageDialog(null, "Sorry, Unable To Cancel The Appoinment!");
				}
				if(status!=0)
				{
					JOptionPane.showMessageDialog(null, "Your Appoinment Is Canceled");
				}
			}
		});
		btnCancelAppoinment.setBounds(578, 331, 169, 23);
		frame.getContentPane().add(btnCancelAppoinment);
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(400, 331, 89, 23);
		frame.getContentPane().add(btnBack);
	}
	
	
public static void input(String ID) {
		
		id=ID;
	}
}
