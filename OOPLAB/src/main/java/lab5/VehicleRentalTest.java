/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class VehicleRentalTest {
   public static void main(String[] args) {

        Vehicle vehicle1 =
                new Car("CAR1", "Hybrid", 5, 8000.0);

        Vehicle vehicle2 =
                new Bike("BIKE1", "Yamaha", 10, 500.0);

        System.out.println("Car Details");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " +
        vehicle1.calculateRentalCost());

        System.out.println();

        System.out.println("Bike Details");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " +
        vehicle2.calculateRentalCost());
   }
}
