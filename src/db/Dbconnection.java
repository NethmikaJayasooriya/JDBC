package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    private static Dbconnection DB_CONNECTION;
    private Connection connection;

    private Dbconnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc_dsmp5","root","1234");
    }
    public static Dbconnection getInstance() throws SQLException, ClassNotFoundException {
        if (DB_CONNECTION == null) {
            DB_CONNECTION = new Dbconnection();
        }
        return DB_CONNECTION;
    }
    public Connection getConnection() {
        return connection;
    }
}