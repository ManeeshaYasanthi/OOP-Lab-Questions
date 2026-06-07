/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet8;

/**
 *
 * @author HP
 */
public class StudentInsertMain1 {


    public static void main(String[] args) {
       
        StudentDAO1 studentDAO = new StudentDAO1();
        
        
        Student1 s1 = new Student1(1, "Nimal Perera", 82);
        Student1 s2 = new Student1(2, "Kamal Silva", 74);
        Student1 s3 = new Student1(3, "Sunethra Fernando", 91);
        
        
        studentDAO.addStudent(s1);
        studentDAO.addStudent(s2);
        studentDAO.addStudent(s3);
        
        System.out.println(" Students added successfully.");
    }
}   

