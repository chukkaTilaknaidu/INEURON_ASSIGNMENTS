package Tarun;
import java.sql.*;

import java.util.*;


public class Tilaknaidu {

	public static void main(String[] args) throws Exception {
		
		try {
			
			//loading and register the driver is automatically done from jdk 4. x version 
			//  when we execute the code  Drivermanager class is execute , drivermanager class have get connection method ,get connection method requires url parameter , with url jvm knows which database is developer is using ,jvm looks class path ,in that class path particular folder called META INF, loads and register the driver.
		
			
		
		String url="jdbc:mysql:///tilaknaidu";   //"jdbc:mysql://localhost:3306/tilaknaidu"
		String uname="root";
		String upassword="u19cs236";
		
		
		String query=" select * from tilaknaidu.exam";
		
		System.out.println("Connection established");
		
		Connection con=DriverManager.getConnection(url, uname, upassword);   // establishing the connection
		Statement st=con.createStatement(); // statement object is creating
		
		ResultSet rs= st.executeQuery(query); // executing the query

	while(rs.next()){
	int id=rs.getInt("id");
	String name=rs.getString("name");
	int marks=rs.getInt("marks");
	
	System.out.println(id+" "+" "+name+" "+marks);
		
		
	}
		
	//}  //while
		
		
		
		st.close();
		con.close();
		
		
		

		
		
		}//try
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		

	}

}
