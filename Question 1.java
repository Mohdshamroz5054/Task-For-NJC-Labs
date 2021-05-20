import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args){
		try {
			System.out.println("Database connecting...");
			String connectionUrl = "jdbc:derby:C:/Users/Shamroz/Desktop/DerbyDatabase;create=true";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement createPeopleTableStatement = connection.createStatement();
			createPeopleTableStatement.executeUpdate("create table Users(name varchar(16), dob integer, id varchar(16), primary key(name))");
			System.out.println("Users table created.");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("QUESTION 1 COMPLETED");
	}
}