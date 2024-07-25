package penta.assignments;


import java.util.Scanner;
public class StudentDetails {
	String name ;
    int roll ;
    int Class;
    int sub1 , sub2 , sub3 , sub4 ;
    int total ;
    float percentage ;
    void disp() {
    	System.out.println("------------Student Details------------");
    	System.out.println("Student Name : "+name);
    	System.out.println("Student ID : "+roll);
    	System.out.println("Student Class : "+Class);
    	System.out.println("Subject1 marks : "+sub1);
    	System.out.println("Subject2 marks : "+sub2);
    	System.out.println("Subject3 marks : "+sub3);
    	System.out.println("Subject4 marks : "+sub4);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StudentDetails sd=new StudentDetails();
        while (true) {
            System.out.println("1. Student Details");
            System.out.println("2. Calculate Total marks");
            System.out.println("3. Calculate Percentage");
            System.out.println("4. Check Eligibility");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            sc.nextLine();  // consume newline

            if (ch == 1) {
                System.out.println("Enter Name: ");
                sd.name = sc.nextLine();
                System.out.println("Enter Roll Number: ");
                sd.roll = sc.nextInt();
                System.out.println("Enter the Class: ");
                sd.Class = sc.nextInt();
                System.out.println("Enter marks of Subject1: ");
                sd.sub1 = sc.nextInt();
                System.out.println("Enter marks of Subject2: ");
                sd.sub2 = sc.nextInt();
                System.out.println("Enter marks of Subject3: ");
                sd.sub3 = sc.nextInt();
                System.out.println("Enter marks of Subject4: ");
                sd.sub4 = sc.nextInt();
                sd.disp();
            } else if (ch == 2) {
               sd.total = sd.sub1 + sd.sub2 + sd.sub3 + sd.sub4;
                System.out.println("Total marks: " + sd.total);
            } else if (ch == 3) {
                sd.total = sd.sub1 + sd.sub2 + sd.sub3 + sd.sub4;
                sd.percentage = (float) sd.total / 400 * 100;
                System.out.println("Percentage of student is: " + sd.percentage);
            } else if (ch == 4) {
                if (sd.sub1 > 35 && sd.sub2 > 35 && sd.sub3 > 35 && sd.sub4 > 35) {
                    System.out.println("Student is eligible for next year");
                } else {
                    System.out.println("Student is not eligible for next year");
                }
            } else if (ch == 5) {
                System.out.println("Exit");
                sc.close();
                return;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}


