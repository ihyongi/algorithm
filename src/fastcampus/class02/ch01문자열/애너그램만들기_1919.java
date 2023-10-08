package fastcampus.class02.ch01문자열;

import java.util.Scanner;

/**
 * 두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때, 그러한 두 단어를 서로 애너그램 관계에 있다고 한다.
 * 예를 들면 occurs 라는 영어 단어와 succor 는 서로 애너그램 관계에 있는데,
 * occurs의 각 문자들의 순서를 잘 바꾸면 succor이 되기 때문이다.
 * 한 편, dared와 bread는 서로 애너그램 관계에 있지 않다.
 * 하지만 dared에서 맨 앞의 d를 제거하고, bread에서 제일 앞의 b를 제거하면,
 * ared와 read라는 서로 애너그램 관계에 있는 단어가 남게 된다.
 *
 * 두 개의 영어 단어가 주어졌을 때, 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서
 * 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램을 작성하시오.
 * 문자를 제거할 때에는 아무 위치에 있는 문자든지 제거할 수 있다.
 *
 * ??????몽테소리
 * 애너그램 = 단어의 구성(알파벳과 그 개수)이 완전히 같은 단어
 * 철자의 순서를 뒤바꿔서 같게 만들 수 있따.
 *
 * 1. 어떤문자가 제거되어야하는가 - 공통문자를 제외한 전부
 *
 */
class Main_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        /**
         * 각각의 문자 알파벳 개수 세기,,, 알파벳은 26개
         * count 배열..??
         * 알파벳 인덱싱하면서 각각의 개수를 세는 배열
         */
        int[] countA = getAlphabetCnt(a);
        int[] countB = getAlphabetCnt(b);

        /**
         * 모든 알파벳들에 대해서 개수가 맞지않으면 카운트 +1
         */
        int ans =0;
        for(int i =0 ; i < 26 ; i ++) {
            //Math.abs -- 절대값 구하기.. ? 모지..........돌대구리력 on!! 오 이해완!
//            if(countA[i] > countB[i]){
//                ans += countA[i] - countB[i];
//            } else if(countB[i] > countA[i]) {
//                ans += countB[i] - countA[i];
//            }
            ans += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(ans);
    }

    //중복코드 메서드 분리
    public static int[] getAlphabetCnt(String str) {
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i ++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
}
