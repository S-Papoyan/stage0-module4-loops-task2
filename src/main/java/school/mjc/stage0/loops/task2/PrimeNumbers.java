package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0) {
            return;
        }
        int i = 6;
        while (i < printToInclusive) {
            if (i == 6) {
                System.out.println(2);
                System.out.println(3);
                System.out.println(5);
            }
            i++;
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
