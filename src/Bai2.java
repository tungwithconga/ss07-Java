public class Bai2 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------");

        Student s1 = new Student("An");
        Student s2 = s1;
        s2.setName("Binh");

        System.out.println("Reference:");
        System.out.println("s1 name = " + s1.getName());
        System.out.println("s2 name = " + s2.getName());
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
