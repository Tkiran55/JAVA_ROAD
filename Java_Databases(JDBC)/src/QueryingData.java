import java.sql.*;

public class QueryingData {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Testdb";
        String user = "root";
        String password = "merosql";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * From students")){

            while(rs.next()){
                System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
