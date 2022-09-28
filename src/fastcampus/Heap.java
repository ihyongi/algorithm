package fastcampus;

import java.util.ArrayList;
import java.util.Collections;

public class Heap {

    public ArrayList<Integer> heapArray = null;

    public Heap (Integer data) {
        heapArray = new ArrayList<Integer>();

        heapArray.add(null);
        heapArray.add(data);
    }

//    public boolean insert(Integer data) {
//        if (heapArray == null) {
//            heapArray = new ArrayList<Integer>();
//
//            heapArray.add(null);
//            heapArray.add(data);
//        } else {
//            heapArray.add(data); //순차적으로 넣어준다
//        }
//        return true;
//    }

    //여기서부터 찐이다
    //여기서 별도 메서드로 판단
    public boolean move_up(Integer inserted_idx) {
        if (inserted_idx <= 1) { //1이면 루트노드
            return false;
        }
        Integer parent_idx = inserted_idx / 2;
        if (this.heapArray.get(inserted_idx) > this.heapArray.get(parent_idx)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insert(Integer data) {
        Integer inserted_idx, parent_idx; //인덱스 변수를 두개 두고

        if (heapArray == null) {
            heapArray = new ArrayList<Integer>();

            heapArray.add(null);
            heapArray.add(data);
            return true;
        }
        //여러 데이터가 있는 경우
        this.heapArray.add(data);
        inserted_idx = this.heapArray.size() - 1; //전체사이즈 - 1 --맨마지막 인덱스

        //조건 비교
        while (this.move_up(inserted_idx)) {
            parent_idx = inserted_idx / 2; //parent
            Collections.swap(this.heapArray, inserted_idx, parent_idx);
            inserted_idx = parent_idx;
        }
        return true;
    }

//    public Integer pop() {
//        if (this.heapArray == null) {
//            return null;
//        } else {
//            return this.heapArray.get(1); //왜 1번이지? 가져오는거 삭제는 아님,, 조건에따라
//        }
//    }

public Integer pop() {
    Integer returned_data, popped_idx, left_child_popped_idx, right_child_popped_idx; //뭔 인덱스번호가 4개여 ;

    if (this.heapArray == null) {
        return null;
    } else {
        returned_data = this.heapArray.get(1); //0번은 null
        this.heapArray.set(1, this.heapArray.get(this.heapArray.size() - 1));
        this.heapArray.remove(this.heapArray.size() - 1); //루트노드를 바꾼거라
        popped_idx = 1; //빼낸 인덱스번호가 1이라고 기억

        while (this.move_down(popped_idx)) {
            left_child_popped_idx = popped_idx * 2;
            right_child_popped_idx = popped_idx * 2 + 1;

            // CASE2: 오른쪽 자식 노드만 없을 때
            if (right_child_popped_idx >= this.heapArray.size()) {
                if (this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)) {
                    Collections.swap(this.heapArray, popped_idx, left_child_popped_idx);
                    popped_idx = left_child_popped_idx;
                }
                // CASE3: 왼쪽/오른쪽 자식 노드가 모두 있을 때
            } else {
                if (this.heapArray.get(left_child_popped_idx) > this.heapArray.get(right_child_popped_idx)) {
                    if (this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)) {
                        Collections.swap(this.heapArray, popped_idx, left_child_popped_idx);
                        popped_idx = left_child_popped_idx;
                    }
                } else {
                    if (this.heapArray.get(popped_idx) < this.heapArray.get(right_child_popped_idx)) {
                        Collections.swap(this.heapArray, popped_idx, right_child_popped_idx);
                        popped_idx = right_child_popped_idx;
                    }
                }
            }
        }

        return returned_data;
    }
}

    public boolean move_down(Integer popped_idx) {
        Integer left_child_popped_idx, right_child_popped_idx;

        left_child_popped_idx = popped_idx * 2;
        right_child_popped_idx = popped_idx * 2 + 1;

        // CASE1: 왼쪽 자식 노드도 없을 때 (자식 노드가 하나도 없을 때)
        if (left_child_popped_idx >= this.heapArray.size()) {
            return false;
            // CASE2: 오른쪽 자식 노드만 없을 때
        } else if (right_child_popped_idx >= this.heapArray.size()) {
            if (this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)) {
                return true; //--이때 swap
            } else {
                return false;
            }
            // CASE3: 왼쪽/오른쪽 자식 노드가 모두 있을 때
        } else {
            if (this.heapArray.get(left_child_popped_idx) > this.heapArray.get(right_child_popped_idx)) {
                if (this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (this.heapArray.get(popped_idx) < this.heapArray.get(right_child_popped_idx)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }


    public static void main(String[] args) {
//        fastcampus.Heap heapTest = new fastcampus.Heap(1);
//        System.out.println(heapTest.heapArray);
//
//        fastcampus.Heap heapTest1 = new fastcampus.Heap(1);
//        heapTest1.insert(2);
//        heapTest1.insert(3);
//        heapTest1.insert(4);
//        heapTest1.insert(5);
//        System.out.println(heapTest1.heapArray);
//
//        ArrayList<Integer> heapArray = new ArrayList<Integer>();
//        heapArray.add(1);
//        heapArray.add(2);
//        System.out.println(heapArray);
//        Collections.swap(heapArray, 0, 1);
//        System.out.println(heapArray);

//        fastcampus.Heap heapTest3 = new fastcampus.Heap(15);
//        heapTest3.insert(10);
//        heapTest3.insert(8);
//        heapTest3.insert(5);
//        heapTest3.insert(4);
//        heapTest3.insert(20);
//        System.out.println(heapTest3.heapArray);

        Heap heapTest = new Heap(15);
        heapTest.insert(10);
        heapTest.insert(8);
        heapTest.insert(5);
        heapTest.insert(4);
        heapTest.insert(20);
        System.out.println(heapTest.heapArray);

        heapTest.pop();
        System.out.println(heapTest.heapArray);
    }
}
