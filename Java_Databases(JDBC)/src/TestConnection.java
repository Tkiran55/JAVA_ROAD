import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/Testdb";
            String user = "root";
            String password = "merosql";

            try {
                Connection conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the database!");
                System.out.println(conn);
                conn.close();
            } catch (SQLException e) {
                System.out.println("Connection failed: " + e.getMessage());
            }

    }
}
