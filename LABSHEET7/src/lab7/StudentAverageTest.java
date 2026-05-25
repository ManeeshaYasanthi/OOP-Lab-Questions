/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author HP
 */
public class StudentAverageTest {
    public static void main(String[]args) { 
        StudentAverageCalculator obj = new StudentAverageCalculator(500, 0);
        try { 
            int avg = obj.calculateAverage();
            System.out.println("Average = " + avg);
        }
        catch (ArithmeticException e){
            System.out.println("Error:Number of students cannot be zero.");
             }
        finally { 
            System.out.println("Average calculation completed.");
        }
        System.out.println("Program continues...");
    }
}
