package Bai4;

public class Main {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Nguyễn Văn A");
        ClassRoom s2 = new ClassRoom("Trần Thị B");
        ClassRoom s3 = new ClassRoom("Lê Văn C");

        s1.payFund(100000);
        s2.payFund(150000);
        s3.payFund(200000);

        // Xem tổng quỹ lớp
        ClassRoom.showClassFund();
    }
}
