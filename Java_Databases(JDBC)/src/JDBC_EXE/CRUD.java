package JDBC_EXE;

import java.sql.*;

public class CRUD {

    private static final String url ="jdbc:mysql://localhost:3306/studentsdb";
    private static final String user ="root";
    private static final String pass ="merosql";

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(url, user, pass)){

            System.out.println("Database connected successfully.");

            insertInfo(connection, "Kiran", 27, "kiran@gmail.com");
            insertInfo(connection, "Hari", 20, "harin@gmail.com");

            readInfo(connection);

            updateInfo(connection, "hari@gmail.com", 2);

            readInfo(connection);

            deleteInfo(connection, 2);

            readInfo(connection);

        } catch (SQLException e) {
            System.out.println("Database Connection Failed");
            throw new RuntimeException(e);
        }


    }




    public static void insertInfo(Connection connection, String name, int age, String email){
        String sql = "insert into students (name, age, email) values (?,?,?)";

        try(PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, email);

            int rows = stmt.executeUpdate();
            System.out.println(rows + "Data inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Something went wrong");
            throw new RuntimeException(e);
        }

    }

    public static void readInfo(Connection connection){
        String sql = "Select * from students";

        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            System.out.println("Students Records: ");
            System.out.println("ID | NAME        | AGE | EMAIL");
            System.out.println("---|-------------|-----|--------------------");
            while(rs.next()){
                System.out.printf("%2d | %-11s | %3d | %s%n", rs.getInt("ID"),
                        rs.getString("NAME"),
                        rs.getInt("AGE"),
                        rs.getString("EMAIL"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void updateInfo(Connection connection, String email, int id){
        String sql = "update students set email = ? where id = ?";

        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, email);
            stmt.setInt(2, id);

            int rows = stmt.executeUpdate();
            System.out.println(rows + "Successfully updated");

        } catch (SQLException e) {
            System.out.println("Update failed.");
            throw new RuntimeException(e);
        }

    }
    public static  void deleteInfo(Connection connection, int id){
        String sql = "delete from students where id = ?";

        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();
            System.out.println(rows + "Delected Successfully");

        } catch (SQLException e) {
            System.out.println("Deletion failed.");
            throw new RuntimeException(e);
        }

    }
}
