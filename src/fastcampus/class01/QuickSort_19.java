package fastcampus.class01;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_19 {
//    public void splitFunc(ArrayList<Integer> dataList) {
//        if (dataList.size() <= 1) {
//            return ;
//        }
//        int pivot = dataList.get(0);
//
//        ArrayList<Integer> leftArr = new ArrayList<Integer>();
//        ArrayList<Integer> rightArr = new ArrayList<Integer>();
//
//        for (int index = 1; index < dataList.size(); index++) {
//            if (dataList.get(index) > pivot) {
//                rightArr.add(dataList.get(index));
//            } else {
//                leftArr.add(dataList.get(index));
//            }
//        }
//
//        System.out.println(leftArr);
//        System.out.println(pivot);
//        System.out.println(rightArr);
//    }

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for (int index = 1; index < dataList.size(); index++) {
            if (dataList.get(index) > pivot) {
                rightArr.add(dataList.get(index));
            } else {
                leftArr.add(dataList.get(index));
            }
        }

        /** 추가 */
        ArrayList<Integer> mergedArr = new ArrayList<>();
        mergedArr.addAll(this.sort(leftArr)); //재귀용법
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.sort(rightArr)); //재귀용법

        return mergedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }

        QuickSort_19 qSort = new QuickSort_19();
        System.out.println("qSort = " + qSort.sort(testData));
    }
}
