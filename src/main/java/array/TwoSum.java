package array;

import javafx.util.converter.NumberStringConverter;

import java.util.HashMap;

/**
 * created by liangqun on 2019/2/25
 */
public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                result[1] = i;
                result[0] = map.get(numbers[i]);
                return result;
            }
            map.put(target - numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int[] result = twoSum(arr, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
