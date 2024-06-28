package collection.list;

import java.util.Arrays;


public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E e){
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }
    @Override
    public void add(int index, E e){
        if(size == elementData.length){
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index){
        return (E) elementData[index];
    }
    @Override
    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;

        return oldValue;
    }
    @Override
    public E remove(int index){
        E oldValue = get(index);
        shiftLeftFrom(index);

        size --;
        elementData[size] = null;
        return oldValue;
    }

    @Override
    public int indexOf(E o){
        for (int i = 0; i <size; i++){
            if (o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity){
        elementData= new Object[initialCapacity];
    }
    private void shiftRightFrom(int index) {
        for(int i = size; i > index ; i--){
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity *2;

        elementData=Arrays.copyOf(elementData, newCapacity);
    }
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1 ; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size)) +
                " size= "+size + ", capacity= " +elementData.length ;
    }
}
