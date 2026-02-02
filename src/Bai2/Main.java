package Bai2;

public class Main {
    public static void main(String[] args) {

        // ===== PRIMITIVE TYPE =====
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        System.out.println("----------------------");

        // ===== REFERENCE TYPE =====
        Student s1 = new Student(1, "Ngọc");
        Student s2 = s1;   // sao chép địa chỉ

        s2.name = "Lan";

        System.out.println("Reference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
