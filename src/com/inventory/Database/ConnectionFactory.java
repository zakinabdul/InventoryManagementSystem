/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author asjad
 */

//Class to retrieve connection for database and login verification.
public class ConnectionFactory {

    // SQLite DB file will be created in ./data/inventorydb.sqlite
    static final String url = "jdbc:sqlite:./data/inventorydb.sqlite";

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public ConnectionFactory(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            statement = conn.createStatement();
            
            // Configure SQLite for better concurrency and performance
            statement.execute("PRAGMA foreign_keys = ON;");
            statement.execute("PRAGMA journal_mode = WAL;");  // Write-Ahead Logging for better concurrency
            statement.execute("PRAGMA synchronous = NORMAL;"); // Better performance
            statement.execute("PRAGMA busy_timeout = 30000;"); // 30 second timeout for locks
            statement.execute("PRAGMA cache_size = 10000;"); // Larger cache
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection(url);
                statement = conn.createStatement();
                
                // Configure SQLite for better concurrency and performance
                statement.execute("PRAGMA foreign_keys = ON;");
                statement.execute("PRAGMA journal_mode = WAL;");
                statement.execute("PRAGMA synchronous = NORMAL;");
                statement.execute("PRAGMA busy_timeout = 30000;");
                statement.execute("PRAGMA cache_size = 10000;");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    // Method to close connection properly
    public void closeConnection() {
        try {
            if (resultSet != null && !resultSet.isClosed()) {
                resultSet.close();
            }
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Login verification method
    public boolean checkLogin(String username, String password, String userType){
        String query = "SELECT * FROM users WHERE username=? AND password=? AND usertype=? LIMIT 1";
        
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            conn = getConn();
            // Use prepared statement to prevent SQL injection
            java.sql.PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, userType);
            
            resultSet = pstmt.executeQuery();
            boolean loginSuccess = resultSet.next();
            
            // Clean up resources
            resultSet.close();
            pstmt.close();
            
            return loginSuccess;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // Always close the connection
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
