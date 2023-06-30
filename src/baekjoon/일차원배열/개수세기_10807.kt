package baekjoon.일차원배열

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val inputNum = readln().toInt()
    val nums = readln().split(" ")
    val wantFindNum = readln().toInt()
    w.write("${nums.count { it.toInt() == wantFindNum }}")

    w.flush()
    w.close()
    close()
}