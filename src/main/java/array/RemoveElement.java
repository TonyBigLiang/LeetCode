package array;

/**
 * 27
 * created by liangqun on 2019/3/13
 */
public class RemoveElement {

    public static int removeDuplicates(int[] A, int target) {
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != target) {
                A[j++] = A[i];
            }
        }
        return j++;
    }

    public static void main(String[] args) {
        int[] given = {0,1,2,2,3,0,4,2};
        System.out.println(removeDuplicates(given, 2));
    }
}
