public class Bai4 {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Binh");
        ClassRoom s3 = new ClassRoom("Cuong");

        s1.dongQuy(100000);
        s2.dongQuy(150000);
        s3.dongQuy(200000);

        ClassRoom.xemQuyLop();
    }
}

class ClassRoom {

    private String tenSinhVien;
    private static int classFund = 0;

    public ClassRoom(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void dongQuy(int soTien) {
        classFund += soTien;
        System.out.println(tenSinhVien + " dong " + soTien);
    }

    public static void xemQuyLop() {
        System.out.println("Tong quy lop = " + classFund);
    }
}
