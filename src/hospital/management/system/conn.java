package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    // Declare the connection and statement objects
    Connection connection;
    Statement statement;

    public conn() {
        try {
            // Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_Management_System", "root", "sairam1212@");
            // Create a statement object to execute SQL queries
            statement = connection.createStatement();

            // Example query execution (replace with your actual query)
            String sql = "SELECT * FROM patient_info";
            statement.executeQuery(sql); // Execute the query using the statement
        } catch (Exception e) {
            // Log any SQLExceptions using logger
            e.printStackTrace();
        }
    }
}
