/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasktrackersystem;

/**
 *
 * @author HP
 */



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskDAO {

    // 1. ADD TASK 
    public boolean addTask(Task task) throws SQLException {
        String query = "INSERT INTO tasks (task_id, title, status) VALUES (?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, task.getTaskId());
            stmt.setString(2, task.getTitle());
            stmt.setString(3, task.getStatus());
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0; 
        }
    }

    // 2. SEARCH TASK 
    public Task searchTask(int taskId) throws SQLException {
        String query = "SELECT * FROM tasks WHERE task_id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, taskId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    
                    return new Task(
                        rs.getInt("task_id"),
                        rs.getString("title"),
                        rs.getString("status")
                    );
                }
            }
        }
        return null; 
    }

    // 3. UPDATE TASK
    public boolean updateTask(Task task) throws SQLException {
        String query = "UPDATE tasks SET title = ?, status = ? WHERE task_id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, task.getTitle());
            stmt.setString(2, task.getStatus());
            stmt.setInt(3, task.getTaskId());
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }
    }

    // 4. DELETE TASK 
    public boolean deleteTask(int taskId) throws SQLException {
        String query = "DELETE FROM tasks WHERE task_id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, taskId);
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }
    }
}

    
    
     
   

    
    
   
