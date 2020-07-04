package ShuZu;

/**
 * @author 会飞的大野鸡
 * @create 2020/6/29
 * TODO:
 */

public class MsOneSivePZeroFour {
    public String tictactoe(String[] board) {
        int size = board.length;
        int count = 0;
        int[] sum1 = new int[size]; //行和
        int[] sum2 = new int[size]; //列和
        int[] sum3 = new int[2]; //对角和
        int judge1 = ("O".charAt(0) + 0)*size;
        int judge2 = ("X".charAt(0) + 0)*size;

        for (int i = 0 ; i < size ; i++){
            sum1[i] = 0;
            sum2[i] = 0;

            for (int j = 0 ; j < size ; j++){
                if (String.valueOf(board[i].charAt(j)).equals(" ")){
                    count++;
                }
                sum1[i] += (board[i].charAt(j) + 0);
                sum2[i] += (board[j].charAt(i) + 0);
            }
        }

        sum3[0] = 0;
        sum3[1] = 0;
        for (int i = 0 ; i < size ; i++){

            if (!String.valueOf(board[i].charAt(i)).equals(" "))
                sum3[0] += (board[i].charAt(i) + 0);
            if (!String.valueOf(board[i].charAt(size-i-1)).equals(" "))
                sum3[1] += (board[i].charAt(size-i-1) + 0);
        }

        if (sum3[0] == judge1 || sum3[1] == judge1){
            return "O";
        }

        if (sum3[0] == judge2 || sum3[1] == judge2){
            return "X";
        }


        for (int i = 0 ; i < size ; i++){
            if (sum1[i] == judge1 || sum2[i] == judge1 ){
                return "O";
            }
            if (sum1[i] == judge2 || sum2[i] == judge2){
                return "X";
            }
        }

        if (count != 0)
            return "Pending";

        return "Draw";
    }
}
