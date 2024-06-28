package collection.array;

import java.util.Arrays;

/*
 *  배열의 한계
 *  1. 선언 시 정적 메모리 할당으로 동적으로 길이 변경 불가
 *  2. 데이터 추가 시, 오른쪽으로 한 칸씩 밀면서 진행하기에 불편
 */
public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    /* ---------- 기본 생성자 : 디폴트 사이즈  ------------- */
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /* 사이즈 동적 할당 생성자 */
    public MyArrayListV1(int initialCapacity){
        elementData= new Object[initialCapacity];
    }
    /* -------------------------------------------------- */
    public int size(){
        return size;
    }

    /* Size : 배열 리스트에 실제 입력된 데이터 수
    *  Capacity : 배열의 크기 
    */
    public void add(Object e){
        elementData[size] = e;
        size++;
    }

    public Object get(int index){
        return elementData[index];
    }

    /* 해당 index 이전 Data 반환 + 새로운 Data 삽입 */
    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementData[index] = element;

        return oldValue;
    }

    /* List 순차 탐색 진행 -> 인수와 같은 데이터가 있는 인덱스 위치 반환 */
    public int indexOf(Object o){
        for (int i = 0; i <size; i++){
            if (o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size)) +
                " size= "+size + ", capacity= " +elementData.length ;
    }
}
