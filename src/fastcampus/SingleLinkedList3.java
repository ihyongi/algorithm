package fastcampus;

public class SingleLinkedList3<T> {

    private Node<T> head = null;

    public class Node<T>{
        T data;
        Node next;

        public Node (T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if (this.head == null) {
            this.head = new Node<>(data);
        }
        else{
            Node<T> node = this.head;
            while(node.next != null){
            node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public void printAll(){
        if(this.head != null){
            Node<T> node = this.head;
            System.out.println("node = " + node);
            while (node.next != null) {
                node = node.next;
                System.out.println("node = " + node);
            }
        }
    }

    public Node<T> search(T data) {
        if (this.head == null) {
            return null;
        }
        else{
            Node<T> node = this.head;
            while (node != null){
                if (node.data == data) {
                    return node;
                }else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData){
        Node<T> searchData = this.search(data);
        if(searchData ==null){
            this.addNode(data);
        }else{
            Node nextNode = searchData.next;
            searchData.next = new Node<>(data);
            searchData.next.next = nextNode;
        }
    }

    public boolean delNode(T isData){
        if (this.head == null) {
            return false;
        }else{
            Node<T> node = this.head;
            if(node.data == isData){
                this.head = this.head.next;
                return true;
            }
            else{
                while (node.next != null) {
                    if (node.next.data == isData){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }


}
