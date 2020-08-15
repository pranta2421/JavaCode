package com.company;

import com.company.Helper.Handler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    static private Handler handler;
    static private Connection connection;
    static private PreparedStatement preparedStatement;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// write your code here
        handler=new Handler();
        connection=handler.getConnection();
      //  writetodb();
        readfromdb();


        System.out.println("Connected to "+handler.getConnection().getCatalog());
    }

    private static void writetodb() throws SQLException {

        String insert="INSERT INTO users(firstname,lastname,username,age,address)"+"VALUES(?,?,?,?,?)";
        preparedStatement=connection.prepareStatement(insert);
        preparedStatement.setString(1,"Prodip");
        preparedStatement.setString(2,"Dam");
        preparedStatement.setString(3,"pulok");
        preparedStatement.setInt(4,60);
        preparedStatement.setString(5,"Sherpur");
        preparedStatement.executeUpdate();
    }
    private static void readfromdb() throws SQLException {
        String query="SELECT * FROM users";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("firstname")+" "+resultSet.getString("lastname")
            +" "+resultSet.getString("username")+" "
            +resultSet.getInt("age")+" "+resultSet.getString("address"));
        }
    }

}
