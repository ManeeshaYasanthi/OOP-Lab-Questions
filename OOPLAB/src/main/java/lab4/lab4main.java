package lab4;

public class lab4main {
   public static void main(String[] args){
      Lecturer Lec = new Lecturer("Kamal Perara","L001","COST",3,50000);
      LabAssistant LabAssistant1= new LabAssistant("Nimesh","A001","COST",120,500);
      
      Lec.displayLecturerDetails();
      
      System.out.println("Monthly Payment: "+Lec.calculateMonthlyPayment());
      
      System.out.println();
      
      LabAssistant1.displayLabAssistantDetails();
      System.out.println("Monthly Payment: "+LabAssistant1.calculateMonthlyPayment());
   } 
}