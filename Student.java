class Student {

    int rollNo;
    String name;
    double marks;

    Student() {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0.0;
    }

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(101, "Satyam", 89.5);
        s2.display();
    }
}
