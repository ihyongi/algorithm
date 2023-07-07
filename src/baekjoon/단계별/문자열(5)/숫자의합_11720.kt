package baekjoon.단계별.`문자열(5)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 *
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val num = readLine().toInt()
    val list = readLine().map { it.toString().toInt() }.toIntArray()

    w.write("${ list.sum()}")
    w.flush()
    w.close()
    close()
}