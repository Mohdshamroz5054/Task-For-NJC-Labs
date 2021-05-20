import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args){
		try {
			System.out.println("Connecting to database.");
			String connectionUrl = "jdbc:derby:C:/Users/Shamroz/Desktop/DerbyDatabase";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement insertRowStatement = connection.createStatement();
			
			insertRowStatement.executeUpdate("insert into Users (name, dob, id) values('Shamroz', 2001, 012345)");
			System.out.println("Added Ada to the People table.");
			
			insertRowStatement.executeUpdate("insert into Users (name, dob, id) values('Amit', 2000, 023465)");
			System.out.println("Added Grace to the People table.");
			
			insertRowStatement.executeUpdate("insert into Users (name, dob, id) values('Mohan', 2007, 014554)");
			System.out.println("Added Stanley to the People table.");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("QUESTON 2 COMPLETED");
	}
}