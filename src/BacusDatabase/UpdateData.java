package BacusDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        try(Connection c = MySQLConnection.getConnection();
            PreparedStatement statement = c.prepareStatement(
                    "UPDATE users SET name=?, email=? WHERE id=?"
            )) {
            String name = "Hanz Chester V. Bacus";
            String email = "hanzchesterbacus@gmail.com";
            int idToUpdate = 1;
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setInt(3, idToUpdate);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
