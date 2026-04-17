package lab4;

public class lab4main {
   public static void main(String[] args){
      Lecturer Lec = new Lecturer("Kamal Perara","L001","COST",3,50000);
      LabAssistant LabAssistant1= new LabAssistant("Nimesh","A001","COST",120,500);
      
      UniversityPolicy.showPolicyHeader();
      System.out.println(UniversityPolicy.UNIVERSITY_NAME);
      System.out.println("Bonus of Lecture:"+UniversityPolicy.calculateBonus(Lec.calculateMonthlyPayment()));
       System.out.println("Bonus of Lab Assistant:"+UniversityPolicy.calculateBonus(LabAssistant1.calculateMonthlyPayment()));
   } 
}