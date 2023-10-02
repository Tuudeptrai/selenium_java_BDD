package pages;

public class IsFibonacci {
    public boolean isFibonacci(int num) {
        if (num < 0)
            return false;

        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }
}
