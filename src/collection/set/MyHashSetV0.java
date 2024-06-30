package collection.set;

import java.util.Arrays;

/*
 *  구조는 단순하지만, 데이터 추가/검색 모두 O(n)으로 성능이 좋지 않다.
 *  특히, 데이터 추가에서 중복 데이터 체크를 위해 셋의 전체 데이터를 순회하기에 성능이 O(n)으로 하락
 *  -> 해시 알고리즘 도입해보기
 */

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value){

        if(contains(value)){
            return false;
        }

        elementData[size] = value;
        size ++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int data : elementData){
            if(data == value){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }


}
