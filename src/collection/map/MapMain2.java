package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA",90);
        System.out.println(studentMap);


        // 중복 키로 다른 데이터 저장시 기존 값 교체
        studentMap.put("studentA",100);
        System.out.println(studentMap);


        //
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);


        studentMap.remove("studentA");
        System.out.println(studentMap);

    }
}
