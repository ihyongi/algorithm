package fastcampus.class01;

public class DoubleLinkedList2<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(this.head == null){
            this.head = new Node<>(data);
            this.tail = this.head;
        }else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll(){
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println("head = " + node.data);
            while(head.next != null){
                node = node.next;
                System.out.println("node = " + node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if(this.head == null){
            return null;
        }else{
            Node<T> node = this.head;
            while (node != null){
                if (node.data == isData) {
                    return node.data;
                }else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if (this.head == null) {
            return null;
        }else{
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                }else{
                    node = node.prev;
                }
            }
            return null;
        }
    }

    public boolean insertToFront(T existedData, T addData) {
        if (this.head == null) {
            this.head = new Node<>(addData);
            this.tail = this.head;
            return true;
        }else if (this.head.data == existedData) {
            Node<T> newHead = new Node<>(addData);
            newHead.next = this.head;
            this.head = newHead;
            this.head.next.prev = this.head;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {
                    Node<T> nodePrev = node.prev; //찾았다
                    nodePrev.next = new Node<>(addData);
                    nodePrev.next.next = node; // 기존노드 할당
                    nodePrev.next.prev = nodePrev;
                    node = nodePrev.next;
                }
                else{
                    node = node.next;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList2<Integer> MyLinkedList = new DoubleLinkedList2<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(3, 2);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(6, 2);
        MyLinkedList.insertToFront(1, 0);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.addNode(6);
        MyLinkedList.printAll();
    }
}
