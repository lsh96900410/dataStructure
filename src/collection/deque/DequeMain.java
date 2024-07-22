package collection.deque;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();


        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque); // [1]

        deque.offerFirst(2);
        System.out.println(deque); // [2, 1]

        deque.offerLast(3);     // [2, 1, 3]
        System.out.println(deque);
        deque.offerLast(4);     // [2, 1, 3, 4]
        System.out.println(deque);
        
        
        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)

        System.out.println("deque.peek() = " + deque.peek());           // 2
        System.out.println("deque.peekFirst() = " + deque.peekFirst()); // 2
        System.out.println("deque.peekLast() = " + deque.peekLast());   // 4


        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 2
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 1

        System.out.println("deque.pollLast() = " + deque.pollLast());   // 4
        System.out.println("deque.pollLast() = " + deque.pollLast());   // 3
        System.out.println(deque);
    }
}
