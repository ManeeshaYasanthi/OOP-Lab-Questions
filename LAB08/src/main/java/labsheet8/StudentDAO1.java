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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO1 {

    // Question 2: Insert a student record
    public void addStudent(Student1 student) {
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            
            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());
            
            statement.executeUpdate();
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
   
    public void displayAllStudents() {
        String sql = "SELECT student_id, student_name, mark FROM students";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             java.sql.ResultSet resultSet = statement.executeQuery()) {
            
           
            while (resultSet.next()) {
                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("student_name");
                int mark = resultSet.getInt("mark");
                
               
                System.out.println(id + "\t" + name + "\t" + mark);
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    // Question 4 - Part A
    public void findStudentById(int studentId) {
        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            
            statement.setInt(1, studentId);
            
            try (java.sql.ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    
                    System.out.println("Found -> ID: " + resultSet.getInt("student_id") + 
                                       ", Name: " + resultSet.getString("student_name") + 
                                       ", Mark: " + resultSet.getInt("mark"));
                } else {
                    
                    System.out.println("Student not found.");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Question 4 - Part B 
    public void updateStudentMark(int studentId, int newMark) {
        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            
            statement.setInt(1, newMark);
            statement.setInt(2, studentId);
            
            int rowsUpdated = statement.executeUpdate(); 
            
            if (rowsUpdated > 0) {
                System.out.println("Student mark updated successfully.");
            } else {
                System.out.println("Student not found. Mark not updated.");
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}    

