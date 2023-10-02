package pages;

public class FindMin {
    public int findMin(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array is empty");

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
