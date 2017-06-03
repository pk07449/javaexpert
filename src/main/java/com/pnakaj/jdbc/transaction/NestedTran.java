package com.pnakaj.jdbc.transaction;

import java.sql.Connection;
import java.sql.DriverManager;

public class NestedTran{
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection=DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:system","system","password");
        connection.setAutoCommit(false);





        connection.close();







    }
}
