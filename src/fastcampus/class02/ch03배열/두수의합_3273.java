package fastcampus.class02.ch03배열;

import java.io.*;
import java.util.Arrays;

/**
 * 오.. 너무 어렵고용?
 */
class Main_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());
        boolean[] exist = new boolean[1000001];
        for (int i = 0; i < n; i++) {
            exist[a[i]] = true;
        }
        int ans = 0;
        for (int i = 1; i <= (x - 1)/2 ; i++){
            if(i <= 1000000 && x-i <= 1000000){
                ans += exist[i] && exist[x-i] ? 1 : 0;
            }
        }

        bw.write(ans+"\n");
        bw.flush();
    }
}
