package pages;

import java.util.Arrays;
import java.util.Collections;

public class IsSortedDescending {
    public boolean isSortedDescending(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) < 0)
                return false;
        }
        return true;
    }

    public void sortDescending(String[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
    }
}
