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
        findDwarfs(h);
    }

    private static void findDwarfs(int[] heights) {
        Arrays.sort(heights); // 키를 오름차순으로 정렬

        // 9명 중 7명의 키의 합이 100이 되는 경우 찾기
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int sum = 0;
                for (int k = 0; k < 9; k++) {
                    if (k != i && k != j) {
                        sum += heights[k];
                    }
                }

                if (sum == 100) {
                    // 출력
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(heights[k]);
                        }
                    }
                    return;
                }
            }
        }
    }

}
