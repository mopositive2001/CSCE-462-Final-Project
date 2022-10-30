import java.sql.*;
//import java.io.*;
//import java.util.*;

public class water_level {
    String time;
    Double level;

    public water_level(){

    }

    public void add_to_db(){
        databaseConnection db = new databaseConnection();
        Connection conn = db.returnConnection();

        try{
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO water_level_reservoir(time, water_level) VALUES (" + time + "," + level + ");");
        }
        catch(Exception err){
            err.printStackTrace();
            System.err.println(err.getClass().getName()+": "+err.getMessage());
            System.exit(0);

        }
    }
}
