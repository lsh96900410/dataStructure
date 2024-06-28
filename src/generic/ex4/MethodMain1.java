package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        //Integer result = (Integer)GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달 
        // - Generic Class  : 객체를 생성하는 시점에 타입 인자를 전달
        // - Generic Method : 메소드를 호출하는 시점에 타입 인자를 전달

        /* Generic Type 은 Static Method 에서 타입 매개변수로 사용할 수 없다.
        *  Generic Type 은 객체 생성 시점과 관련되어서 타입이 결정되지만,
        *  Static Method 는 Instance Scope 보단 Class Scope 단위로 동작되기 때문
        *  Static Method 에 Generic 을 도입하려면 Generic Method 를 사용해야 한다.
        */
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        /*
         *  Generic Method Type Inference - 제네릭 메서드 타입 추론
         *  - 자바 컴파일러는 타입 매개변수에 전달되는 인자 i의 타입이 Integer 라는 것을 알 수 있다.
         *  - 더불어 20.0 과 같은 Double Type 인자도 추론이 가능하다.
         *  - 그렇기에, 개발자가 인자를 직접 전달하는 불편함을 덜 수 있다.
         *  - 이러한 기능을 사용할 때에는 실제로 타입 인자가 전달되는 것은 기억하자.
         */

        System.out.println(" Generic 타입 추론");
        Integer inferenceResult = GenericMethod.genericMethod(i);
        Integer inferenceIntegerValue = GenericMethod.numberMethod(i);
        Double inferenceDoubleValue = GenericMethod.numberMethod(20.0);

    }
}
