package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/*
 *  HashIndex 도입해서 등록, 검색, 삭제 모두 평균 0(1)로 연산 속도 개선
 *  해시 충돌 경우(최악) O(n) 이지만, 발생 가능성이 낮다.
 *
 *  문제 : 배열의 인덱스는 숫자만 사용이 가능하기에, 문자열은 배열의 인덱스로 불가하다.
 */

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    // Default 16, parameter : capacity (배열 크기 동적 생성 가능)
    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity){
        this.capacity=capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    public boolean add(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];

        if(bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }


    public boolean contains(Object searchValue){
        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; //O(1)

        return bucket.contains(searchValue); //O(n) [최악] -> O(1) [평균]
    }


    public boolean remove(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];

        boolean result = bucket.remove(value);

        if(result){
            size --;
            return true;
        } else{
            return false;
        }

    }

    public int size(){
        return size;
    }


    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }


    private int hashIndex(Object value){
        return Math.abs(value.hashCode()) % capacity;
    }
}
