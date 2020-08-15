package com.company;

import com.company.helper.Handler;
import com.mysql.cj.jdbc.PreparedStatementWrapper;

import java.sql.*;

public class Main {
    static private  Handler handler;
    static private  Connection connection;
    static private  PreparedStatement preparedStatement;


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// write your code here
        handler=new Handler();

        connection=handler.getConnection();
     //   writetodb();
        //readfromdb();
       // updatedb("pr21",27,"Sherpur","Pritish","Dam",1);
        deletefromdb(1);




        /**
         * The connection has been made by config and handler class later
         * The following is the process of making the connection
         */
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        Connection connection= DriverManager.getConnection
//                ("jdbc:mysql://localhost:3306/login?useLegacyDatetimeCode=false&serverTimezone=UTC","root","Root1234");


        System.out.println("Connected to "+handler.getConnection().getCatalog());
    }

    private static void writetodb() throws SQLException {
        String insert="INSERT INTO user (username,age,address,firstname,lastname)"+"VALUES(?,?,?,?,?)";
        preparedStatement=connection.prepareStatement(insert);
        preparedStatement.setString(1,"putu");
        preparedStatement.setInt(2,20);
        preparedStatement.setString(3,"Sherpur");
        preparedStatement.setString(4,"Aunidra");
        preparedStatement.setString(5,"Dam");
        preparedStatement.executeUpdate();
    }
    private static void readfromdb() throws SQLException {
        String query="SELECT * FROM user";
      PreparedStatement  preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet= preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("names: "+resultSet.getString("username")+" "+resultSet.getInt("age")+
            " "+resultSet.getString("address")+" "+resultSet.getString("firstname")+" "+resultSet.getString("lastname"));
        }
    }
    private static void updatedb(String username,int age,String address,String firstname,String lastname,int id ) throws SQLException {
        String query="UPDATE user SET username=?,age=?,address=?,firstname=?,lastname=?"+" WHERE userid=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,username);
        preparedStatement.setInt(2,age);
        preparedStatement.setString(3,address);
        preparedStatement.setString(4,firstname);
        preparedStatement.setString(5,lastname);
        preparedStatement.setInt(6,id);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
    private static void deletefromdb(int id) throws SQLException {
        String query="DELETE  FROM user"+" WHERE userid=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }
}
