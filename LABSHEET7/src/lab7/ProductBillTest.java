/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author HP
 */
public class ProductBillTest {
    public static void main(String[]args){
        ProductBill obj = new ProductBill("1500.00", "two");
        
        try{ 
            double total = obj.calculateTotal();
            System.out.println("Total = " + total);
        }
        catch (NumberFormatException e)
        {
           System.out.println("Error:Price abd quantity must be valid numbers.");
        }
        finally {
            System.out.println("Product bill calculation completed.");
        }
        System.out.println("Program continues...");
    }
}
//Exception occurs because that text "two" cannot be converted into an integer.