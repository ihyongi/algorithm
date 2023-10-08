package fastcampus.class01;

public class SingleLinkedList5<T> {
    public Node<T> head = null;

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data){
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            if (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data); //맨끝에 연결해라
        }
    }

    public void printAll(){
        if (head != null) {
            Node<T> node = this.head;
            System.out.println("node = " + node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println("node = " + node.data);
            }
        }
    }

    public Node<T> search(T data){
        if (this.head == null) {
            return null;
        }else{
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData){
        Node<T> search = this.search(isData);

        if(search == null){
            this.addNode(data);
        }else{
            Node<T> next = search.next;
            search.next = new Node<T>(data);
            search.next.next = next;
        }
    }

    public boolean delNode(T isData){
        if (this.head == null) {
            return false;
        } else{
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            }else{
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
        SingleLinkedList5<Integer> MyLinkedList = new SingleLinkedList5<Integer>();
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
