package Bai3;

public class ScoreUtils {

    // Kiểm tra Đạt / Trượt
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }

    // Tính điểm trung bình
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
