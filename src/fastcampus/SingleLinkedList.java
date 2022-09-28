package fastcampus;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data; //데이터
        Node<T> next = null;//포인터, next가 널이면 헤드란소리

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data); //맨끝에 연결해라
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) { //다음노드가 있다
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data) { //해당노드를 리턴
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while(node != null) {
                if (node.data == data) { //해당노드의 데이터가 내가찾는거냐?
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null; //다돌았는데 없다는거
        }
    }

    public void addNodeInside(T data, T isData) { //넣을데이터, 가지고있는 인자
        Node<T> searchedNode = this.search(isData); //isData위치찾는 메서드 필요

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data); //데이터넣고
            searchedNode.next.next = nextNode; //포인터
        }
    }

    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;//헤드의데이터삭제
            if (node.data == isData) {
                this.head = this.head.next; //GC에의해 삭제

                return true;
            } else { //헤드이후의 데이터 삭제
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public static void main(String[] args) {
//        fastcampus.SingleLinkedList<Integer> MyLinkedList = new fastcampus.SingleLinkedList<Integer>();
//        MyLinkedList.addNode(1);
//
//        System.out.println(MyLinkedList.head.data);
//        MyLinkedList.addNode(2);
//        System.out.println(MyLinkedList.head.next.data);
//
//        MyLinkedList.printAll();

//        fastcampus.SingleLinkedList<Integer> MyLinkedList = new fastcampus.SingleLinkedList<Integer>();
//        MyLinkedList.addNode(1);
//        MyLinkedList.addNode(2);
//        MyLinkedList.addNode(3);

//        MyLinkedList.printAll();

//        MyLinkedList.addNodeInside(5, 1); //1을찾아서 그 뒤에 5넣어라
//        MyLinkedList.addNodeInside(6, 3);
//        MyLinkedList.addNodeInside(7, 20); //20이란 데이터 음슴,,
//        MyLinkedList.printAll();

        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);

//        MyLinkedList.printAll();
        MyLinkedList.delNode(3);
        MyLinkedList.delNode(1);
        MyLinkedList.printAll();


    }
}
