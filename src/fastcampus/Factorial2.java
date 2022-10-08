package fastcampus;

public class Factorial2 {
    /**
     * 재귀용법을 이용
     */
        public int factorialFunc(int data) {
            if (data <= 1) {
                return data;
            }
            return this.factorialFunc(data - 1) + this.factorialFunc(data - 2);
        }

    /**
     * 동적계획밥을 이용
     * 시간복잡도에 굿
     * 공간복잡도 희생
     */
        public int dynamicFunc(int data) {
            Integer[] cache = new Integer[data + 1];
            cache[0] = 0;
            cache[1] = 1;
            for (int index = 2; index < data + 1; index++) {
                cache[index] = cache[index - 1] + cache[index - 2];
            }
            return cache[data];
        }

    /**
     *
     *분할정복알고리즘 -- 병합정렬, 퀵정렬
     */

    public static void main(String[] args) {
        Factorial2 fObject = new Factorial2();
        fObject.factorialFunc(10);

        Factorial2 dObject = new Factorial2();
        dObject.dynamicFunc(10);
    }
}
