class Student {

    int id;
    String name;

    // Constructor
    Student(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        Student student1 = new Student(101, "Shivarajadharshini");
        Student student2 = new Student(102, "Rahul");

        student1.display();
        System.out.println();

        student2.display();
    }
}

/*
Output:
Student ID: 101
Student Name: Shivarajadharshini

Student ID: 102
Student Name: Rahul
*/
