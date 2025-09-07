package Learningconcepts.SchoolConnect;
import java.util.Scanner;

public class MySchoolSystem {
    String principalname = "narayana";
    int principalloginpassword = 12345;
    String TehcherID = "Teach06";
    int teacherloginpassword = 54321;
    String Studentname = "Ravi";
    int studentloginpassword = 11223;
    String Parentname = "Suresh";
    int parentloginpassword = 33211;

    /* Non-static method */
    public void teacherinfo() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Here the details of Teachers In the School");
        System.out.println(" Details about Teachers Names and what subject they teach");
        System.out.println("1.Teja , Teaching Subject: English" +
                "\n2.Divya , Teaching subject: Telugu" +
                "\n3.Suresh, Teaching subject: Hindi" +
                "\n4.Ramesh, Teaching subject: Maths" +
                "\n5.Lakshmi, Teaching subject: Science" +
                "\n6.Priya, Teaching subject: Social");
        System.out.println("English Syllabus: "
                + "\n1. Grammar"
                + "\n2. Vocabulary"
                + "\n3. Reading Comprehension"
                + "\n4. Writing Skills"
                + "\n Unit lessons");
        System.out.println("Syllabus completed for the End of the Month Exams ?: "
                + "\n If completed Please type Yes"
                + "\n If Not completed Please type No");
        String syllabusEng = scanner.nextLine();
        if (syllabusEng == "yes" && syllabusEng.matches("[a-zA-Z]+")) {
            System.out.print("Syllabus Completed");
        } else {
            System.out.println("Syllabus Not Completed");
        }

    }

    /* Static method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySchoolSystem system = new MySchoolSystem(); // ✅ object created

        System.out.println(" HI Welcome to My School Connect" +
                "\n Choose the Role to Login: " +
                "\nPrincipal" +
                "\nTeachers" +
                "\nStudent" +
                "\nParent" +
                "\nExit");

        String userinput1 = scanner.nextLine();

        switch (userinput1) {
            case "principal":
                System.out.println("Enter the Principal name");
                String userinput2 = scanner.nextLine();


                if (userinput2.equals(system.principalname) && userinput2.matches("[a-zA-Z]+")) {
                    System.out.println("Name is valid");
                } else {
                    System.err.println("Name is invalid");
                }

                System.out.println("Enter the Password : ");
                int principallpasswprd = scanner.nextInt();

                if (principallpasswprd == system.principalloginpassword) {
                    System.out.println("Login Successful");
                } else {
                    System.err.println("Invalid password");
                    break;
                }
                System.out.println("Do you want to see the Teachers details: Yes/NO ?");
                String userinput3 = scanner.next();
                if (userinput3 == "yes" && userinput3.matches("[a-zA-Z]+")) {
                    system.teacherinfo();
                } else {
                    System.out.println("Exit?");
                    String exit = scanner.next();
                    System.out.println("Exited Successfully" + exit);
                }
                break;
            case "Teachers":
                System.out.println("Welcome to Teachers Login page ");

                System.out.println("Please Enter the Teachers ID: ");
                String userinput4 = scanner.next();

                if (userinput4 == system.TehcherID && userinput4.matches("[a-zA-Z0-9]+")) {
                    System.out.println("Teacher ID is valid");
                } else {
                    System.err.println("Teacher ID is invalid");
                }
                System.out.println("Enter the password : ");
                int teacherspassword = scanner.nextInt();
                if (teacherspassword == system.teacherloginpassword) {
                    System.out.println("Login Sucessful");
                } else {
                    System.err.println("Invalid Password");
                }
                System.out.println("Do you want to see the Assigned Subjects details: Yes/NO ?");
                String userinput5 = scanner.next();
                if (userinput4 == "yes" && userinput4.matches("[a-zA-Z]+")) {
                    system.teacherinfo();
                }else {

                }
        }
    }
}
