public class Bai3 {
    public static void main(String[] args) {

        double[] scores = {8, 7, 9, 6};

        double avg = ScoreUtils.average(scores);
        boolean pass = ScoreUtils.isPass(avg);

        System.out.println("Average score = " + avg);
        System.out.println("Result = " + (pass ? "Pass" : "Fail"));
    }
}

class ScoreUtils {

    public static boolean isPass(double score) {
        return score >= 5.0;
    }

    public static double average(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }
}
