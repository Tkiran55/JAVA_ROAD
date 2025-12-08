package JDBCwithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/ims";
    private static final String user = "root";
    private static final String pass = "merosql";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, pass);
    }

}
