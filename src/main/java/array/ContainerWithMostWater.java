package array;

/**
 * created by liangqun on 2019/2/27
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int water = 0;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            water = Math.max(water, (j - i) * h);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
