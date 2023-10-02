package pages;

public class FindLCM {
    public int findLCM(int a, int b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("Input numbers must be positive.");

        int lcm = (a * b) / findGCD(a, b);
        return lcm;
    }
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
