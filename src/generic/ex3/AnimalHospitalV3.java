package generic.ex3;


import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    // 타입 매개변수 제한 : < T extends Animal >
    // Generic T 타입 매개변수에는 타입 인자로 Animal Class or Animal 하위 클래스만 가능하다는 제한
    private T animal;

    public void set(T animal){
        this.animal=animal;
    }
    public void checkUp(){
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object 기능만 사용
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : "+animal.getSize());
        animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
