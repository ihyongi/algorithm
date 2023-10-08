package fastcampus.class01.sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort_14 {
    /**
     * 1. for (int index = 0; index < dataList.size() - 1; index++) 반복
     * 2. swap = false (교환이 되었는지를 확인하는 변수를 두자)
     * 2. 반복문안의 반복문으로 n - 1번 반복하며,
     * 3. 반복문안의 반복문 안에서, if (dataList.get(index2) > dataList.get(index2 + 1)) 이면
     * 4. 데이터를 스왑하고, Collections.swap(dataList, index2, index2 + 1);
     * 5. 스왑했음을 체크하기 위해, swap 을 true 로 놓고,
     * 6. 반복문안의 반복문을 수행 후에도 swap 이 false 이면, 전체 반복을 멈춤 (break)
     */
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int index = 0; index < dataList.size() - 1; index++) {
            boolean swap = false;

            //안에서 값 비교
            for (int index2 = 0; index2 < dataList.size() - 1 - index; index2++) {
                if (dataList.get(index2) > dataList.get(index2 + 1)) {
                    Collections.swap(dataList, index2, index2 + 1);
                    swap = true; //한번이라도 자리바꿈했는가
                }
            }

            if (swap == false) {
                break;
            }
        }

        return dataList;
    }

    public static void main(String[] args) {
        /**
         * 데이터가 두 개 일때 버블 정렬 알고리즘
         */
//        ArrayList<Integer> dataList = new ArrayList<Integer>();
//        dataList.add(4);
//        dataList.add(2);
//
//        if (dataList.get(0) > dataList.get(1)) {
//                Collections.swap(dataList, 0, 1);
//            }
//        System.out.println(dataList);

        /**
         * 데이터가 세 개 일때 버블 정렬 알고리즘
         */
//        ArrayList<Integer> dataList = new ArrayList<Integer>();
//        dataList.add(9);
//        dataList.add(2);
//        dataList.add(4);
//
//        for (int index = 0; index < dataList.size() - 1; index++) {
//            if (dataList.get(index) > dataList.get(index + 1)) {
//                Collections.swap(dataList, index, index + 1);
//            }
//        }
//        System.out.println(dataList);

        /**
         * 테스트 --O(n2)
         */
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        BubbleSort_14 bSort = new BubbleSort_14();
        bSort.sort(testData);
        System.out.println("bSort = " + bSort.sort(testData));
    }

}
