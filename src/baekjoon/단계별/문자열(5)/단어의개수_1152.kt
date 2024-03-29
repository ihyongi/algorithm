package baekjoon.단계별.`문자열(5)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val strings = readLine().split(" ").filter {  it.isNotEmpty() }
    w.write("${strings.size}")
    w.flush()
    w.close()
    close()
}
