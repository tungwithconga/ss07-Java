package Bai1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Trần Thị B");
        Student s3 = new Student(3, "Lê Văn C");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.showTotalStudent();
    }
}
