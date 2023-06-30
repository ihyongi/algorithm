package baekjoon.일차원배열

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val array = IntArray(9)

    for (i in 0 until 9) {
        array[i] = readLine().toInt()
    }

    w.write("${array.max()}\n${array.indexOf(array.max())+1}")
    w.flush()
    w.close()
    close()
}