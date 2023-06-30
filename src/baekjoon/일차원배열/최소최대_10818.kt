package baekjoon.일차원배열

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt() // 맨첫줄
    val array = IntArray(n)

    StringTokenizer(readLine()).run {
        for (i in 0 until n) {
            array[i] = nextToken().toInt() // array에 순서대로 담기
        }
    }
    w.write("${array.min()} ${array.max()}")
    w.flush()
    w.close()
    close()
}