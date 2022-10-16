package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    public static Connection conn;
    
    public String getconn() {

    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    	}
    	catch(ClassNotFoundException e) {
    		e.printStackTrace();
    		return null;
    	}
    	
    	try{
    		
    		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ntss_db","root","");
    		
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    		return null;
    	}
    	if(conn!=null) {

    		System.out.println("Success IN CONNECTION");
    		return "Connected";
    	}
    	else {
    		System.out.println("ERROR IN CONNECTION");
    		return "Not Connected";
    	}
    }

}