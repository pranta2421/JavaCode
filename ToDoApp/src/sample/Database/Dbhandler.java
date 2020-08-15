package sample.Database;

import sample.model.Task;
import sample.model.User;

import java.sql.*;

public class Dbhandler extends Configs {

    Connection connection;



    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String connstring="jdbc:mysql://"+dbhost+":"+dbport+"/"+dbname+"?useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection(connstring,admin,password);

        return connection;
    }

    public void signupuser(User user) throws SQLException, ClassNotFoundException {
        String insert="INSERT INTO "+Const.user_table+"("+Const.user_username+","+Const.user_firstname+","+
                Const.user_lastname+
                ","+Const.user_password+","+Const.user_location+","+Const.user_gender+") "+"VALUES(?,?,?,?,?,?)";

        PreparedStatement preparedStatement=getConnection().prepareStatement(insert);
        preparedStatement.setString(1,user.getUsername());
        preparedStatement.setString(2,user.getFirstname());
        preparedStatement.setString(3,user.getLastname());
        preparedStatement.setString(4,user.getPassword());
        preparedStatement.setString(5,user.getLocation());
        preparedStatement.setString(6,user.getGender());

        preparedStatement.executeUpdate();

    }
    
    public ResultSet getloginuser(User user){
        ResultSet resultSet = null;
        
        if (!user.getUsername().equals("")||!user.getPassword().equals("")){
            String query="select * from "+Const.user_table+" where "+Const.user_username+"=? AND "+Const.user_password+"=?";
            try {
                PreparedStatement preparedStatement=getConnection().prepareStatement(query);
                preparedStatement.setString(1,user.getUsername());
                preparedStatement.setString(2,user.getPassword());
               resultSet= preparedStatement.executeQuery();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("Enter credentials");
        }
        return resultSet;
        
    }

    public void inserttask(Task task){

        String insert="INSERT INTO "+Const.task_table+" ("+Const.user_userid+","+Const.task_date+","+Const.task_description+","+Const.task_task+") " +
                "values(?,?,?,?)";

        try {
            PreparedStatement preparedStatement=getConnection().prepareStatement(insert);
            preparedStatement.setInt(1,task.getUserid());
            preparedStatement.setTimestamp(2,task.getDatecreated());
            preparedStatement.setString(3,task.getDescription());
            preparedStatement.setString(4,task.getTask());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ResultSet getalltask(int task){

        ResultSet nooftask = null;

        String query="select count(*) from "+Const.task_table+" where "+Const.user_userid+"=?";

        try {
            PreparedStatement preparedStatement=getConnection().prepareStatement(query);
            preparedStatement.setInt(1,task);
          nooftask=  preparedStatement.executeQuery();
//            while (nooftask.next()){
//                return nooftask.getInt(1);
//            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return nooftask;
    }
    public ResultSet getalltaskbyuserid(int task){
        ResultSet resultSet = null;

        String query="select * from "+Const.task_table+" where "+Const.user_userid+"=?";

        try {
            PreparedStatement preparedStatement=getConnection().prepareStatement(query);
            preparedStatement.setInt(1,task);
            resultSet=  preparedStatement.executeQuery();
//            while (nooftask.next()){
//                return nooftask.getInt(1);
//            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return resultSet;
    }
    public void deletecell(int userid,int taskid) throws SQLException, ClassNotFoundException {
        String query="Delete from "+Const.task_table+" Where "+Const.user_userid+"=?"+" AND "+Const.task_taskid+"=?";
        PreparedStatement preparedStatement=getConnection().prepareStatement(query);
        preparedStatement.setInt(1,userid);
        preparedStatement.setInt(2,taskid);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public void updatecell(Timestamp datecreated,String description,String task ,int taskid) throws SQLException, ClassNotFoundException {
        String query="Update tasks set datecreated=?,description=?,task=? where taskid=?";
        PreparedStatement preparedStatement=getConnection().prepareStatement(query);
        preparedStatement.setTimestamp(1,datecreated);
        preparedStatement.setString(2,description);
        preparedStatement.setString(3,task);
        preparedStatement.setInt(4,taskid);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

   
}
