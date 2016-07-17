import java.sql.*;

class OrclProCall
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.10:1521:orcl","hr","hr");
		
		//----------------
		Statement stmt=con.createStatement();
			CallableStatement myStmt = con.prepareCall("{call get_dname(?,?)}");
			myStmt.setInt(1,Integer.parseInt(args[0]));
			myStmt.registerOutParameter(2,Types.VARCHAR);
			myStmt.execute();
			System.out.println ("Dept Name :  "+myStmt.getString(2));
			myStmt.close();
		con.close();
		}catch(Exception e)
		{System.out.println(e);
		}
	}
}////////////////////////////////////////////////////////////////
/*CREATE OR REPLACE PROCEDURE GET_NAME(D_ID IN NUMBER, D_NAME OUT VARCHAR2(25))
IS
BEGIN
	SELECT DEPARTMENT_NAME IN D_NAME
	FROM DEPARTMENTS 
	WHERE DEPARTMENT_ID=D_ID;
END GET_NAME;
*/