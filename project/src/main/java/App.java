public class App {
    public static void main(String[] args) {
        // Create and associate groups, courses, and students
        Group group1 = createGroup("Group A", 2023);
        Group group2 = createGroup("Group B", 2024);

        Course course1 = createCourse("Java Programming", "Introduction to Java", List.of(group1));
        Course course2 = createCourse("Database Management", "SQL and Databases", List.of(group2));

        Student student1 = createStudent("John", "Doe", "john.doe@email.com", group1);
        Student student2 = createStudent("Alice", "Smith", "alice.smith@email.com", group2);

        // Get students attending a specific course and display the result
        List<Student> studentsInJavaCourse = getStudentsInCourse("Java Programming");
        studentsInJavaCourse.forEach(student -> System.out.println(student.toString()));
    }

    // Implement createGroup, createCourse, createStudent methods

    public static List<Student> getStudentsInCourse(String courseName) {
        // Implement a query to retrieve students in a specific course
    }
}
