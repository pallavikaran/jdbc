import java.sql.*;
class  JdbcOracleConn
	{
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.10:1521:orcl","hr","hr");
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Connection con=DriverManager.getConnection("jdbc:odbc:dsn3i","sa","sa");
		Statement st= con.createStatement();
			st.execute("create table Batch_3i(Emp_id number, Emp_name varchar2(25))");
		   ResultSet rs= st.executeQuery("select DEPARTMENT_ID,DEPARTMENT_NAME from DEPARTMENTS");
		   while(rs.next())
			{
					System.out.println(rs.getInt(1)+"  "+rs.getString(2));
					//System.out.println(rs.getString(1)+"   "+rs.getDouble(2));
			}
			rs.close();
			con.close();
		}catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
