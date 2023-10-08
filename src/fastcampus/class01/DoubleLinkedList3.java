package fastcampus.class01;

public class DoubleLinkedList3<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T>{
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
        }else {
            //맨마지막에 데이터 추가
            Node<T> node = this.head;
            while (node.next != null) node = node.next;
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll(){
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println("node = " + node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println("node.data = " + node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if (this.head == null) {
            return null;
        }else{
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                }else{
                    node = node.next;
                }
            }
        }
        return null;
    }

    public T searchFromTail(T isData){
        if (this.head == null) {
            return null;
        }else{
            Node<T> node = this.head;
            while (node != null) {
                if(node.data == isData) return node.data;
                else node = node.prev;
            }
        }
        return null;
    }


    public boolean insertToFront(T existData, T addData){
        if (this.head == null) {
            this.head = new Node<>(addData);
            this.tail = this.head;
        }else if (this.head.data == existData){
            Node<T> newOne = new Node<>(addData);
            newOne.next = this.head;
            this.head = newOne;
            this.head.next.prev = this.head; // tail
            return true;
        } else{
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existData){
                    Node<T> prev = node.prev;
                    prev.next = new Node<>(addData);
                    prev.next.next = node;
                    prev.next.prev = prev; //tail
                    return true;
                }else{
                    node = node.next;
                }
            }
        }
        return false;
    }


}

