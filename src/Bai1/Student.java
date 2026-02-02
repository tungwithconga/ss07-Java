package Bai1;

public class Student {

    private int id;
    private String name;

    public static int totalStudent = 0;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("-------------------");
    }

    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên: " + totalStudent);
    }
}
