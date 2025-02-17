import java.util.Scanner;

public class Student {

    
    public static void main(String[] args) {
      StudentDetails s1 = new StudentDetails(); 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Stduent id: ");
        int id = sc.nextInt();
        System.out.print("Enter Stduent name: ");  
        sc.next();   
        String name = sc.nextLine();
        
        System.out.print("Enter Stduent course: ");        
        String course = sc.nextLine();
       
        System.out.print("Enter Stduent fees: ");
        double fees = sc.nextDouble();
        System.out.print("Are u submitted fees Enter :- true/false: ");
        boolean submitFees = sc.nextBoolean(); 

       s1.setStudentData( id,name,  course,fees,submitFees);
       s1.getStudentDetails();

        sc.close();
    }
  
}

 class StudentDetails {
    int studentId ;
    String studentName;
    String studentCourse;
    double studentFees;
    boolean studentSubmitFees;

    public void setStudentData(int id, String name, String course, double fees, boolean submitFees){
        studentId = id;
        studentName = name;
        studentCourse = course;
        studentFees = fees;
        studentSubmitFees = submitFees;
    }

    public void getStudentDetails(){

        System.out.println( "     ___________________________  ");

        System.out.println("Student id is : "+ studentId);
        System.out.println("Student Name is : "+ studentName);
        System.out.println("Student course is : "+ studentCourse);
        System.out.println("Student fees is : "+ studentFees);
        System.out.println("Student Submit fees  : "+ studentSubmitFees);

        System.out.println( " _________________________________________  ");

    }
}