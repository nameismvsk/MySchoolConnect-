MySchoolConnect is a role-based school management system built in Java, designed to simulate real-world workflows for principals, teachers, students, and parents. It includes login authentication, syllabus tracking, and resignation approval logic — all structured for future scalability.

🚀 Features
- 🔐 Role-based login system (Principal, Teacher, Student, Parent)
- 📚 Teacher dashboard with subject and syllabus details
- ✅ Syllabus completion tracking with input validation
- 👀 Principal view-only access to syllabus status
- 📤 Employee resignation portal with approval simulation
- 🧠 Modular design for future expansion (attendance, grading, etc.)

🛠️ Technologies Used
- 💻 Java (Core)
- 🧠 IntelliJ IDEA
- 🌐 Git & GitHub

📂 Project Structure
src/
└── Learningconcepts/
    └── SchoolConnect/
        └── MySchoolSystem.java



📦 How to Run
# Clone the repository
git clone https://github.com/nameismvsk/MySchoolConnect.git

# Open in IntelliJ or any Java IDE

# Run the main class
MySchoolSystem.java



🐞 Known Issues & Improvements
This project is actively maintained. Below are current issues and areas for enhancement:
❗ Logic & Structural Fixes
- Replace all == string comparisons with .equalsIgnoreCase()
- Refactor principal menu handling outside the login switch block
- Store and display resignation data using class-level variables
- Add principalApproval() method to review and approve resignations
- Fix input skipping by using scanner.nextLine() consistently
- Add looping for multi-action sessions
🔧 Planned Enhancements
- Modularize dashboards into separate classes
- Support multiple resignation requests using a List<ResignationRequest>
- Connect to a database for persistent storage
- Add unit tests and input validation
- Implement student and parent dashboards

📈 Update Note
This project is part of my backend development journey.
I update it regularly to improve structure, logic, and real-world simulation.
Contributions, suggestions, and issue reports are welcome!



