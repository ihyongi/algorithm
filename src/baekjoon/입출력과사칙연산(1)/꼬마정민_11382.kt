package baekjoon.`입출력과사칙연산(1)`

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    /**
     * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
     * 
     * nextInt => 입력받기
     * 10^12 최대값범위가 int가 넘는다..
     * int 범위가 머엿더라 ...
     */

    println(nextBigInteger() + nextBigInteger() + nextBigInteger())
}