import java.lang.reflect.Array;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/8
 * TODO:
 */

public class OneSixPointOneOne {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0)
            return new int[0];
        if (shorter == longer){
            int[] a = new int[1];
            a[0] = shorter * k;
            return a;
        }
        int[] a = new int[k+1];
        int begin = shorter * k;
        a[0] = begin;

        for (int i = 1 ; i <= k ; i++){
            begin = begin - shorter + longer;
            a[i] = begin;
        }
        return a;
    }
}
