package fastcampus.sort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort_16 {
    /**
     * 1. for (int index = 0; index < dataList.size() - 1; index++) 로 반복
     * 2. 반복문 안에서, for (int index2 = index + 1; index2 > 0; index2--) 으로 반복
     *    - 내부 반복문 안에서 if (dataList.get(index2) < dataList.get(index2 - 1)) 이면, 스왑
     */
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int index = 0; index < dataList.size() - 1; index++) {
            for (int index2 = index + 1; index2 > 0; index2--) { //중요
                if (dataList.get(index2) < dataList.get(index2 - 1)) {
                    Collections.swap(dataList, index2, index2 - 1);
                } else {
                    break;
                }
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        InsertionSort_16 iSort = new InsertionSort_16();
        iSort.sort(testData);
        System.out.println("iSort = " + iSort.sort(testData));
    }
}
