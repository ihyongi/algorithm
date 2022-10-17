package programmers.level_1;

public class 핸드폰번호가리기 {
    class Solution {
        public String solution(String phone_number) {
            char[] array = phone_number.toCharArray();
            for(int i =0 ; i <array.length - 4; i++){
                array[i] = '*';
            }
            return String.valueOf(array);
        }
    }
}
