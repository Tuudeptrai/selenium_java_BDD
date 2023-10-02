package pages;
import java.util.Arrays;
public class IsSortedAscending {
    public boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
    public void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }
}
