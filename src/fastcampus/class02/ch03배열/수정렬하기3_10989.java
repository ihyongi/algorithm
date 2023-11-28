package fastcampus.class02.ch03배열;

import java.io.*;

/**
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
 * 이 수는 10,000보다 작거나 같은 자연수이다.
 * 오름차순으로 정렬
 *
 * 수행시간 5초
 * 입/출력시간 측정
 * scanner와 syso계열 느리다
 *
 * 100만단위에선
 * BufferedReader
 * BufferedWriter사용!!
 */
class Main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //풀이1.. 시간초과
        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001]; //수의범위만큼
        for (int i = 0; i < n; i++) {
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (cnt[i]-- > 0){
                bw.write(i+"\n");
            }
            bw.flush();
        }
    }
}
