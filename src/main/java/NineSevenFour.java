import java.util.HashMap;

/**
 * @author 会飞的大野鸡
 * @create 2020/6/27
 * TODO:
 */

public class NineSevenFour {

    public int subarraysDivByK(int[] A, int K) {
        int sum = 0;
        HashMap<Integer , Integer> hashMap = new HashMap<Integer, Integer>();
//       键为余数 ，值为次数
        hashMap.put(0 , 1);
        int count = 0;
        int number;
        for (int i = 0 ; i < A.length ; i++){
            sum += A[i];
            number = (sum % K + K)%K;  //将负数改成正数。语言存在差异  Java中 -2%5=-2  处理后=3
//            int key = (sum % K + K) % K;
            if (hashMap.containsKey(number)){
                hashMap.put(number , hashMap.get(number)+1);
            }
            if (!hashMap.containsKey(number)){
                hashMap.put(number , 1);
            }
//
            System.out.println(sum);
            System.out.println(hashMap);
        }

        int a;
        for (Integer key : hashMap.keySet()){
            if (hashMap.get(key) > 1){
                a = (hashMap.get(key) * (hashMap.get(key) - 1)) / 2;
                count+=a;
            }
        }

        return count;
    }


}
