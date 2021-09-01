package MCA;

public class Student {
    String name;
    int roll_number;
    int marks_sub1;
    int marks_sub2;
    int marks_sub3;
    int total_marks;
    double percentage;

    public Student(String _name, int _roll_number, int _marks1, int _marks2, int _marks3) {
        this.name = _name;
        this.roll_number = _roll_number;
        this.marks_sub1 = _marks1;
        this.marks_sub2 = _marks2;
        this.marks_sub3 = _marks3;

        total_marks = _marks1 + _marks2 + _marks3;
        percentage = ((double) total_marks / 300) * 100;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll_number);
        System.out.println("Total Marks Obtained : " + total_marks);
        System.out.println("Percentage : " + percentage);
    }
}
