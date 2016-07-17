import java.sql.*;

class  DbaseMetaData
{
	public static void main(String[] args) 
	{
		try
		{
						
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:dsn3i","sa","sa");
			
			DatabaseMetaData dbs = con.getMetaData();
			System.out.println(dbs.getURL());
			System.out.println(dbs.getDriverName());
			System.out.println(dbs.getDriverVersion());
}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}