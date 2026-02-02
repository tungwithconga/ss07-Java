package Bai4;

public class ClassRoom {

    // ===== Biến static (dùng chung cho cả lớp) =====
    public static double classFund = 0;

    // ===== Biến instance (riêng từng sinh viên) =====
    private String studentName;

    // Constructor
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    // Sinh viên đóng tiền vào quỹ
    public void payFund(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng: " + amount);
    }

    // Xem tổng quỹ lớp
    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}
