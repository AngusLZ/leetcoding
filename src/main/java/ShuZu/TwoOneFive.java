package ShuZu;

/**
 * @author 会飞的大野鸡
 * @create 2020/6/29
 * TODO:
 */

public class TwoOneFive {
    public int findKthLargest(int[] nums, int k) {
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = 0 ; j < nums.length - i - 1 ; j++){
                int temp;
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums[nums.length - k];
    }
}
