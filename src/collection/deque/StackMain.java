package collection.deque;

import java.util.Stack;

public class StackMain {
    /*
        주의 사항 - Stack 클래스는 사용하지 말자

        현재의 자바 Stack Class : 내부에서 Vector 자료 구조를 사용한다.
        Vector : 자바1.0에 개발, 현재는 사용 X + 하휘 호환을 위해 존재한다.
        Vector, Stack 사용 지양하기 -> Deque 사용 권장
     */

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);


        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
    }
}
