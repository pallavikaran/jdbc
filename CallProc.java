
import java.sql.*;
class CallProc
{
	public static void main(String[] args) 
	{
		try
		{	
			double scr;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:ashishdsn");
			CallableStatement cs = con.prepareCall("exec getScore ?");
			cs.setInt(1, Integer.parseInt(args[0]));
			ResultSet rs = cs.executeQuery();
			while (rs.next())
			{
				scr = rs.getDouble("score");
				System.out.println(scr);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
}
}