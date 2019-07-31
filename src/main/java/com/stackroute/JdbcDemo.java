package com.stackroute;

import java.sql.*;

public class JdbcDemo {

    private Connection connection;
    private ResultSet resultSet;
    private Statement statement;
    public void jdbcDisplay(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from details");){
            while (resultSet.next()) {
                System.out.print(" "+resultSet.getString(1));
                System.out.print(" "+resultSet.getString(2));
                System.out.print(" "+resultSet.getString(3));
                System.out.print(" "+resultSet.getString(4));
                System.out.println("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }



}
