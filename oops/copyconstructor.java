import java.util.*;

public class copyconstructor {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "kapil";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 10;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.password = "xyx";
        s1.marks[1] = 80;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];  // Changed to int[]

    // Copy constructor
    Student(Student s1) {
        marks = new int[3];  // Initialize the marks array
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        System.out.println("Constructor is called");
        marks = new int[3];  // Initialize the marks array in the default constructor
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
