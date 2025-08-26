package javaLinkedInSeries;

public class DataTypePart2 {
    public static void main(String[] args) {
        String name = "John Doe"; // primitve string data type
        Integer[] scores = {85, 90, 78}; // primitive array
        student student1 = new student("Alice", 20); // user-defined class object (student class from student.java file)
        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Student Age: " + student1.getStudentAge());
        System.out.println("Name: " + name);
        System.out.println("Scores: " + scores[0] + ", " + scores[1] + ", " + scores[2]);
    }
}
