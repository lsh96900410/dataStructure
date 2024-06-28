package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

        /**
         *  Generic 타입을 사용할 때는 항상 <>(다이아몬드)를 사용해서 사용시점에 원하는 타입을 지정해야 한다.
         *  만약, <>을 지정하지 않을 수 있는데, 이런 것을 로 타입(row type), 또는 원시 타입이라한다.
         *  이런 row type 을 사용하면 내부의 타입 매개변수가 Object 로 사용된다고 이해하자.
         *  만약, Object 타입을 사용해야 한다면, 7 Line 처럼 타입 인자로 Object 를 지정해서 사용하면 된다.
         */
    }
}
