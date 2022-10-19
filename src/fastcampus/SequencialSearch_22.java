package fastcampus;

import java.util.ArrayList;

public class SequencialSearch_22 {
    public int searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        for (int index = 0; index < dataList.size(); index++) {
            if (dataList.get(index) == searchItem) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random() * 100));
        }

        SequencialSearch_22 sSearch = new SequencialSearch_22();
        sSearch.searchFunc(testData, 99);
    }
}
