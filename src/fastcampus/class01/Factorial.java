package fastcampus.class01;

public class Factorial {
    /**
     * O(1)
     */
    public int factorialFunc1(int n) {
        int fac = 1;
        for (int index = 2; index < n + 1; index++) {
            fac = fac * index;
        }
        return fac;
    }

    /**
     * 재귀함수 사용 , O(n)
     */
    public int factorialFunc2(int n) {
        if (n > 1) {
            return n * factorialFunc2(n - 1);
        } else {
            return 1;
        }
    }
}
