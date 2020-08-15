package com.company.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Handler extends Configs{
    Connection connection;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String connstring="jdbc:mysql://"+dbhost+":"+dbport+"/"+dbname+"?useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(connstring,dbuser,dbpassword);

        return connection;
    }
}
