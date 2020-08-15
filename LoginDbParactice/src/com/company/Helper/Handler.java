package com.company.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Handler extends Config {
    Connection connection;
    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String url="jdbc:mysql://"+dbhost+":"+dbport+"/"+dbname+"?useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(url,dbusername,dbuserpassword);
        return connection;
    }
}
