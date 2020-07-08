import Tree.TreeNode;
import dongtaiguihua.FourFour;

/**
 * @author 会飞的大野鸡
 * @create 2020/6/27
 * TODO:
 */

public class DoIt {
    public static void main(String[] args){
        System.out.println(new OneSixPointOneOne().divingBoard(6 , 9 , 47997));

        System.out.println(new OneSixPointOneOne().divingBoard(1 , 1 , 100000));

//        TreeNode treeNode = new TreeNode();

//        int[][] a = {{0,0,0} , {0,1,0} , {0,0,0}};
//        int[][] b = {{1}};
//        int[][] c = {
//                {0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1,0,0},
//                {0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
//                {1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0},
//                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1},
//                {0,0,0,1,0,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
//                {0,0,1,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0},
//                {0,0,0,0,0,0,1,0,0,0,1,1,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0},
//                {1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1},
//                {0,0,0,0,1,0,0,1,0,1,1,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
//                {0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0},
//                {1,0,1,0,1,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,1,0},
//                {0,0,0,0,0,0,1,0,0,1,1,0,0,1,0,0,0,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,0,0,1},
//                {0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0},
//                {1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
//                {0,1,0,0,1,0,0,0,0,0,1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0},
//                {0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0},
//                {0,0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
//                {0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0},
//                {0,0,0,1,0,1,0,0,1,0,0,0,0,0,1,1,1,0,1,1,1,0,0,1,0,1,0,1,1,1,0,0,0,0,0,0},
//                {0,0,1,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
//                {1,1,0,0,0,0,1,0,0,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
//                {0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0},
//                {0,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,0,0,0,0,0,1,0,0,0,1,1,0,0},
//                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0}};
//        int[][] d = {{0,0} , {1,1} , {0,0}};
//        System.out.println(new SixEight().uniquePathsWithObstacles(a));
//        System.out.println(new SixEight().uniquePathsWithObstacles(b));
//        System.out.println(new SixEight().uniquePathsWithObstacles(c));
//        System.out.println(new SixEight().uniquePathsWithObstacles(d));

//        String a = "ab";
//        String b = "b";
//        String c = "aa";
//        String d = "a";
//        String e = "aa";
//        String f = "*";
//        String g = "cb";
//        String h = "?a";
//        String i = "adceb";
//        String j = "*a*b";
//        String k = "cdcb";
//        String l = "a*c?b";
//        String m = "aab";
//        String n = "c*a*b";
//
//        System.out.println(new FourFour().isMatch(a , b));
//        System.out.println(new FourFour().isMatch(c , d));
//        System.out.println(new FourFour().isMatch(e , f));
//        System.out.println(new FourFour().isMatch(g , h));
//        System.out.println(new FourFour().isMatch(i , j));
//        System.out.println(new FourFour().isMatch(k , l));
//        System.out.println(new FourFour().isMatch(m , n));


//        int[][] mm= {{1,5,9} , {10,11,13} , {12,13,15}};

//        List<Integer> numOne = new LinkedList<Integer>();
//        numOne.add(1);
//        numOne.add(2);
//        System.out.println(numOne);
//        numOne.remove(numOne.size()-1);
//        System.out.println(numOne);
//        System.out.println(numOne.isEmpty());


//        String a = "(()())";
//        String b = "()()";
//        String c = "(()";
//        String d = ")()())";
//        String e = "()(())";
//        String f = "()(()";
//        System.out.println(new ThreeTwo().longestValidParentheses(a));
//        System.out.println(new ThreeTwo().longestValidParentheses(b));
//        System.out.println(new ThreeTwo().longestValidParentheses(c));
//        System.out.println(new ThreeTwo().longestValidParentheses(d));
//        System.out.println(new ThreeTwo().longestValidParentheses(e));
//        System.out.println(new ThreeTwo().longestValidParentheses(f));


//        System.out.println(new ThreeSevenEight().kthSmallest(mm , 7));
//        int[][] a = {{1,2} , {3,4}};
//        for (int[] i:
//             a) {
//            for (int j:
//                 i) {
//                System.out.println(j);
//            }
//        }
//        System.out.println(a.length * a[0].length);

//        int[] a = {1,2,3,2,1};
//        int[] b = {2,3,2,1,4,7};
//
//        int[] c = {1,0,0,0,0};
//        int[] d = {0,0,0,0,1};
//
//        int[] e = {1,1,1,1,1};
//        int[] f = {0,1,1,1,0};
//
//        int[] g = {5,14,53,80,48};
//        int[] h = {50,47,3,80,83};
//
//        int[] j = {2,3,2,1};
//        int[] k = {1,4,7,1,2,3};

//        int max = j.length > k.length ? j.length : k.length;
//        int[] A1 = new int[max];
//        int[] B1 = new int[max];
//        for (int i = 0 ; i < max ; i++){
//            A1[i] = B1[i] = 101;
//        }
//
//        A1 = k;
//        B1 = j;
////        B1[max - j.length + 2] = 101;
//
//        for (int i: A1
//             ) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        for (int i: B1
//        ) {
//            System.out.print(i + " ");
//        }


//        ShuZu.TwoOneFive twoOneFive = new ShuZu.TwoOneFive();
//        System.out.println(twoOneFive.findKthLargest(a , 5));

//        System.out.println(new ShuZu.SevenOneEight().findLength(a , b));
////
//        System.out.println(new ShuZu.SevenOneEight().findLength(d , c));
//
//
//        System.out.println(new ShuZu.SevenOneEight().findLength(e , f));
//
//        System.out.println(new ShuZu.SevenOneEight().findLength(f , e));
//
//        System.out.println(new ShuZu.SevenOneEight().findLength(j , k));

//        System.out.println(3 > 3 ? 3 : 3);


//        System.out.println(5/2);
//        for (int i = 0 ; i < a.length ; i++){
//            for (int j = 0 ; j < a.length - i - 1 ; j++){
//                int temp;
//                if (a[j] > a[j+1]){
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(a[0]);

//        String[] a = {"O X" , " XO" , "X O"};
//        String[] b = {"OOX" , "XXO" , "OXO"};
//        String[] c = {"OOX" , "XXO" , "OX "};
//        String[] d = {"   " , "XXO" , "OOO"};
//
//        ShuZu.MsOneSivePZeroFour msOneSivePZeroFour = new ShuZu.MsOneSivePZeroFour();
//        System.out.println(msOneSivePZeroFour.tictactoe(a));
//        System.out.println(msOneSivePZeroFour.tictactoe(b));
//        System.out.println(msOneSivePZeroFour.tictactoe(c));
//        System.out.println(msOneSivePZeroFour.tictactoe(d));
//        String a1 = String.valueOf(a[0].charAt(0));
//
//        char a2 = a[0].charAt(0);
//        char a3 = a[0].charAt(1);
//
//        System.out.println(" "+0);
//
//
//        if (a1.equals(" ")){
//            System.out.println(1);
//        }


//        System.out.println(a1);

//        System.out.println(a[0].cha);

    }


}
