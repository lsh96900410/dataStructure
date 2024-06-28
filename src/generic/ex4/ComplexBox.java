package generic.ex4;

import generic.animal.Animal;


/*
 * 제네릭 타입과 제네릭 메서드의 우선순위
 *
 * 1. 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다.
 * 2. printAndReturn 메서드에서 T는 제네릭 메서드의 타입 매개변수로 작동한다.
 *    그렇기에 extends Animal 이라는 상한이 없기에 Object 로 취급된다.
 * 3. 프로그래밍에서 이렇게 모호한 것은 좋지 않기에, 왠만하면 다른 이름으로 변경을 해서 중복 방지 -> Z로 변경
 */
public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z){
        System.out.println("animal.className: " +animal.getClass().getName());
        System.out.println("z.className: " + z.getClass().getName());
        return z;
    }
}
