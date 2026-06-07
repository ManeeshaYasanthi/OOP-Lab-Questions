/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet8;

/**
 *
 * @author HP
 */


public class StudentInsertMain {
    public static void main(String[] args) {
        // Create one student object
        Student student = new Student(1, "Nimal Perera", 82);
        
        // Create DAO layer object and process insertion
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.addStudent(student);
    }
}    

