package dongtaiguihua;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/6
 * TODO:
 */

public class SixThree {
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
//        System.out.println(m + " " + n);

        if (obstacleGrid[0][0] == 1){
            return 0;
        }

        int[][] nums =new int[m][n];

        nums[0][0] = 1;

        for (int i = 1 ; i < n ; i++){
            nums[0][i] = ((obstacleGrid[0][i] == 1 || nums[0][i-1] == 0) ? 0 : 1);
        }
        for (int j = 1 ; j < m ; j++){
//            System.out.println(j);
            nums[j][0] = ((obstacleGrid[j][0] == 1 || nums[j-1][0] == 0) ? 0 : 1);
        }

        for (int i = 1 ; i < m ; i++){
            for (int j = 1 ; j < n ; j++){
                if (obstacleGrid[i][j] == 0) {
                    nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
                }else nums[i][j] = 0;
            }
        }

        return nums[m-1][n-1];
    }
}
