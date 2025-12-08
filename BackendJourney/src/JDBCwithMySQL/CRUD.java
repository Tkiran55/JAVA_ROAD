package JDBCwithMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    public static void main(String[] args) {

        try(Connection connection = DbConnection.getConnection()) {
            System.out.println("Database Connected Successfully.");

            Statement statement = connection.createStatement();

            //creating table
            String sqlCreate = "create table if not exists products (id int primary key, name varchar(255), price double)";
            statement.execute(sqlCreate);

            //insert data
//            String sqlInsert = "insert into products values (2, 'Gaming keyboard', 99.99)";
//            statement.execute(sqlInsert);
//            System.out.println("Product added.");


            //update data
//            String sqlUpdate = "update products set price= 50 where id = 2";
//            statement.execute(sqlUpdate);
//            System.out.println("Product updated.");


            //delete data
//            String sqlDelete = "delete from products where id = 2";
//            statement.execute(sqlDelete);
//            System.out.println("Product deleted");

            //read data
            String sqlSelect = "select * from products";
            ResultSet resultSet = statement.executeQuery(sqlSelect);

            while(resultSet.next()){
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");

                System.out.println("DB row: " + name + " - $" + price);
            }

        } catch (SQLException e) {
            System.out.println("Database Failed.");
//            e.printStackTrace();
        }
    }
}
