package fastcampus.class02.ch01문자열;

import java.util.Scanner;

/**
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
 * 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 *
 * 생각해보기
 * 1. 각문자가 소문자인지 대문자인지 어케앎?
 * 2. 문자가 주어졌을때 어케 반대로 바꿀꺼?
 *
 * 선생님은 ascii code를 이용함
 * (char) 잊지말자!!!!
 *
 * 예제
 * WrongAnswer
 */
class Main_2744 {
    //1.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        for (int i =0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            //대문자인가?
//            if('A' <= ch && ch <= 'Z'){
////                System.out.print(ch - 'A'); //몇번째 알파벳인지 알 수 있다.
////                System.out.print('a' + ch - 'A'); //이 전체는 정수값이다
//                System.out.print((char)('a' + ch - 'A')); //이 전체는 이제 소문자로 출력된다
//            }
//            else System.out.print((char)('A' + ch - 'a'));
//        }
//    }

    //2.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();
        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //대문자인가?
            if('A' <= ch && ch <= 'Z'){
//                System.out.print(ch - 'A'); //몇번째 알파벳인지 알 수 있다.
//                System.out.print('a' + ch - 'A'); //이 전체는 정수값이다
                ans[i] = (char)('a' + ch - 'A'); //이 전체는 이제 소문자로 출력된다
            }
            else ans[i] = (char)('A' + ch - 'a');
        }
        System.out.println(ans);
    }


}
