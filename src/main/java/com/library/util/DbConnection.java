package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String DB_URL = "mysql-109259b6-ibtissammanadir4-dba6.f.aivencloud.com";
    private static final String USER = "avnadmin";
    private static final String PASS = "AVNS_xgiApOlBpqgQgrSzpXf";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found: " + e.getMessage());
            throw new SQLException("Error connecting to database", e);
        }
    }
}