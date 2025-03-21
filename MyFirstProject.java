package demoProject;
import java.sql.*;

public class MyFirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url = "jdbc:mysql://localhost:3307";
         String user = "root";
         String pass = "";
         
         try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 
        	 Connection con = DriverManager.getConnection(url,user,pass);
        	 System.out.println("database connected successfully ");
        	 
        	 
        	 con.close();
        			 
         } catch(ClassNotFoundException | SQLException e) {
        	 e.printStackTrace();
         }
	}

}
