package hm1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PatientDao {

	
	public static int register(int patientid,String fname,String lname,String gender,String dob,String bloodgrp,String phno1,String phno2,String email,String problem,String ward,String room,String address,String city,String password,String fees,String doa,String dol){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,patientid);
			ps.setString(2,fname);
			ps.setString(3,lname);
			ps.setString(4,gender);
			ps.setString(5,dob);
			ps.setString(6,bloodgrp);
			ps.setString(7,phno1);
			ps.setString(8,phno2);
			ps.setString(9,email);
			ps.setString(10,problem);
			ps.setString(11,ward);
			ps.setString(12,room);
			ps.setString(13,address);
			ps.setString(14,city);
			ps.setString(15,password);
			ps.setString(16,fees);
			ps.setString(17,doa);
			ps.setString(18,dol);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){System.out.println(e);}
		return status;
	}

}
