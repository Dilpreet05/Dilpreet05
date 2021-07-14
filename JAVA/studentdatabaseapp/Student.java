package studentdatabaseapp;

import java.util.Scanner;

public class Student {
        private String firstName;
        private String lastName;
        private String gradeYear;
        private String studentID;
        private String courses = null;
        private int tuitionBalance = 0;
        private int costOfCourse = 600;
        private static int id = 1000;
        

        // constructor prompt user to enter student name and year
        public Student() {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter student first name: ");
                this.firstName = in.nextLine();

                System.out.print("Enter student last name: ");
                this.lastName = in.nextLine();

                System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
                this.gradeYear = in.nextLine();



                setStudentID();

                System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);


        }

        // generate id
        private void setStudentID() {
                // grade level + ID
                id++;
                this.studentID = gradeYear + "" + id;


        }

        // enroll in courses
        public void enroll(){
                // get inside a loop, user hits 0
                System.out.print("Enter a course to enroll (Q to quit): ");
                Scanner in = new Scanner(System.in);
                String course = in.nextLine();
                if (course != "Q"){
                        courses = courses + "\n" + course;
                        tuitionBalance = tuitionBalance + costOfCourse;
                }
                System.out.println("ENROLLED IN: " + courses);
                System.out.println("TUITION BALANCE: " + tuitionBalance);
        }

        // view balance

        // pay tuition

        // show status 

}
