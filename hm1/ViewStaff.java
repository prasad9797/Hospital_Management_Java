package hm1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class ViewStaff  {

	private JFrame frame;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStaff window = new ViewStaff();
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
	public ViewStaff() {
		initialize();
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from staff");
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
		frame.setBounds(100, 100, 1414, 812);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1370, 739);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"2483", "fgf", "ff", "Male", "A+", "546546", "RECIPTIONIST", "7676878765", "8687678687", "876@.", "8", "86", null},
				{"3238", "fgf", "ff", "Male", "A+", "546546", "RECIPTIONIST", "7676878765", "8687678687", "876@.", "8", "86", null},
				{"8671", "dg", "gg", "Female", "464687", "A+", "RECIPTIONIST", "5465666666", "6546554665", "546@.", "546", "56", null},
				{"2245", "fg", "fg", "Other", "211432", "A+", "RECIPTIONIST", "3333101310", "1302342346", "5@.", "hk", "h", null},
				{"2025", "f", "h", "Female", "4656", "A+", "RECIPTIONIST", "6666666644", "6666666644", "66@.", "52", "2", null},
			},
			new String[] {
				"staffid", "fname", "lname", "gender", "dob", "bloodgrp", "post", "phno1", "phno2", "email", "address", "city", "password"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminStaff.main(new String[]{});
				frame.dispose();
			}
		});
		scrollPane.setRowHeaderView(btnBack);
	}
	}


