package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0 || printToInclusive == 1) {
            System.out.println(1);
            return;
        }
        int result = 1;
        System.out.println(1);
        System.out.println(1);
        for (int factor = 2; factor <= printToInclusive; factor++) {
            result *= factor;
            System.out.println(result);
        }

    }
}
