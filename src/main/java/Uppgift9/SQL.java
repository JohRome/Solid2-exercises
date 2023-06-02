package Uppgift9;

import java.sql.*;
public class SQL implements Database {

    private Connection connection;
    private final String databaseName;

    public SQL(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + databaseName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
