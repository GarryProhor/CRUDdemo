package by.prohor.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    private  static Connection con=null;
    public static Connection getConnection(){
        try{
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/event", "root","");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
