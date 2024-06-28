package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));

        WildCardEx.printGenericV12(dogBox);

        WildCardEx.printGenericV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        System.out.println("dog = " + dog);

        WildCardEx.printWildCartV1(dogBox);

        WildCardEx.printWildCartV2(dogBox);
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
        System.out.println("animal = " + animal);;
    }
}
