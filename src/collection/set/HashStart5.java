package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    /*
     * CAPACITY : 배열의 크기
     * 통계적으로 입력 데이터 수가 배열 크기의 75%를 넘지 않으면 해시 인덱스 충돌 발생 가능성 적음
     * 상황에 따라 다르지만, 평균적으로 75%를 적절한 크기 기준으로 잡는 것이 효과적이다.
     *
     */

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}

        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9); // 중복 : 해시 충돌

        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains("+searchValue+") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);

        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)

        // 중복체크 - O(n)
        if(!bucket.contains(value)){
            bucket.add(value);
        }
    }

    static int hashIndex(int value){
        return value % CAPACITY ;
    }

    // [99, 9] -> contains : 9 search
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)

        return bucket.contains(searchValue); //O(n)

       /* for (var integer : bucket){
            if(integer == searchValue){
                return true;
            }
        }

        return false;*/
    }


}
