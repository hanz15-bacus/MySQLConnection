package BacusDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/javadb";
    private static final String USERNAME = "user";
    private static final String PASSWORD = "hanzhanz";
    public static Connection getConnection(){
        Connection c = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database!");
        }catch(ClassNotFoundException  | SQLException e){
             throw new RuntimeException(e);
        }
        return c;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
