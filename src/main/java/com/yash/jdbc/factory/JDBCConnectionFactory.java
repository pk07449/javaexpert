package com.yash.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by pankaj on 2/24/2017.
 */
public class JDBCConnectionFactory {

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {

            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:system",
                    "system",
                    "password");
            connection.setAutoCommit(false);
            return connection;

        } catch (Exception e) {
            System.err.println("Problem is in creating exception " + e.getMessage());
            throw new RuntimeException("Problem is in creating exception");
        }


    }

}

