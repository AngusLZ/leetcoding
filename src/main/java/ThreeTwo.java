import java.util.LinkedList;
import java.util.List;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/4
 * TODO:
 */

public class ThreeTwo {
    public int longestValidParentheses(String s) {
        char[] letters = s.toCharArray();
        int count = 0 ;
        int ret = 0;
        char le1 = "(".toCharArray()[0];
        char le2 = ")".toCharArray()[0];
        int[] nums = new int[letters.length];
        for (int i = 0 ; i < letters.length - 1 ; i++){
            if (letters[i] == le1 && nums[i] != 3){
                nums[i] = 1;
            }
            if (letters[i+1] == le1 && nums[i+1] != 3){
                nums[i+1] = 1;
            }
            if (letters[i] == le2 && nums[i] != 3){
                nums[i] = 2;
            }
            if (letters[i+1] == le2 && nums[i+1] != 3){
                nums[i+1] = 2;
            }
            if (letters[i] == le1 && letters[i+1] == le2){
                nums[i] = nums[i+1] = 3;
            }
        }

//        System.out.println("第一次：");
//        for (int i : nums){
//            System.out.print(i + " ");
//        }
//        System.out.println();

        List<Integer> numOne = new LinkedList<Integer>();

        for (int i = 0 ; i < letters.length ; i++){
            if (nums[i] == 1){
                numOne.add(i);
            }
            if (nums[i] == 2){
                if (!numOne.isEmpty()){
                    nums[i] = nums[numOne.get(numOne.size()-1)] = 3;
                    numOne.remove(numOne.size()-1);
                }
            }
        }

//        for (int i : nums){
//            System.out.print(i + " ");
//        }
//        System.out.println();

        for (int i = 0 ; i < letters.length ; i++){
            if (nums[i] == 3){
                count++;
            }
            if (nums[i] != 3){
                count = 0;
            }
            ret = (ret > count ? ret : count);
        }


//        System.out.println(le1);
//        System.out.println(letters[0] == le1);
//        int judge = 0;
//        for (int i = 0 ; i < letters.length ; i++){
//            if (letters[i] == le1){
//                judge++;
//            }
//            if (letters[i] == le2){
//                judge--;
//                if (judge >= 0){
//                    count+=2;
//                }else {
//                    judge = 0;
//                }
//            }
//            ret = (ret > count ? ret : count);
//        }
        return ret;
    }
}
