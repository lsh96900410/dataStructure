package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal=new Animal("동물",0);
        Dog dog=new Dog("멍멍이",100);
        Cat cat=new Cat("냐옹이",50);

        // 부모 타입인 Animal 의 하위 타입인 Dog, Cat 도 전달 가능, get()을 통해 꺼낼 때는 Animal 타입으로만 가능하다.
        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
