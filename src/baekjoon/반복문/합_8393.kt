package baekjoon.반복문

import java.util.*

fun main() = with(Scanner(System.`in`)) {
/**
 *n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * IntRange를 사용!!
 */

    val sum = (1..nextInt()).sum()
    println(sum)
}