package inflearn.chapter1.문장속단어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     * 문장속의 각 단어는 공백으로 구분됩니다
     */
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        Arrays.stream(str).forEach(s -> {
            String string = new StringBuilder(s).reverse().toString();
            answer.add(string);
        });
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        for(String x : T.solution(str)){
            System.out.println(x);
        }
    }
}
