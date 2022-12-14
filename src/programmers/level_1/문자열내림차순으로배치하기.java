package programmers.level_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문자열내림차순으로배치하기 {
    /**
     * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
     * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
     *
     * 제한 사항
     * str은 길이 1 이상인 문자열입니다.
     */

    class Solution {
        public String solution(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder(new String(chars));
            return sb.reverse().toString();
        }

        public String solution2(String s) {
            return Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        }
    }
}
