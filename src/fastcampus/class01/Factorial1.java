package fastcampus.class01;

import java.util.ArrayList;

public class Factorial1 {
    /**
     * 재귀용법 -- 220928
     */
    //일반적인 형태1
    public int factorialFunc1(int n) {
        if (n > 1) {
            return n * this.factorialFunc1(n - 1); // n * (n-1)!
        } else {
            return 1;
        }
    }

    //일반적인 형태2
    public int factorialFunc2(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * this.factorialFunc2(n - 1);
        }
    }

    //연습문제 2
    /**
     * subList (from, to)
     * from부터 to까지 추출하겠다
     * 0~9까지의 합..?
     */
    public int factorialFunc3(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        }
        return dataList.get(0) + this.factorialFunc3(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

    /**
     * 힌트: 정수 n을 만들 수 있는 경우의 수를 리턴하는 함수를 f(n) 이라고 하면,
     * f(n)은 f(n-1) + f(n-2) + f(n-3) 과 동일하다는 패턴 찾기
     */
    public int factorialFunc4(int data) {
        if (data == 1) {
            return 1;
        } else if (data == 2) {
            return 2;
        } else if (data == 3) {
            return 4;
        }
        return this.factorialFunc4(data - 1) + this.factorialFunc4(data - 2) + this.factorialFunc4(data - 3);
    }

    public static void main(String[] args) {
        Factorial1 fObject = new Factorial1();
        System.out.println(fObject.factorialFunc1(5));

        Factorial1 fObject2 = new Factorial1();
        System.out.println(fObject2.factorialFunc2(5));


        ArrayList<Integer> testData = new ArrayList();
        for (int data = 0; data < 10; data++) {
            testData.add(data);
        }
        System.out.println(testData.subList(1, testData.size() - 1)); //배열
        System.out.println(fObject.factorialFunc3(testData)); //합계

        Factorial1 fObject4 = new Factorial1();
        System.out.println(fObject4.factorialFunc4(5)); //13 왜케 어려워 ;;

    }

    /**
     * 재귀호출은 스택의 전형적인 예 -- 스택처럼 관리된다
     */
}
