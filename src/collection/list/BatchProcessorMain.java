package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyLinkedList<Integer> list = new MyLinkedList<>();
        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50000);
    }
}
