package fastcampus.class02.ch04완전탐색;

import java.util.Scanner;
class Main_10448 {
    static boolean[] isEurekaNumber = new boolean[1001];
    //전처리를 이용한 시간복잡도 단축
    public static void preprocess() {
        //1. k보다 작은 삼각수를 모두 구한다
        int[] triangleNumbers = new int[50];
        int triangleNumberCount = getTriangleNumbers(triangleNumbers);

        //2. 구해진 삼각수 세개의 합으로 k를 나타낼 수 있는지 확인한다.
        boolean[] isSumOfNum = new boolean[1000];
        for (int i = 0; i < triangleNumberCount; i++) {
            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = triangleNumbers[i] + triangleNumbers[j];
                if(sum < 1000) isSumOfNum[sum] = true;
            }
        }

        for (int i = 1; i < 1000; i++) {
            if(!isSumOfNum[i]) continue;
            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = i + triangleNumbers[j];
                if (sum <= 1000) isEurekaNumber[sum] = true;
            }
        }
    }

    public static void main(String[] args) {
        preprocess();
        //[3,1000]
        //isEurekaNumber[]

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int k = sc.nextInt();
            System.out.println(isEurekaNumber[k] ? "1" : "0");
        }
    }

    //모든삼각수 구하기
    public static int getTriangleNumbers(int[] triangleNumbers) {
        int triangleNumberCount = 0;
        for (int i = 1; ; i++) {
            int triangleNumber = i * (i+1) /2;
            if (triangleNumber > 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }
        return triangleNumberCount;
    }

    //삼각수에서 유레카넘버인지아닌지 판단
//    public static boolean isEurekaNumber(int[] triangleNumbers, int triangleNumberCount, int k) {
//        for (int i = 0; i < triangleNumberCount; i++) {
//            for (int j = 0; j < triangleNumberCount; j++) {
//                for (int l = 0; l < triangleNumberCount; l++) {
//                    int sum = triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[l];
//                    if(sum == k) return true;
//                }
//            }
//        }
//        return false;
//    }
}
