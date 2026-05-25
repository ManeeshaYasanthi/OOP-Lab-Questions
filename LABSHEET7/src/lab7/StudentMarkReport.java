/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author HP
 */
public class StudentMarkReport {
    private String[] marks;
    
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }
    public int getMarkAt(int index) {
        String mark = marks[index];
        return Integer.parseInt(mark);
    }
}
