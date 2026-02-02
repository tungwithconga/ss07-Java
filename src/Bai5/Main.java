package Bai5;

public class Main {
    public static void main(String[] args) {

        double score = 8.5;

        // Sử dụng hằng số từ lớp Config
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ!");
        }


    }
}
