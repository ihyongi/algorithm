package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    /**
     * 1. for (int stand = 0; stand < dataList.size() - 1; stand++) 로 반복
     * 2. lowest = stand 로 놓고,
     * 3. for (int index = stand + 1; index < dataList.size(); index++) 로, stand 이후부터 반복
     *    - 내부 반복문 안에서 dataList[lowest] > dataList[index] 이면,
     *      - lowest = num
     * 4. dataList[lowest] 와 dataList[index] 스왑
     */
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lowest; //해당 인덱스번호
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand; //가장작다고 가정하고
            for (int index = stand + 1; index < dataList.size(); index++) { //그다음값부터 비교시작
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }

    public static void main(String[] args) {
        /**
         * 테스트
         */
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        SelectionSort sSort = new SelectionSort();
        System.out.println("sSort = " + sSort.sort(testData));
    }
}
