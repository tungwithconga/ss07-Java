public class Bai1 {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyễn Văn A");
        Student s2 = new Student("SV002", "Trần Thị B");
        Student s3 = new Student("SV003", "Lê Văn C");

        s1.displayInfo();
        System.out.println("------------");

        s2.displayInfo();
        System.out.println("------------");

        s3.displayInfo();
        System.out.println("------------");

        Student.displayTotalStudent();
    }
}
class Student {

    private String maSV;
    private String tenSV;

    private static int totalStudent = 0;

    public Student(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Tên SV: " + tenSV);
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }
}
