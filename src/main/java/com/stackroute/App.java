package com.stackroute;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JdbcDemo jdbcDemo=new JdbcDemo();
        jdbcDemo.jdbcDisplay();
        JdbcBatchProcessingDemo jdbcBatchProcessingDemo=new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.batchProcessor();
        DataBaseMetaDataDemo dataBaseMetaDataDemo=new DataBaseMetaDataDemo();
        dataBaseMetaDataDemo.dataBaseMetaData();
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.rowData();
    }
}
