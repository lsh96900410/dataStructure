package collection.set.hashAlgorithm;

import java.util.Arrays;

public class HashStart2 {
    /*
     *  목표 : 검색 기능 O(n) -> O(1) 변경해보기
     *
     *  방법 : 데이터의 값을 인덱스 번호로 사용하는 아이디어
     *
     *  문제 : 데이터 값이 큰 상황에서는 해당 값보다 작은 인덱스 빈 메모리 할당으로 메모리 효율성 하락
     */

    public static void main(String[] args) {
        // 입력: 1, 2, 5, 8
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;

        System.out.println("inputArray = " + Arrays.toString(inputArray));
        // inputArray = [null, 1, 2, null, null, 5, null, null, 8, null]


        int searchValue = 8;
        // 배열의 인덱스를 사용해서 조회하기에 O(1)로 매우 빠르다.
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
