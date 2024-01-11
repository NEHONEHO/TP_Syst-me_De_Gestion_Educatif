package sqlDriver;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/SGE";
		String user = "root";
		String password = "strictement.69@";
		
		try {
			//1. get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SGE", "root", "strictement.69@");
			
			//2. create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from departements");
			
			//4. Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getInt("idDep")+" , "+myRs.getString("intituleDep")+" , "+myRs.getString("responsableDep"));
			}
		
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
