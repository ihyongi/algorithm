package fastcampus.class02.ch02시간복잡도;

import java.util.Scanner;

class Main_10158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //next()는 공백을 만나면 멈춘다. nextLine()는 공백포함
        int W = sc.nextInt(); //크기1
        int H = sc.nextInt(); //크기2
        int P = sc.nextInt(); //초기위치
        int Q = sc.nextInt(); //초기위치
        int T = sc.nextInt(); //시간

        int timeX = T % (2 * W);
        int currentX = P;
        int deltaX = 1;
        while (timeX -- >0){
            if(currentX == W) deltaX =-1;
            else if(currentX == 0)deltaX =1;
            currentX += deltaX;
        }

        int timeY = T % (2 * H);
        int currentY = Q;
        int deltaY =1;
        while (timeY -- >0){
            if(currentY == H) deltaY =-1;
            else if(currentY == 0)deltaY =1;
            currentY += deltaY;
        }


    }
}
