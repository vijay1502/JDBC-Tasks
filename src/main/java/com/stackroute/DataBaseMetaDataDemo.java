package com.stackroute;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseMetaDataDemo {
    public void dataBaseMetaData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
            DatabaseMetaData databaseMetaData= connection.getMetaData();
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getMaxColumnsInIndex());
            System.out.println(databaseMetaData.getConnection());
            System.out.println(databaseMetaData.getDriverVersion());
        } catch (
                SQLException E) {
            E.printStackTrace();
        }
    }
}
