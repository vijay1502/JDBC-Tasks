package com.stackroute;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {
    public void rowData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/user");
            rowSet.setUsername("root");
            rowSet.setPassword("root");
            rowSet.setCommand("select * from details");
            rowSet.execute();
            while (rowSet.next()) {
                System.out.println(rowSet.getString(1));
                System.out.println(rowSet.getString(2));
                System.out.println(rowSet.getString(3));
                System.out.println("");
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

}
