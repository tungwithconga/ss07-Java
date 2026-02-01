public class Bai5 {
    public static void main(String[] args) {

        int score = 8;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Score hop le");
        } else {
            System.out.println("Score khong hop le");
        }
    }
}

class Config {
    public static final int MAX_SCORE = 10;
    public static final int MIN_SCORE = 0;
}
