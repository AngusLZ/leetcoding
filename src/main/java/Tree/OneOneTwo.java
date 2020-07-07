package Tree;

import Tree.TreeNode;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/7
 * TODO:
 */

public class OneOneTwo {
    int judge = 0;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        takeIt(root , sum);
        return judge == 1 ? true : false;
    }

    public void takeIt(TreeNode treeNode , int number){

        if (treeNode.val == number && treeNode.left == null && treeNode.right == null){
            judge = 1;
        }
        if (treeNode.left != null){
            takeIt(treeNode.left , number - treeNode.val);
        }
        if (treeNode.right != null){
            takeIt(treeNode.right , number - treeNode.val);
        }
    }
}
