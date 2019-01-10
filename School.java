public class School
{
   public static void main (String [] args)
   {
    
      Student sally = new Student("Sally", 15, 8, 'D');
      Student sipho = new Student("Sipho", 17 , 11, 'A');
      Student rajesh = new Student("Rajesh", 19, 12, 'B');
       
      System.out.println("Students\n");
      System.out.println(sally + "\n");
      System.out.println(sipho + "\n");
      System.out.println(rajesh + "\n");
  
   
      
      Teacher John = new Teacher("John", 45, "Science", 21, "White");
      Teacher Javier = new Teacher("Javier", 38, "Mathematics", 13, "Hispanic");
      Teacher Michelle = new Teacher("Michelle", 34, "English Literature", 10, "Mixed black & white");
      Teacher Asha = new Teacher("Asha", 40, "Music", 20, "Black ");
      
      System.out.println("Teachers\n");
      System.out.println(John + "\n");
      System.out.println(Javier + "\n");
      System.out.println(Michelle + "\n");
      System.out.println(Asha + "\n");
      
      
      
      
      Secretary Jackie = new Secretary("Jackie", 29, "White", 12, "Female");
      Secretary Monica = new Secretary("Monica", 28, "White", 8, "Female");
      Secretary Gale = new Secretary("Gale", 30, "White", 5, "Female");
      
      System.out.println("Secretaries\n");
      System.out.println(Jackie + "\n");
      System.out.println(Monica + "\n");
      System.out.println(Gale);
   
   }

  
}