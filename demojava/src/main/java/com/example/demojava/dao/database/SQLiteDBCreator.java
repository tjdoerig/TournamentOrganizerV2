package com.example.demojava.dao.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDBCreator {
    private static final String DB_NAME = "example.db";

    public static void main(String[] args) {
        createDatabase();
    }

    public static void createDatabase() {
        Connection connection = null;
        Statement statement = null;

        try {
            // Register the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Open a connection to the database
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_NAME);

            // Create a new table
            statement = connection.createStatement();
            String sql = "CREATE TABLE users (" +
                    "id INTEGER PRIMARY KEY," +
                    "name TEXT NOT NULL," +
                    "email TEXT NOT NULL UNIQUE," +
                    "password TEXT NOT NULL)";
            statement.executeUpdate(sql);

            System.out.println("Database created successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
