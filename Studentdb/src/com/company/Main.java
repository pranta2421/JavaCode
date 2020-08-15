package com.company;

import com.company.connectionsetup.Dbconnectionhandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
   static private Dbconnectionhandler dbconnectionhandler;
   static private Connection connection;
    static private PreparedStatement preparedStatement;


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// write your code here
        dbconnectionhandler=new Dbconnectionhandler();
        connection=dbconnectionhandler.getConnection();
      //  writetodb("Aunidra",20,"6b");
       // readfromdb();
       // updatedb("Prodip",60,"Professor",1);
        deletefromdb(2);


        System.out.println("Connected to "+dbconnectionhandler.getConnection().getCatalog());


    }

    private static void deletefromdb(int rollno) throws SQLException {
        String query="DELETE FROM class12 where rollno=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,rollno);
        preparedStatement.execute();
    }

    private static void readfromdb() throws SQLException {
        String query="Select * from class12";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet= preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("name: " + resultSet.getString("name") + " age:" + resultSet.getInt("age")
                    + " grade:" + resultSet.getString("grade"));
        }
    }

    private static void writetodb(String name,int age,String grade) throws SQLException {
        String query="INSERT INTO class12 (name,age,grade)"+" Values(?,?,?)";
        preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,age);
        preparedStatement.setString(3,grade);
        preparedStatement.executeUpdate();

    }
    private static void updatedb(String name,int age,String grade,int rollno) throws SQLException {
        String query="UPDATE class12 SET name=?,age=?,grade=?"+" where rollno=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,age);
        preparedStatement.setString(3,grade);
        preparedStatement.setInt(4,rollno);
        preparedStatement.executeUpdate();

    }

}
