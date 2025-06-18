package a3_control;

public class Ch4_Example {
    public static void main(String[] args) {
        // Q1
        int score = 72;
        if (score >= 80 && score < 90) { // 80 <= score < 90
            System.out.println("B학점");
        }else if (score >= 90) { // socre >= 90
            System.out.println("A학점");
        }else if (score >= 70 && score < 80) { // 70 <= socre < 80
            System.out.println("C학점");
        }else {
            System.out.println("F학점");
        }
    }
}
