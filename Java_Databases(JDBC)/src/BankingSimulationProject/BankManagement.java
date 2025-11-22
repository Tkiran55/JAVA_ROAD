package BankingSimulationProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankManagement {

    public boolean createAccount(String username, String password) throws SQLException {
        String sql = "insert into accounts(username, password, balance) values (?,?, 0)";

        try(Connection connection = DbConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, username);
            statement.setString(2, password);

            return statement.executeUpdate() >0;
        }
    }

    public int login(String username, String password) throws SQLException {
        String sql = "select id from accounts where username = ? and password = ?";

        try(Connection connection = DbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) return resultSet.getInt("id");
            return -1;
        }
    }

    public double getBalance(int id) throws SQLException {
        String sql = "Select balance from accounts where id =?";

        try(Connection connection = DbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) return resultSet.getDouble("Balance");
            return 0;
        }
    }

    public boolean deposit(int id, double amount) throws SQLException {
        String sql = "update accounts set balance = balance + ? where id = ?";

        try(Connection connection = DbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setDouble(1, amount);
            statement.setInt(2, id);

            return statement.executeUpdate() >0;
        }
    }

    public boolean withdraw(int id, double amount) throws SQLException {
        String checkSql = "select balance from accounts where id = ?";
        String updateSql = "update accounts set balance = balance - ? where id = ?";

        try(Connection connection = DbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(checkSql)){

            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if(rs.next() && rs.getDouble("Balance") >= amount){
                PreparedStatement statement1 = connection.prepareStatement(updateSql);
                statement1.setDouble(1, amount);
                statement1.setInt(2, id);

                return statement1.executeUpdate() >0;
            }
            return false;
        }
    }

    public boolean transfer(int fromId, String toUsername, double amount) throws SQLException {
        String sql = "select id from accounts where username = ?";
        try(Connection connection = DbConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, toUsername);

            ResultSet rs = statement.executeQuery();
            if(!rs.next()) return false;
            int toId = rs.getInt("id");

            if(!withdraw(fromId,amount)) return false;

            return deposit(toId, amount);
        }
    }

}
