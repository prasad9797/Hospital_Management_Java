package hm1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WardDeallocation {
	
	public static void Set(String patID)
	{
		try {
			System.out.println("deallo "+patID);
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("update ward set id=null where id=?");
		ps.setString(1,patID);
		ps.executeUpdate();
	/*	if(rs.next())
		{
			 room = rs.getString(2);
			System.out.println(""+room);
		}*/
		
		PreparedStatement ps1=con.prepareStatement("update patient set room=null where patientid=?");
		//ps1.setString(1,room);
		ps1.setString(1,patID);
		ps1.executeUpdate();
		
		con.close();
		}catch(Exception e){System.out.println(e);}
	}

}
