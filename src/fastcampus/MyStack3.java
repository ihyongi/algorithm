package fastcampus;

import java.util.ArrayList;

public class MyStack3<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(stack.isEmpty()){
            return null;
        }
        return stack.remove(stack.size() -1 );
    }

    public static void main(String[] args) {
        MyStack3<Integer> ms = new MyStack3<Integer>();
        ms.push(1);
        ms.push(2);
        System.out.println(ms.pop());
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
    }
}
