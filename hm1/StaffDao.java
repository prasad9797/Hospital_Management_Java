package hm1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StaffDao {
	
	
	public static int register(int staffid,String fname,String lname,String gender,String dob,String bloodgrp,String post,String phno1,String phno2,String email,String address,String city,String password)
	{
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into staff values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,staffid);
			ps.setString(2,fname);
			ps.setString(3,lname);
			ps.setString(4,gender);
			ps.setString(5,dob);
			ps.setString(6,bloodgrp);
			ps.setString(7,post);
			ps.setString(8,phno1);
			ps.setString(9,phno2);
			ps.setString(10,email);
			ps.setString(11,address);
			ps.setString(12,city);
			ps.setString(13,password);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){System.out.println(e);}
		return status;
	}
	

}
