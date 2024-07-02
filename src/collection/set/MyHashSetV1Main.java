package collection.set;

import collection.set.MyHashSetV1;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        var set = new MyHashSetV1(10);
        // MyHashSetV1{buckets=[[], [1], [2], [99], [], [5], [], [], [8], [9], [], [], [], [], [14], []], size=7, capacity=16} - 기본 init
        // MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99, 9]], size=7, capacity=10} - 배열 크기 동적 init

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // hashIndex 중복 case
        System.out.println(set);


        // 검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains("+searchValue+") = "+result);


        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
        // MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99]], size=6, capacity=10}
    }
}
