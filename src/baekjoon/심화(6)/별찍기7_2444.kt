package baekjoon.`심화(6)`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 너무 어렵다...........................
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * 흠..........
 *
 */

    val n = readLine().toInt()
    /**
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     */
    for (i in 1..n) println("${" ".repeat(n-i) + "*".repeat(2*i-1)}")

    /**
     *  *******
     *   *****
     *    ***
     *     *
     */
    for (i in n-1 downTo 1) println("${" ".repeat(n-i) + "*".repeat(2*i-1)}")
}