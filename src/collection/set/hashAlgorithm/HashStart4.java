package collection.set.hashAlgorithm;

import java.util.Arrays;

public class HashStart4 {
    /*
     *  HashIndex 사용해서 불필요한 메모리 사용 해결하기
     *
     *  1. HashIndex(입력 값을 계산해서 인덱스로 사용) 이용해서 배열 크기 줄여 메모리 낭비 문제 해결
     *  2. HashIndex - 데이터 저장과 조회 로직에서 O(1) 성능으로 개선
     *
     *  HashIndex 를 구하는 로직에서 중복되는 값이 발생하는 해쉬 충돌 가능성 존재
     */

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(199 = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray,1);
        add(inputArray,2);
        add(inputArray,5);
        add(inputArray,8);
        add(inputArray,14);
        add(inputArray,99);
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));
        // Arrays.toString(inputArray) = [null, 1, 2, null, 14, 5, null, null, 8, 99]


        // 검색 : HashIndex 구하기 -> Index 사용해서 값 꺼내기
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        Integer result = inputArray[hashIndex];
        System.out.println("result = " + result);
        // result = 14
    }

    static int hashIndex(int value){
        return value % CAPACITY ;
    }

    private static void add(Integer[] inputArray, int value){
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }
}
