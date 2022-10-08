package fastcampus;

public class SingleLinkedList4<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if (head == null) {
            head = new Node<>(data);
        }else{
            Node<T> node = this.head;
            while (node.next != null) node = node.next;
            node.next = new Node<>(data);
        }
    }

    public void printAll(){
        if (head != null) {
            Node<T> node = this.head;
            System.out.println("node = " + node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println("next = " + node.data);
            }
        }
    }

    public Node<T> search(T data){
        if (this.head == null) {
            return null;
        }
        else{
            Node<T> node = this.head;
            while (node != null) {
                if(node.data == data){
                    return node;
                }else{
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
            Node<T> nextNode = search.next;
            search.next = new Node<>(data);
            search.next.next = nextNode;
        }
    }


    public boolean delNode(T isData){
        if (this.head == null) {
            return false;
        }else{
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
        SingleLinkedList4<Integer> MyLinkedList = new SingleLinkedList4<>();
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
