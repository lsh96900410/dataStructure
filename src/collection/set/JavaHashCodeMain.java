package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object 기본 hashCode : 객체의 참조값을 기반으로 생성

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj1 = " + obj1);

        //각 클래스마다 hashCode 이미 오버라이딩 함
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());
        /*
           10.hashCode() = 10
           'A'.hashCode() = 65
           'AB'.hashCode() = 2081
         */


        //hashCode 마이너스 값도 가능
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());


        // 둘은 같을까 다를까?
        // 인스턴스는 다르지만, equals 는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        
        //equals, hashCode 를 오버라이딩 하지 않은 경우와 한 경우를 비교

        System.out.println("(member1 == member2) = "+ (member1 == member2 ) ); // false, 객체 비교
        System.out.println("(member1 equals member2) = "+ (member1.equals(member2))); // true, 값 비교

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        /*
            HashCode 오버라이딩 O - Objects.hash() 사용 : 참조값이 달라도 값이 같으면 같은 hashCode

            member1.hashCode() = 104101
            member2.hashCode() = 104101

            HashCode 오버라이딩 X - Object 기본 제공 hashCode() 사용 : 객체의 참조값 기반

            member1.hashCode() = 122883338
            member2.hashCode() = 666641942
         */

    }
}
