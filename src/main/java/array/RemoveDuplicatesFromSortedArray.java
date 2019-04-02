package array;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 26
 * created by liangqun on 2019/3/13
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[j]) {
                System.out.println(String.format("%s,%s", i, j));
                A[++j] = A[i];
            }
            System.out.println(StringUtils.join(ArrayUtils.toObject(A), ","));
        }
        return ++j;
    }

    public static void main(String[] args) {
        int[] given = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(given));
    }
}
