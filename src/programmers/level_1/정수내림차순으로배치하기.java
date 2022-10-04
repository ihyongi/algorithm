package programmers.level_1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    /**
     * 함수 solution은 정수 n을 매개변수로 입력받습니다.
     * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
     * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
     */
    class Solution {
        public long solution(long n) {
            long answer = 0;
            char[] array = String.valueOf(n).toCharArray();
            Arrays.sort(array);

            String s = new StringBuilder(new String(array)).reverse().toString();
            answer =  Long.parseLong(s); //거꾸로
            return answer;
        }

    }
}
