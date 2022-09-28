package programmers.level_1;

public class 자릿수더하기 {

    /**
     * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
     * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
     *
     * 1. N의 범위 : 100,000,000 이하의 자연수
     */

    public class Solution {
        public int solution(int n) {
            int answer = 0;
            String num = String.valueOf(n);
            char[] chars = num.toCharArray();
            for (char aChar : chars) {
                answer += Integer.parseInt(String.valueOf(aChar));
            }

            return answer;
        }
    }
}
