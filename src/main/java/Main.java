public class Main {

    // join point of two sequences
    private static int computeJoinPoint(int s1, int s2) {
        while (s1 != s2) {
            int sum = 0;
            int s = s1;
            do {
                sum += s % 10;
                s /= 10;
            } while (s != 0);
            s1 += sum;

            sum = 0;
            s = s2;
            do {
                sum += s % 10;
                s /= 10;
            } while (s != 0);
            s2 += sum;
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(computeJoinPoint(104701, 144809));
    }
}