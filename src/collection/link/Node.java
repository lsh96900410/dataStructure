package collection.link;

/*
    배열 리스트의 단점
    1. 필요한 배열의 크기를 미리 확보해야 하기때문에 낭비되는 메모리 공간이 생긴다.
    2. 배열의 앞이나 중간에 데이터를 추가, 삭제하는 경우 많은 데이터를 이동시켜야 하기에 성능상 안좋다.

    노드와 연결
    1. 낭비되는 메모리없이 딱 필요한 만큼 메모리르 확보
    2. 노드를 생성한 후, 각 노드를 서로 연결하는 구조로 중간 데이터 삽입, 삭제에 유리하다.

*/


public class Node {

    Object item;
    Node next;

    public Node(Object item){
        this.item = item;
    }
/*
    IDE 생성 toString
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
*/

    // [ A -> B -> C ]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this; // x01
        sb.append("[");
        while ( x != null){
            sb.append(x.item);
            if( x.next != null){
                sb.append(" -> ");
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
