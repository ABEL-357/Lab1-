package com.site;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final String URL = "jdbc:mysql://localhost:3306/myapp";
    private static final String USER = "root";
    private static final String PASSWORD = "AGMMS@0975753306";
    public static void main(String[] args)
    {
        System.out.println("Connecting to database...");
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Database connected successfully!");        }
        catch (SQLException e) {
            System.err.println("Database connection failed!");
        }
    }
}
