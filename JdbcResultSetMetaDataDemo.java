import java.sql.*;

class JdbcResultSetMetaDataDemo 
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con= DriverManager.getConnection("jdbc:odbc:dsn3i","sa","sa");
			PreparedStatement ps=con.prepareStatement("select * from students");
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd= rs.getMetaData();
			System.out.println("No of Columns: "+rsmd.getColumnCount());
			for (int i=1;i<=rsmd.getColumnCount() ;i++ )
			{
				System.out.println("Name of Column: "+rsmd.getColumnName(i)+"  Data Type= "+rsmd.getColumnTypeName(i));
			}

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
/*
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MyOra","scott","tiger");
*/
