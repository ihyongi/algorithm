package baekjoon.단계별.`문자열(5)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 단어 $S$와 정수 $i$가 주어졌을 때, $S$의 $i$번째 글자를 출력하는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val strings = readLine().split("")
    w.write("${strings[StringTokenizer(readLine()).nextToken().toInt()]}")

    w.flush()
    w.close()
    close()
}