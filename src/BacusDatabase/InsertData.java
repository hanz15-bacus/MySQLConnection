package BacusDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try(Connection c = MySQLConnection.getConnection();
            PreparedStatement statement = c.prepareStatement(
                    "INSERT INTO users(name, email)Values (?, ?)"
            )) {
            String name = "Hanz Chester Bacus";
            String email = "hanzbacus@gmail.com";
            statement.setString(1, name);
            statement.setString(2, email);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
