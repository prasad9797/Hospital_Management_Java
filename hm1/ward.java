package hm1;

import hm1.WardBean;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ward {

	static private JFrame frame;
	static private int avail1=1,avail2=1,avail3=1,avail4=1,avail5=1;
	static String Room;
	static String Ward;
	static String ID;
	static String temp;
	static int set,check1,check2,check3,check4,check5;
	final static WardBean WB=new WardBean();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public static void  WardSelection() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize() {
		//Ward="General";
		Ward=WB.getWarD();
		temp=WB.getiD();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		final JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check1==1)
				{
					check1=0;
					set=0;
					Room=null;
					btnNewButton_5.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
				}
				else if(avail1==0)
				{
					JOptionPane.showMessageDialog(null, "Room is not available");
				}
				
				else if(set==1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Room");
				else
				{
					check1=1;
					set=1;
					btnNewButton_5.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
					Room="6";
				//	IdAllocation(Ward,Room,temp);
				}
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		btnNewButton_5.setBounds(1, 1, 1, 1);
		frame.getContentPane().add(btnNewButton_5);
		
		
		
		final JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check1==1)
				{
					check1=0;
					set=0;
					Room=null;
					btnNewButton.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
				}
				else if(avail1==0)
				{
					JOptionPane.showMessageDialog(null, "Room is not available");
				}
				
				else if(set==1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Room");
				else
				{
					check1=1;
					set=1;
					btnNewButton.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
					Room="1";
				//	IdAllocation(Ward,Room,temp);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		btnNewButton.setBounds(42, 54, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check2==1)
				{
					check2=0;
					set=0;
					Room=null;
					btnNewButton_1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
				}
				else if(avail2==0)
				{
					JOptionPane.showMessageDialog(null, "Room is not available");
				}
				
				else if(set==1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Room");
				else
				{
					check2=1;
					set=1;
					btnNewButton_1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
					//Ward="General";
					Room="2";
					//temp="123";
					//IdAllocation(Ward,Room,temp);
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		btnNewButton_1.setBounds(42, 100, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check3==1)
				{
					check3=0;
					set=0;
					Room=null;
					btnNewButton_2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
				}
				else if(avail3==0)
				{
					JOptionPane.showMessageDialog(null, "Room is not available");
				}
				
				else if(set==1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Room");
				else
				{
					//temp="259";
					check3=1;
					set=1;
					btnNewButton_2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
					Room="3";
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		btnNewButton_2.setBounds(42, 148, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check4==1)
				{
					check4=0;
					set=0;
					Room=null;
					btnNewButton_3.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
				}
				else if(avail4==0)
				{
					JOptionPane.showMessageDialog(null, "Room is not available");
				}
				
				else if(set==1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Room");
				else
				{
					check4=1;
					set=1;
				//	temp="259";
					btnNewButton_3.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
					Room="4";
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		btnNewButton_3.setBounds(177, 77, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		final JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(check5==1)
				{
					check5=0;
					set=0;
					Room=null;
					btnNewButton_4.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
				}
				else if(avail5==0)
				{
					JOptionPane.showMessageDialog(null, "Room is not available");
				}
				
				else if(set==1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Room");
				else
				{
					check5=1;
					set=1;
					//temp="259";
					btnNewButton_4.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\green.jpg"));
					Room="5";
				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\white.jpg"));
		btnNewButton_4.setBounds(177, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnBook = new JButton("BOOK");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//public void IdAllocation(String Ward,String Room,String temp)
				System.out.println(" "+Room+" "+temp);
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("update ward set id=? where ward=? AND room=?");
						ps.setString(1,temp);
						ps.setString(2,Ward);
						ps.setString(3,Room);
						ps.executeUpdate();
						con.close();
						WB.setRooM(Room);
						JOptionPane.showMessageDialog(null, "Room Is Registered");
					}catch(Exception e){System.out.println(e);}
						
				
			}
		});
		btnBook.setBounds(154, 205, 89, 23);
		frame.getContentPane().add(btnBook);
		
		try{
			Ward= "General";
			temp=null;
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from ward where ward=?");
			ps.setString(1,Ward);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				//avail1=1;avail2=1;avail3=1;avail4=1;avail5=1;
				Room = rs.getString(2);
				ID = rs.getString(3);
				int result = Integer.parseInt(Room);
				System.out.println(" "+Room+" "+ID+""+Ward);
				
				if(result==1 && ID!=null) 
				{
					System.out.println(" "+Room+" "+ID);
					avail1=0;
					btnNewButton.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				}
				if(result==2 && ID!=null) 
				{
					System.out.println(" "+Room+" "+ID);
					avail2=0;
					btnNewButton_1.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				}
				
				if(result==3 && ID!=null) 
				{
					System.out.println(" "+Room+" "+ID);
					avail3=0;
					btnNewButton_2.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				}
				
				if(result==4 && ID!=null) 
				{
					System.out.println(" "+Room+" "+ID);
					avail4=0;
					btnNewButton_3.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				}
				
				if(result==5 && ID!=null) 
				{
					System.out.println(" "+Room+" "+ID);
					avail5=0;
					btnNewButton_4.setIcon(new ImageIcon("E:\\eclipse\\work\\Hospital_Managment\\src\\hm1\\red.png"));
				}
			}
			
			
			con.close();
		}catch(Exception e){System.out.println(e);}

		
	}
	
	
	/*public void IdAllocation(String Ward,String Room,String temp)
	{
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("update ward set id=? where ward=? AND room=?");
			ps.setString(1,temp);
			ps.setString(2,Ward);
			ps.setString(3,Room);
			ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
			
	}*/
}
