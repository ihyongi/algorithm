package fastcampus.class02.ch03배열;

import java.util.Scanner;

/**
 * 영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다.
 * 영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
 *
 * 성의 크기와 경비원이 어디있는지 주어졌을 때,
 * 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.
 */
class Main_1236 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        char[][] map = new char[N][M]; //char로 받아두는 편
//        for (int i = 0; i < N; i++) {
//            map[i] = sc.next().toCharArray();
//        }
//
//        //1. 각 행,열에 경비원이 있는지
//        int existRowCnt = 0;
//        for (int i = 0; i < N; i++) {
//            boolean exist = false;
//            for (int j = 0; j < M; j++) {
//                if (map[i][j] == 'X'){
//                    exist = true;
//                    break;
//                }
//            }
//            if (exist) existRowCnt ++;
//        }
//        int existColCnt = 0;
//        for (int i = 0; i < M; i++) {
//            boolean exist = false;
//            for (int j = 0; j < N; j++) {
//                if (map[i][j] == 'X'){
//                    exist = true;
//                    break;
//                }
//            }
//            if (exist) existColCnt ++;
//        }
//
//
//        //2. 보호받지 못하는 행/열의 개수
//        int needRowCnt = N- existRowCnt;
//        int needColCnt = M- existColCnt;
//        //3. 둘중 큰 값을 출력한다.
//        System.out.println(Math.max(needColCnt,needRowCnt));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M]; //char로 받아두는 편
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }

        //1. 각 행,열에 경비원이 있는지
        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];

        for (int i = 0; i <N; i++) {
            for (int j = 0; j <M; j++) {
                if(map[i][j] == 'X'){
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }

        //2. 보호받지 못하는 행/열의 개수
        int needRowCnt = N;
        int needColCnt = M;
        for (int i = 0; i < N; i++) {
            if (existRow[i]) needRowCnt --;
        }
        for (int i = 0; i < M; i++) {
            if (existCol[i]) needColCnt --;
        }
        //3. 둘중 큰 값을 출력한다.
        System.out.println(Math.max(needColCnt,needRowCnt));
    }
}
