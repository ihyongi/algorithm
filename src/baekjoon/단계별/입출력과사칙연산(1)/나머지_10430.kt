package baekjoon.단계별.`입출력과사칙연산(1)`

import java.util.Scanner


fun main() {
    /**
     * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
     * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
     * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
     */
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println((a+b)%c)
    println(((a%c) + (b%c))%c)
    println((a*b)%c)
    println(((a%c) * (b%c))%c)
}

