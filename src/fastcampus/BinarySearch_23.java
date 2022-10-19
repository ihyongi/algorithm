package fastcampus;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch_23 {
    /**
     * 분할정복 알고리즘..? 이진탐색..
     *
     이진 탐색은 데이터가 정렬되있는 상태에서 진행
     * 데이터가 {2, 3, 8, 12, 20} 일 때,
     - searchFunc(data_list, find_data) 함수를 만들고
     - searchItem 찾는 숫자
     - dataList는 데이터 배열
     - dataList의 중간에 위치한 값을 searchItem 비교해서
     - searchItem < dataList 중간값 이라면
     - 맨 앞부터 data_list의 중간까지 에서 다시 searchItem 찾기
     - dataList의 중간값 < searchItem 이라면
     - dataList의 중간부터 맨 끝까지에서 다시 searchItem 찾기
     - 그렇지 않다면, data_list의 중간값은 searchItem 인 경우로, return dataList 중간위치
     */

    public boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        if (dataList.size() == 1 && searchItem == dataList.get(0)) return true;
        if (dataList.size() == 1 && searchItem != dataList.get(0)) return false;
        if (dataList.size() == 0) return false;

        int medium = dataList.size() / 2;
        if (searchItem == dataList.get(medium)) {
            return true;
        } else {
            if (searchItem < dataList.get(medium)) return this.searchFunc(new ArrayList<>(dataList.subList(0, medium)), searchItem);
             else return this.searchFunc(new ArrayList<>(dataList.subList(medium, dataList.size())), searchItem);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }
        Collections.sort(testData);
        System.out.println(testData);

        BinarySearch_23 bSearch = new BinarySearch_23();
        bSearch.searchFunc(testData, 2);
    }
}
