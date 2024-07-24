package collection.deque;

/*
    Deque
    양쪽으로 데이터를 입력하고 출력할 수 있으므로 스택과 큐의 역할을 모두 수행할 수 있다.
    Stack 과 Queue 로 사용하기 위한 메서드 이름까지 제공한다.

    Java 에서 Stack 자료 구조는 성능이 좋지 못하고, 하위 호환을 위해 남겨져 있기때문에
    Stack 구조가 필요하다면 Deque - ArrayDeque 구현체를 사용하기
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println( deque);
        

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만 진행)
        System.out.println("deque.peek() = " + deque.peek());


        // 데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());

        System.out.println(deque);
    }

}
