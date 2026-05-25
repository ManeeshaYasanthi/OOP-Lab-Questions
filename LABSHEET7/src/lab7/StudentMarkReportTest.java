/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author HP
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marks = {"78" , "82" , "absent" , "90"};
    
    StudentMarkReport obj = new StudentMarkReport(marks);
    
    try {
    System.out.println(obj.getMarkAt(6));
}
    catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Error:Selected mark position does not exist.");
    }
    finally {
    System.out.println("Array access checking completed.");
    }
    try {
    System.out.println(obj.getMarkAt(2));
    }
    catch(NumberFormatException e)
    {
        System.out.println("Error:Selected mark is not a valid number.");
    }
    finally {
    System.out.println("Number conversion checking completed.");
    }
    System.out.println("Report checking completed.");
}
}
//getMarkAt(6) causes ArrayIndexOutOfBoundsException because index 6 does not exist in the array.
//getMarkAt(6) causes NumberFormatException because "absent" cannot be converted into an integer.