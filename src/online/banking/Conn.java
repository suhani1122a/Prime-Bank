package online.banking;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/primebank","root","12345");
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
