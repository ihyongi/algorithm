package fastcampus.class01;

public class DoubleLinkedList5<T> {
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
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        }else{
            Node<T> node = this.head;
            while (node.next != null) {
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
            System.out.println("node = " + node.data);
            while(node.next != null){
                node = node.next;
                System.out.println("node = " + node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if (this.head == null) {
            return null;
        }else{
            Node<T> node = this.head;
            while (node.next != null) {
                if(node.data == isData) return node.data;
                else node = node.next;
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null){
                if (node.data == isData) return node.data;
                else node = node.prev;
            }
            return null;
        }
    }

    public boolean insertToFront (T exist, T addData){
        if (this.head == null) {
            this.head = new Node<>(addData);
            this.tail = this.head;
            return true;
        }
        else if(this.head.data == exist){
            Node<T> newOne = new Node<>(addData);
            newOne.next = this.head;
            this.head = newOne;
            this.head.next.prev = this.head;
            return true;
        }else{
            Node<T> node = this.head;
            while (node.next != null) {
                if (node.data ==exist) {
                    Node<T> prevOne = node.prev;
                    prevOne.next = new Node<T>(addData);
                    prevOne.next.next = node;
                    prevOne.next.prev = prevOne;
                    node.prev = prevOne.next;
                    return true;
                }else{
                    node = node.next;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList5<Integer> MyLinkedList = new DoubleLinkedList5<Integer>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll
                ();
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
