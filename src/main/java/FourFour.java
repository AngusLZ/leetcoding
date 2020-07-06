import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/5
 * TODO:
 */

public class FourFour {
    public boolean isMatch(String s, String p) {
//        s是待匹配的  p是正则

        int sSize = s.length();
        int pSize = p.length();

        boolean[][] judge = new boolean[pSize+1][sSize+1];

        judge[0][0] = true;
        for (int i = 1; i <= pSize; ++i) {
            if (p.charAt(i - 1) == '*') {
                judge[i][0] = true;
            } else {
                break;
            }
        }

        for (int i = 1 ; i <= pSize ; i++){
            for (int j = 1 ; j <= sSize ; j++){
                if (p.charAt(i - 1) == '*'){
                    judge[i][j] = judge[i][j-1] || judge[i-1][j];
                }
                if (p.charAt(i - 1) == '?' || p.charAt(i - 1) == s.charAt(j - 1)){
                    judge[i][j] = judge[i-1][j-1];
                }
            }
        }

        return judge[pSize][sSize];
    }
}
