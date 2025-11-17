package JDBC_EXE;

//Write a Java program that:
//Connects to a database named company. (use Mysql)
//Inserts a new employee record (name, department, salary).
//Then retrieves and prints all employees from the database.

import java.sql.*;

public class ExerciseOne {
    private static final String url = "jdbc:mysql://localhost:3306/companydb";
    private static final String user = "root";
    private static final String password = "merosql";

    public static void main(String[] args) {

        try {
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Database Connected Successfully.");

                insertEmployeesRecords(conn, "John","Programmer" ,30000);
                insertEmployeesRecords(conn, "Cena","Finance" ,70000);

                displayEmployeesRecord(conn);

            }
        } catch(SQLException exception){
            System.out.println("Database Connection failed." + exception.getMessage());
        }

    }

    //Inserting Data to Table
    public static void insertEmployeesRecords(Connection conn, String name, String department, double salary){

        String sql = "INSERT INTO employees (name, department, salary) VALUES (?,?,?)";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, name);
            pstmt.setString(2, department);
            pstmt.setDouble(3, salary);

            int rowsInserted = pstmt.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Employee inserted successfully: " + name);
            }
        } catch (SQLException e) {
            System.out.println("Error inserting employee's record." + e.getMessage());
            throw new RuntimeException(e);
        }

    }


    //Displaying Data From Table
    public static void displayEmployeesRecord(Connection conn){
        String sql = "SELECT * FROM employees";

        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            System.out.println("All Employee: ");

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                double salary = rs.getDouble("salary");

                System.out.printf("ID: %d | NAME: %s | Dept: %s | Salary: %2f%n", id, name, department, salary);
            }
        }catch(SQLException e) {
            System.out.println("Error retrieving data." + e.getMessage());
        }
    }
}
