/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet8;

/**
 *
 * @author HP
 */
public class StudentSearchUpdateMain {

    public static void main(String[] args) {
      
        StudentDAO1 studentDAO = new StudentDAO1();
        
        System.out.println("Checking student details before update:");
       
        studentDAO.findStudentById(1);
        
        System.out.println("\nExecuting update...");
        
        studentDAO.updateStudentMark(1, 95);
        
        System.out.println("\nChecking student details after update:");
        
        studentDAO.findStudentById(1);
    }
}    

