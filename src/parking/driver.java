package parking;

import java.sql.*;
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Read();
		Write();
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}

	


	public static void Read() {
		// TODO Auto-generated method stub
		try {
		//get a connection to database
		Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Parking_DataBase","root","MySQLpass1");
	
		//create statement
		Statement myStmt = myConn.createStatement();
		//execute SQL query
		ResultSet myRs=myStmt.executeQuery("select * from user");	
			
		//Process the result
		while(myRs.next()) {
			System.out.println(myRs.getString("last_name")+","+myRs.getString("first_name")+",");
			
		}		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}


	public static void Write() {
		// TODO Auto-generated method stub
		try {
		//get a connection to database
		Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Parking_DataBase","root","MySQLpass1");
	
		//create statement
		Statement myStmt = myConn.createStatement();
		//execute SQL query
		String sql="insert into user" +"(first_name,last_name,email,password)"+"values('sam', 'smith' ,'samsmith', 'sampass')";
		
		myStmt.executeUpdate(sql);
		System.out.println("Insert complete");
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}

	
}
