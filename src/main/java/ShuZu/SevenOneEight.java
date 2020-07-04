package ShuZu;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 会飞的大野鸡
 * @create 2020/7/1
 * TODO:
 */

public class SevenOneEight {
    public int findLength(int[] A, int[] B) {

        int max = A.length > B.length ? A.length : B.length;
        int[] A1 = new int[max];
        int[] B1 = new int[max];
        for (int i = 0 ; i < max ; i++){
            A1[i] = B1[i] = 101;
        }

        if(A.length > B.length){
            A1 = A;
            for (int i = 0 ; i < B.length ; i++){
                B1[i] = B[i];
            }
            for (int i = 0 ; i < (A.length - B.length) ; i++) {
                B1[B.length - 1 + i] = 101;
            }
        }
        if (B.length > A.length){
            B1 = B;
            for (int i = 0 ; i < A.length ; i++){
                A1[i] = A[i];
            }
            for (int i = 0 ; i < (B.length - A.length) ; i++) {
                A1[A.length - 1 + i] = 101;
            }
        }

        if (A.length == B.length){
            A1 = A;
            B1 = B;
        }

        int count = 1;
        int k = 0;
        int ret = 0;

        for (int i = 0 ; i < B1.length ; i++){
            k = 0;
            for (int j = 0 ; j < count ; j++){
                if (A1[A1.length - 1 - j] == B1[count - 1 - j]){
                    k++;
                }else {
                    ret = (ret > k ? ret : k);
                    k = 0;
                }
            }
            ret = (ret > k ? ret : k);
            if (count < B1.length)
                count++;
        }

        for (int i = 0 ; i < A1.length ; i++){
            k = 0;
            for (int j = 0 ; j < count ; j++){
                if (B1[B1.length - 1 - j] == A1[count - 1 - j]){
                    k++;
                }else {
                    ret = (ret > k ? ret : k);
                    k = 0;
                }
            }
            ret = (ret > k ? ret : k);
            count--;
        }

        return ret;
    }
}
