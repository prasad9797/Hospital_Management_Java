package hm1;

//import hm1.WardBean;

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

public class WardSelection {

	private JFrame frame;
	private int avail1=1,avail2=1,avail3=1,avail4=1,avail5=1;
	 String Room;
	static String Ward;
	String ID;
	static String temp;
	int set,check1,check2,check3,check4,check5,found;
	static int result;
	static String room;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//public void inpuT()
		//{
			//Ward=WaRd;
			//temp=TeMp;

		//}
		//Ward=ward;
		//temp=temP;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("initial "+temp+""+Ward);
					WardSelection window = new WardSelection();
					System.out.println(""+temp+""+Ward);
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
	public WardSelection() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check1==1)
				{
					check1=0;
					set=0;
					Room=null;
					btnNewButton.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
					btnNewButton.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/green.jpg")));
					Room="1";
				//	IdAllocation(Ward,Room,temp);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
					btnNewButton_1.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
					btnNewButton_1.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/green.jpg")));
					//Ward="General";
					Room="2";
					//temp="123";
					//IdAllocation(Ward,Room,temp);
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
					btnNewButton_2.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
				}
				else if(avail3==0)
				{
					JOptionPane.showMessageDialog(null, "Room is not available");
				}
				
				else if(set==1)
					JOptionPane.showMessageDialog(null, "You Have Already Selected A Room");
				else
				{
					//temp="237";
					check3=1;
					set=1;
					btnNewButton_2.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/green.jpg")));
					Room="3";
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
					btnNewButton_3.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
					btnNewButton_3.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/green.jpg")));
					Room="4";
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
					btnNewButton_4.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
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
				//	temp="25";
					btnNewButton_4.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/green.jpg")));
					Room="5";
				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/white.jpg")));
		btnNewButton_4.setBounds(177, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnBook = new JButton("BOOK");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ft  "+Room);
				if(Room!=null)
				{
				//public void IdAllocation(String Ward,String Room,String temp)
				 result = Integer.parseInt(Room);
				System.out.println("22  "+result);
				if(Room==null)
					found=0;
				else 
					found=1;
				PatientRegister.roomCheck(found);
				StaffPatientRegister.roomCheck(found);
				
				PatientRegister.recive(result);
				
					try{
						Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("update ward set id=? where ward=? AND room=?");
						System.out.println("hello"+Room);
						ps.setString(1,temp);
						ps.setString(2,Ward);
						ps.setString(3,Room);
						ps.executeUpdate();
						con.close();
						
							JOptionPane.showMessageDialog(null, "Room Is Registered");

						frame.dispose();
					}catch(Exception e){System.out.println(e);}
						
			}
				else
					JOptionPane.showMessageDialog(null, "Please Select A Room");
			}
		});
		btnBook.setBounds(154, 205, 89, 23);
		frame.getContentPane().add(btnBook);
		
		JButton button = new JButton("");
		button.setBounds(1, 1, 1, 1);
		frame.getContentPane().add(button);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	PatientRegister.main(new String[] {});
				if(Room==null)
					found=0;
				else 
					found=1;
				PatientRegister.roomCheck(found);
				StaffPatientRegister.roomCheck(found);
				frame.dispose();
			}
		});
		btnBack.setBounds(55, 205, 89, 23);
		frame.getContentPane().add(btnBack);
		
		try{
			//Ward= "General";
			//temp=null;
			System.out.println("check 1 ");
			Connection con=DB.getConnection();
			System.out.println("check 2 ");
			PreparedStatement ps=con.prepareStatement("select * from ward where ward=?");
			ps.setString(1,Ward);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				//avail1=1;avail2=1;avail3=1;avail4=1;avail5=1;
				Room = rs.getString(2);
				ID = rs.getString(3);
				int result = Integer.parseInt(Room);
				System.out.println(" "+Room+" "+ID);
				
				if(result==1 && ID!=null) 
				{
					System.out.println("1 "+Room+" "+ID);
					avail1=0;
					btnNewButton.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/red.png")));
				}
				if(result==2 && ID!=null) 
				{
					System.out.println("2 "+Room+" "+ID);
					avail2=0;
					btnNewButton_1.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/red.png")));
				}
				
				if(result==3 && ID!=null) 
				{
					System.out.println("3 "+Room+" "+ID);
					avail3=0;
					btnNewButton_2.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/red.png")));
				}
				
				if(result==4 && ID!=null) 
				{
					System.out.println("4 "+Room+" "+ID);
					avail4=0;
					btnNewButton_3.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/red.png")));
				}
				
				if(result==5 && ID!=null) 
				{
					System.out.println("5 "+Room+" "+ID);
					avail5=0;
					btnNewButton_4.setIcon(new ImageIcon(WardSelection.class.getResource("/hm1/red.png")));
				}
			}
			
			Room=null;
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		
	}

	public static void input(String ward2, String patID) {
		
		Ward=ward2;
		temp=patID;
		System.out.println("input "+temp+""+Ward);
	//	int result = Integer.parseInt(Room);
		//System.out.println("111 "+result);
	//	return result;
	}
	
	public static void Set(String patID)
	{
		try {
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from ward where id=?");
		ps.setString(1,patID);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			 room = rs.getString(2);
			//System.out.println(""+room);
		}
		
		PreparedStatement ps1=con.prepareStatement("update patient set room=? where patientid=?");
		ps1.setString(1,room);
		ps1.setString(2,patID);
		ps1.executeUpdate();
		
		con.close();
		}catch(Exception e){System.out.println(e);}
	}
}
