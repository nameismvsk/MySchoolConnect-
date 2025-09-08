package Learningconcepts.SchoolConnect;

import java.util.Scanner;

public class MySchoolSystem {
    // Role credentials
    String principalName = "narayana";
    int principalPassword = 12345;

    String teacherID = "Teach06";
    int teacherPassword = 54321;

    String studentName = "Ravi";
    int studentPassword = 11223;

    String parentName = "Suresh";
    int parentPassword = 33211;

    // Non-static method for teacher info
    public void teacherInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n📚 Teacher Details:");
        System.out.println("1. Teja - English\n2. Divya - Telugu\n3. Suresh - Hindi\n4. Ramesh - Maths\n5. Lakshmi - Science\n6. Priya - Social");

        System.out.println("\n📘 English Syllabus:");
        System.out.println("1. Grammar\n2. Vocabulary\n3. Reading Comprehension\n4. Writing Skills\n5. Unit Lessons");

        System.out.println("\nIs the syllabus completed for end-of-month exams? (Yes/No):");
        String syllabusStatus = scanner.nextLine();

        if (syllabusStatus.equalsIgnoreCase("yes")) {
            System.out.println("✅ Syllabus Completed");
        } else {
            System.out.println("❌ Syllabus Not Completed");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySchoolSystem system = new MySchoolSystem();

        System.out.println("👋 Welcome to MySchoolConnect");
        System.out.println("Choose your role to login:\nPrincipal\nTeachers\nStudent\nParent\nExit");
        String role = scanner.nextLine();

        switch (role.toLowerCase()) {
            case "principal":
                System.out.println("Enter Principal Name:");
                String inputPrincipalName = scanner.nextLine();

                if (inputPrincipalName.equalsIgnoreCase(system.principalName)) {
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
                        System.out.println("Do you want to see teacher details? (Yes/No):");
                        String seeTeachers = scanner.nextLine();

                        if (seeTeachers.equalsIgnoreCase("yes")) {
                            system.teacherInfo();
                        } else {
                            System.out.println("Do you want to update employee resignation data? (Yes/No):");
                            String updateResignation = scanner.nextLine();

                            if (updateResignation.equalsIgnoreCase("yes")) {
                                System.out.println("Enter Employee ID:");
                                int empId = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter Resignation Reason:");
                                String reason = scanner.nextLine();

                                System.out.println("Has 60-day notice period been completed? (Yes/No):");
                                String notice = scanner.nextLine();

                                System.out.println("Enter Resignation Approval Status (Approved/Pending):");
                                String status = scanner.nextLine();

                                if (status.equalsIgnoreCase("Approved")) {
                                    System.out.println("✅ Resignation Approved for Employee ID: " + empId);
                                } else {
                                    System.out.println("⏳ Resignation Pending for Employee ID: " + empId);
                                }
                            } else {
                                System.out.println("📌 No resignation updates at this time.");
                            }
                        }

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

                System.out.println("Do you want to see assigned subjects? (Yes/No):");
                String seeSubjects = scanner.nextLine();

                if (seeSubjects.equalsIgnoreCase("yes")) {
                    system.teacherInfo();
                } else {
                    System.out.println("📌 Subject details not requested.");
                }
                break;

            case "student":
                System.out.println("Student login feature coming soon...");
                break;

            case "parent":
                System.out.println("Parent login feature coming soon...");
                break;

            case "exit":
                System.out.println("👋 Exiting MySchoolConnect. Have a great day!");
                break;

            default:
                System.err.println("❌ Invalid role selected.");
        }
    }
}