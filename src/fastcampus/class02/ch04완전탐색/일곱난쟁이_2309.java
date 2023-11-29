package fastcampus.class02.ch04완전탐색;

import java.util.Arrays;
import java.util.Scanner;

class Main_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[9];
        for (int i = 0; i <9; i++) {
            h[i] = sc.nextInt();
        }
        // 9명 중 7명의 키의 합이 100이 되는 경우 찾기
        findAndPrintDwarfs(h);
    }

    private static void findAndPrintDwarfs(int[] heights) {
        Arrays.sort(heights); // 키를 오름차순으로 정렬
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int[] selectedDwarfs = getSelectedDwarfs(heights, i, j);
                if (calculateSum(selectedDwarfs) == 100) {
                    printDwarfs(selectedDwarfs);
                    return;
                }
            }
        }
    }

    private static int[] getSelectedDwarfs(int[] heights, int excludeIndex1, int excludeIndex2) {
        int[] selectedDwarfs = new int[7];
        int index = 0;

        for (int k = 0; k < 9; k++) {
            if (k != excludeIndex1 && k != excludeIndex2) {
                selectedDwarfs[index++] = heights[k];
            }
        }
        return selectedDwarfs;
    }

    private static int calculateSum(int[] dwarfs) {
        return Arrays.stream(dwarfs).sum();
    }

    private static void printDwarfs(int[] dwarfs) {
        Arrays.stream(dwarfs).forEach(System.out::println);
    }

}
