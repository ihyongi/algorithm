package fastcampus.class02.ch03배열;

import java.io.*;

/**
 * 빠른 bufferedReader/Writer
 */
class Main_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        while (i-- >0){
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            bw.write(a+b+ "\n");
        }
        bw.flush(); //필
    }
}
