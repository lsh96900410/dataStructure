package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 인덱스의 노드 조회하기
        int index =2 ;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);


        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first,"D");
        System.out.println(first);
        add(first,"E");
        System.out.println(first);
        add(first,"F");
        System.out.println(first);

    }

    private static void printAll(Node node) {
        Node x = node;
        while ( x != null ){
            System.out.println(x.item);
            x = x.next;
        }
    }

    // x.next != null : 다음 노드가 존재한다
    // x 참조 = x.next, 다음 노드로 변경
    // 만약 x.next == null 이면 다음 노드가 없다는 의미 즉, x가 마지막 노드
    private static Node getLastNode(Node node) {
        Node x = node;

        while ( x.next != null ){
            x = x.next;
        }

        return x;
    }

    // Index 횟수 만틈 .next 다음 노드로 참조 변경
    private static Node getNode(Node first, int index) {
        Node x = first;
        for (int i = 0 ; i < index ; i++ ){
            x = x.next;
        }
        return x;
    }
    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next= new Node(param);
    }
}
