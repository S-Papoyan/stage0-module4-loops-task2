package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int a = 0;
        if (multiplyByAndToInclusive > 0) {
            for (int i = 0; i <= multiplyByAndToInclusive; i++) {
                System.out.println(a);
                a += multiplyByAndToInclusive;
            }
        }
        if (multiplyByAndToInclusive < 0) {
            multiplyByAndToInclusive *= -1;
            for (int i = 0; i <= multiplyByAndToInclusive; i++) {
                System.out.println(a);
                a -= multiplyByAndToInclusive;
            }
        }
    }
}
