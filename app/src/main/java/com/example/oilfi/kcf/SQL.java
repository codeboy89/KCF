package com.example.oilfi.kcf;

import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class SQL {
    public SQL() {
    }
    private String datas ="gfddf";
    final String DB_URL = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9273640";
    final String DB_DRV = "com.mysql.cj.jdbc.Driver";
    final String DB_USER = "sql9273640";
    final String DB_PASSWD = "sm7aW8Pptr";
    Vector columnNames = new Vector();

    public String getDatas() {
        return datas;
    }

    Vector data = new Vector();

    public void connect()
    {
        try
        {
            //  Connect to the Database

            Class.forName(DB_DRV);
            Connection connection = DriverManager.getConnection(DB_URL , DB_USER , DB_PASSWD);

            //  Read data from a table
            String sql = "SELECT * FROM audit";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData md = rs.getMetaData();
           /*
            int columns = md.getColumnCount();

            //  Get column names
            for ( int i = 1 ; i <= columns ; i++ )
            {
                columnNames.addElement(md.getColumnName(i));
            }

            //  Get row data
            while ( rs.next() )
            {
                Vector row = new Vector(columns);
                for ( int i = 1 ; i <= columns ; i++ )
                {
                    row.addElement(rs.getObject(i));
                    this.datas += rs.getObject(i);
                }
                data.addElement(row);
            }
            */
            this.datas = md.toString();

            rs.close();
            stmt.close();
        } catch ( ClassNotFoundException | SQLException ex )
        {

        }
    }
}
