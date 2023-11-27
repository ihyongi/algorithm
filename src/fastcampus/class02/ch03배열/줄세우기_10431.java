package fastcampus.class02.ch03배열;

import java.util.Scanner;

/**
 * 입력으로 주어진 순서대로 규칙에 따라 줄을 설 때 각 학생들이 뒤로 물러난
 * 걸음 수의 총합
 *
 * 1. 자신보다 먼저 줄 선학생중 자기보다 키큰학생이 있는지
 * 1.1 자신보다 큰 학생이없으면 가장 맨뒤에 선다
 * 2. 자신보다 큰 학생중 가장 앞에있는 학생(A) 앞에 선다.
 * 3. A와 A뒤의 모든 학생들은 공간을 만들기 위해 한발자국씩 뒤로 선다
 */
class Main_10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        while (p-- > 0){
            int t = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = sc.nextInt();
            }

            int cnt = 0 ;//물러난 횟수
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                //1. 줄서있는 학생중에 자신보다 큰 학생
                //1.1 찾지못하면 그 줄 가장 뒤
                boolean find = false;
                for (int j = 0; j < i; j++) {
                    if(sorted[j] > h[i]) {
                        //2. 찾으면 그 학생 앞에 선다.
                        //3. 그 학생과 그 뒤에 학생이 모두 한칸씩 물러난다.
                        find = true;
                        for (int k = i-1; k >= j; k--) {
                            sorted[k+1] = sorted[k];
                            cnt ++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                }
                if(!find) {
                    sorted[i] = h[i];
                }
            }
            System.out.println(t + " " + cnt);
        }
    }
}
//아니 넘모 어렵자나..