import java.sql.*;
class  JdbcPSDemo //preparedStatement
{
	public static void main(String[] args) 
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn3i","sa","sa");

		PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?)");
			ps.setInt(1, Integer.parseInt(args[0]));
			ps.setString(2,args[1]);
			ps.setDouble(3,Double.parseDouble(args[2]));

		ps.executeUpdate();
////////////////////////////////////////////////////////////////////////
		ps=con.prepareStatement("select * from students where roll=?");
			ps.setInt(1, Integer.parseInt(args[0]));
ResultSet rs=	ps.executeQuery();

			if(rs.next())
			{
					System.out.println("Roll= "+rs.getInt("roll")+" Name= "+rs.getString("name")+" Score= "+rs.getDouble(3));
			}
 con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
