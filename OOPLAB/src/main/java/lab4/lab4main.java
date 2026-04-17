package lab4;

public class lab4main {
   public static void main(String[] args){
      Lecturer Lec = new Lecturer("Kamal Perera","L001","COST",3,50000);
      
      Lec.displayLecturerDetails();
      
      System.out.println("Monthly Payment: "+Lec.calculateMonthlyPayment());
      
   } 
}
