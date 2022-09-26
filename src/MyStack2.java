import java.util.ArrayList;

public class MyStack2<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(stack.isEmpty()){
            return null;
        }
        return stack.remove(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack2<Integer> myStack2 = new MyStack2();
        myStack2.push(1);
        myStack2.push(2);
        myStack2.push(3);

        System.out.println(myStack2.pop());
    }
}
