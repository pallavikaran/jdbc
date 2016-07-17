import java.sql.*;
class JdbcDemo 
{
	public static void main(String[] args) 
	{try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn3i","sa","sa");
		Statement st= con.createStatement();
		//st.execute("create table Employee ( emp_no integer, sal float)");
		int i=st.executeUpdate("insert into students values("+args[0]+", '"+args[1]+"',"+args[2]+")");
		//int i=st.executeUpdate("delete from students where score>=80.00");
		con.close();
		//System.out.println(i+" rows inserted");
	}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
