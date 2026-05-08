/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */


public class DeliveryChargeCalculator {
    public double calculateCharge(double baseCharge){
        return baseCharge;
    }
    
    public double calculateCharge(double baseCharge, double distanceKm){
        return baseCharge + (distanceKm*100.0);
    }
    
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg){
        return baseCharge+(distanceKm*100.0)+ (weightKg*50.0);
    }
    
    public double calculateCharge(double baseCharge, boolean expressDelivery){
        if (expressDelivery){
            return baseCharge + 500.0;
        }
        return baseCharge;
    }
}
    

