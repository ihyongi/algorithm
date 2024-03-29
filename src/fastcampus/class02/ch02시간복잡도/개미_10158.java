package fastcampus.class02.ch02시간복잡도;

import java.io.*;
import java.util.Scanner;

class Main_10158 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //next()는 공백을 만나면 멈춘다. nextLine()는 공백포함
//        int W = sc.nextInt(); //크기1
//        int H = sc.nextInt(); //크기2
//        int P = sc.nextInt(); //초기위치
//        int Q = sc.nextInt(); //초기위치
//        int T = sc.nextInt(); //시간

        //풀이 1 O(max(W,H))
//        int timeX = T % (2 * W);
//        int currentX = P;
//        int deltaX = 1;
//        while (timeX -- >0){
//            if(currentX == W) deltaX =-1;
//            else if(currentX == 0)deltaX =1;
//            currentX += deltaX;
//        }
//
//        int timeY = T % (2 * H);
//        int currentY = Q;
//        int deltaY =1;
//        while (timeY -- >0){
//            if(currentY == H) deltaY =-1;
//            else if(currentY == 0)deltaY =1;
//            currentY += deltaY;
//        }

        //풀이 2 O(1)
//        int currentX = (T + P) % (2 * W);
//        int currentY = (T + Q) % (2 * H);
//        if (currentX > W) currentX = 2 * W - currentX;
//        if (currentY > H) currentY = 2 * H - currentY;
//
//        System.out.println(currentX + " " + currentY);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int W = Integer.parseInt(br.readLine());
        int H = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        int Q = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        // 계산
        int currentX = (T + P) % (2 * W);
        int currentY = (T + Q) % (2 * H);
        if (currentX > W) currentX = 2 * W - currentX;
        if (currentY > H) currentY = 2 * H - currentY;

        // 출력
        bw.write(currentX + " " + currentY + "\n");

        // 닫기
        br.close();
        bw.close();
    }
}
