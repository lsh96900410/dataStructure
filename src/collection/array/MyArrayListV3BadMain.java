package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자 3");
        System.out.println(numberList);

        // Object 를 반환하므로 다운 캐스팅 작업 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // ClassCastException 발생
        Integer num3 = (Integer) numberList.get(2);
    }
}
