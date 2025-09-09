package Learningconcepts.SchoolConnect;

import java.util.Scanner;

public class MySchoolSystem {
    // Role credentials
    String principalID = "narayana";
    int principalPassword = 12345;

    String teacherID = "Teach06";
    int teacherPassword = 54321;

    int studentID = 2580;
    String studentname = "ajay";

    String parentName = "Suresh";
    int parentPassword = 33211;

    // Non-static method for teacher info
    public void teacherInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n📚 Teacher Details:");
        System.out.println("1. Teja - English\n2. Divya - Telugu\n3. Suresh - Hindi\n4. Ramesh - Maths\n5. Lakshmi - Science\n6. Priya - Social");
    }

    public void resiginationportal(){
        Scanner scanner = new Scanner(System.in);
System.out.println("Resignation portal");
System.out.println("Enter the Employee ID:");
int empid=  scanner.nextInt();

if(empid<=10){
    System.out.println("Employee id is validating to principal office");
}else{
    System.out.println("If your don't know your employee id please contact to HM(Head master) with your details And get your employee id With HM signature");
}
        System.out.println("To apply for resignation to got > separation Enter the reason for resignation");
        System.out.print(+empid+" Reason for resign the job:"
        +"\n After completing the reason to resign type > proceed in last");
        String resign = scanner.next();
        if (resign=="proceed"){
            System.out.println("Your resignation approval is in process to principal office ");
        }else{
            System.out.println("Your resignation is pending please contact to principal for smother transition");
        }
    }

    public  void resignsdata(){
        System.out.println("Employee Approvals resignation Please check the details");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySchoolSystem system = new MySchoolSystem();

        System.out.println("👋 Welcome to MySchoolConnect");
        System.out.println("Choose your role to login:\nPrincipal\nTeachers\nStudent\nParent\nExit");
        String role = scanner.nextLine();

        switch (role.toLowerCase()) {
            case "principal":
                System.out.println("Enter Principal ID:");
                String inputPrincipalName = scanner.nextLine();

                if (inputPrincipalName.equalsIgnoreCase(system.principalID)) {
                    System.out.println("✅ Name is valid");
                } else {
                    System.err.println("❌ Name is invalid");
                    break;
                }

                System.out.println("Enter Password:");
                int inputPrincipalPassword = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (inputPrincipalPassword == system.principalPassword) {
                    System.out.println("✅ Login Successful");
                } else {
                    System.err.println("❌ Invalid Password");
                    break;
                }
                System.out.println(" WELCOME TO MY SCHOOL CONNECT principal portal "
                        + "\n Menu: "
                        + "\n 1.Employees resignations"
                        + "\n 2.Employees performance"
                        + "\n 3.Students performances"
                        + "\n 4.Students Attendance"
                        + "\n 5.fee dues"
                        + "\n 6.Exam details"
                        + "\n 7.Updates"
                        + "\n 8.Holiday list"
                        + "\n 9.Time table"
                        + "\n 10.employee leaves"
                        + "\n 11.school details & more");

            case "Employees resignations":
                System.out.println("Resignation portal");
                System.out.println("Employee Applied for resignation Please check the details");


                break;

            case "teachers":

                System.out.println("Welcome to Teacher Login");

                System.out.println("Enter Teacher ID:");
                String inputTeacherID = scanner.nextLine();

                if (inputTeacherID.equals(system.teacherID)) {
                    System.out.println("✅ Teacher ID is valid");
                } else {
                    System.err.println("❌ Invalid Teacher ID");
                    break;
                }
                System.out.println("Enter Password:");
                int inputTeacherPassword = scanner.nextInt();
                scanner.nextLine();

                if (inputTeacherPassword == system.teacherPassword) {
                    System.out.println("✅ Login Successful");
                } else {
                    System.err.println("❌ Invalid Password");
                    break;
                }
                System.out.println("Welcome to my school connect teacher portal"
                        + "\n Menu: "
                        + "\n 1.students performance"
                        + "\n 2.students Attendance"
                        + "\n 3.Fee Dues"
                        + "\n 4.Exam details"
                        + "\n 5.Apply leaves"
                        + "\n 6.Time table"
                        + "\n 7.updates & events"
                        + "\n 8.holidays List"
                
                );
            break;

            case "student":
                System.out.println("Welcome to MY school connect student portal");
                System.out.println("Enter the Roll Number: ");
                int rollnum = scanner.nextInt();
                if (rollnum == system.studentID) {
                    System.out.println("ROll number valid");
                } else {
                    System.out.println("Invalid roll number");
                    break;
                }
                System.out.println("Menu: "
                        +"\n 1. Attendance Percentage"
                        +"\n 2.Exam details"
                        +"\n 3. Fee dues"
                        +"\n 4. Time table"
                        +"\n 5. Subjects"
                        +"\n 6. My performance"
                        +"\n 7. Holidays"
                        +"\n 8. Teachers info"
                );
                break;


        }
    }
}
