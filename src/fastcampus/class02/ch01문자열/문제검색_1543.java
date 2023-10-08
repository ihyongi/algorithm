package fastcampus.class02.ch01문자열;

import java.util.Scanner;

/**
 * 세준이는 영어로만 이루어진 어떤 문서를 검색하는 함수를 만들려고 한다.
 * 이 함수는 어떤 단어가 총 몇 번 등장하는지 세려고 한다.
 * 그러나, 세준이의 함수는 중복되어 세는 것은 빼고 세야 한다.
 * 예를 들어, 문서가 abababa이고, 그리고 찾으려는 단어가 ababa라면,
 * 세준이의 이 함수는 이 단어를 0번부터 찾을 수 있고, 2번부터도 찾을 수 있다. 그러나 동시에 셀 수는 없다.
 *
 * 세준이는 문서와 검색하려는 단어가 주어졌을 때,
 * 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램을 작성하시오.
 *
 * 풀이
 * 주어진 단어가 문서에 등장하는 횟수
 */
class Main_1543 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //next()는 공백을 만나면 멈춘다. nextLine()는 공백포함
//        String doc = sc.nextLine(); //문서
//        String word = sc.nextLine(); //단어
//
//        int count = 0;
//        int startIdx = 0;
//        while (true){
//            int findIdx = doc.indexOf(word, startIdx); //찾고자하는 단어, index
//            if (findIdx < 0) break;
//            count++;
//            startIdx = findIdx + word.length();
//        }
//        System.out.println(count);
//    }

    //풀이 2 replace사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //next()는 공백을 만나면 멈춘다. nextLine()는 공백포함
        String doc = sc.nextLine(); //문서
        String word = sc.nextLine(); //단어

        String replaced = doc.replace(word, "");
        int length = doc.length() - replaced.length();
        int count = length / word.length();
        System.out.println(count);
    }
}
