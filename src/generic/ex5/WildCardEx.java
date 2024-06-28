package generic.ex5;

import generic.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV12(Box<T> box){
        System.out.println(" T = " + box.get());
    }

    // T 는 최대 Animal Type 까지의 상한선 설정
    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // Box<Dog>, Box<Cat>, Box<Object> 다 가능
    static void printWildCartV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    static void printWildCartV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }


    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildCard(Box<? extends Animal> box){
        Animal animal= box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
