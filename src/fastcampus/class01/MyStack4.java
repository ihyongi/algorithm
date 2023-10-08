package fastcampus.class01;

import java.util.ArrayList;

public class MyStack4<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1); //맨마지막값 제거
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack4<Integer> ms = new MyStack4<>();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        System.out.println("ms = " + ms.pop());
        ms.push(4);
        System.out.println("ms = " + ms.pop());
    }

}
