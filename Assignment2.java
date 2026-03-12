import java.util.Scanner;
//Write a Java program to manage and track student performance in a course. 
//The program should collect input from the user using the Scanner class.
//Use a default constructor to assign initial values and a parameterized constructor 
//to initialize student details such as name, ID, marks, and 
//grade based on user input. Utilize a static variable to keep track of the 
//total number of student objects created. Define a final variable 
//to represent a constant value such as the course name. 
//The program should display the student details along with the total number 
//of students created accept and display individual student performance details.

class Student{
	
	public String Name;
	public int ID;
	public double Marks;
	public String Grade;
	public static int studentCount=0;
	
	
	Student(){
		this.Name=" ";
		this.ID=0;
		this.Marks=0.0;
		this.Grade=" ";
		studentCount++;
	}
	
	Student(String Name,int ID,double Marks){
		this.Name=Name;
		this.ID=ID;
		this.Marks=Marks;
		this.Grade=CalculateGrade(Marks);
		studentCount++;
	}
	
	
	public String CalculateGrade(double Marks) {
		if (Marks>=90) {
			return "A";
		}else if(Marks>75 && Marks<90) {
			return "B";
		}else if(Marks>=50 && Marks<=75) {
			return "C";
		}else {
			return "F";
		}
		
	}
	
	
	public void DisplayDetails() {
		System.out.println("====Student Performance====");
		System.out.println("Name: "+ Name);
		System.out.println("ID: "+ ID);
		System.out.println("Marks: "+Marks);
		System.out.println("Grade: "+ Grade);
		
	}
	
	static int getStudentCount() {
        return studentCount;
    }
	
}



public class Assignment2 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Name: ");
        String Name=sc.nextLine();
        
        System.out.print("Enter the ID: ");
        int ID=sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter the Marks: ");
        double Marks=sc.nextDouble();
     
        
        Student s1= new Student(Name,ID,Marks);
        s1.DisplayDetails();
        
        System.out.println("\nTotal Students Created: " + Student.getStudentCount());

		sc.close();
		
		

	}

}
