/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet8;

/**
 *
 * @author HP
 */


public class StudentDisplayMain1 {
    public static void main(String[] args) {
        
        StudentDAO1 studentDAO = new StudentDAO1();
        
        System.out.println("--- Student Records ---");
        
        
        studentDAO.displayAllStudents();
    }
}    

