package collection.set;

public class StringHashMain {

    /*
     * HashCode
     * : 데이터를 대표하는 값
     * : 문자 데이터를 사용할 때도 해시 함수를 통해 정수 기반으로 변환 작업이 가능하여 Hash Index 사용 가능
     * -> 어떠한 객체든 정수로 만든 해시 코드만 정의할 수 있다면 해시 인덱스를 사용할 수 있다.
     *
     *  문제 : 문자 데이터 변환 방식 확인, 객체는 어떻게 해시 코드 표현?
     */


    static final int CAPACITY=10;

    public static void main(String[] args) {

        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);


        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));


        //hashIndex
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex = " + hashIndex);


        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str){

        char[] charArray = str.toCharArray();
        int sum = 0;

        for (char c : charArray){
            sum = sum + (int) c;
        }
        return sum;
    }


    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
