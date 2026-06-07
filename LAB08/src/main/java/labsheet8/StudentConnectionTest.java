/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet8;

/**
 *
 * @author HP
 */
   
import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {
        try (Connection conn = StudentDatabaseConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Database connected successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}    

