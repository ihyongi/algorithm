package programmers.level_1;

public class 정수제곱근판별 {
    /**
     * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
     * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
     *
     * 1. n은 1이상, 50000000000000 이하인 양의 정수입니다.
     */
    class Solution {
        public long solution(long n) {
            long answer = 0;

            Double sqrt = Math.sqrt(n);// 제곱근
            if(sqrt == sqrt.intValue()){
                answer = (long) Math.pow((sqrt+1), 2); //제곱해라
            }else {
                answer =  -1;
            }
            return answer;
        }
    }
}
