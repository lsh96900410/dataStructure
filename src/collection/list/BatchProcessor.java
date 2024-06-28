package collection.list;

public class BatchProcessor {

    // 추상화 의존과 의존성 주입을 통해 결합도 낮추기
    // -> 클래스 코드 변경없이 BatchProcessor 생성 시점에 로직에 알맞은 List 전략(알고리즘)을 런타임에 지정할 수 있다.
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list){
        this.list = list;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i); // 앞에 추가
        }
        long endTime = System.currentTimeMillis();

        System.out.println("크기 : " + size + ", 계산 시간 : " + (endTime - startTime) +"ms");
    }
}
