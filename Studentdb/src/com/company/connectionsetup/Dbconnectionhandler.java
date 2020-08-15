package com.company.connectionsetup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnectionhandler extends Credentials {
    Connection connection;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String connectionurl="jdbc:mysql://"+dbhost+":"+dbport+"/"+dbname+"?useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(connectionurl,dbadmin,dbpassword);


        return connection;
    }
}
