import java.util.Arrays;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/2
 * TODO:
 */

public class ThreeSevenEight {
    public int kthSmallest(int[][] matrix, int k) {
        int size = matrix.length * matrix[0].length;
        int[] num = new int[size];
        int count = 0;
        for (int[] i : matrix){
            for (int j : i){
                num[count] = j;
                count++;
            }
        }

        Arrays.sort(num);

        return num[k-1];
    }
}
