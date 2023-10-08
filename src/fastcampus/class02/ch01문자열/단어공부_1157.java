package fastcampus.class02.ch01문자열;

import java.util.Scanner;

/**
 *알파벳 대소문자로 된 단어가 주어지면,
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 풀이
 * 문자열에서 가장많이 등장한 알파벳 찾는것
 * 1. 각각의 알파벳의 개수를 구한다
 * 2. 그 중 최댓값을 구한다.
 */
class Main_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); //여기엔 대문자만 생긴다
        //각각 알파벳 얼마나 들어가 있는지 개수
//        int[] count = getAlphavbetCnt(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        for (char alp = 'A'; alp < 'Z'; alp++) {
            int count = getAlphavbetCnt(str, alp);
            if(count > maxCount){
                maxCount = count;
                maxAlphabet = alp;
            } else if (count == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }

    private static int getAlphavbetCnt(String str, char alp) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(alp == str.charAt(i)) count ++;
        }
        return count;
    }
}
