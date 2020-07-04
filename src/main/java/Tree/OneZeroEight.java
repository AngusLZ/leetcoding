package Tree;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/3
 * TODO:
 */

/**
 *
 public class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int x) { val = x; }
 }
 */


public class OneZeroEight {
    public TreeNode sortedArrayToBST(int[] nums) {
        return mkTree(nums , 0 , nums.length-1);
    }

    public TreeNode mkTree(int[] nums , int min , int max){
        if (min > max){
            return  null;
        }
        int index = (max + min)/2;

        TreeNode treeNode = new TreeNode(nums[index]);

        treeNode.left = mkTree(nums , min , index -1);
        treeNode.right = mkTree(nums , index+1 , max);

        return treeNode;
    }
}
