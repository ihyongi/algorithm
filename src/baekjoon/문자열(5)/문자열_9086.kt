package baekjoon.`문자열(5)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.log

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 *
 * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
 * 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
 * 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val toInt = StringTokenizer(readLine()).nextToken().toInt()
    for (i in 0 until toInt){
        val string = readLine().toList()
        w.write("${string[0]}${string[string.lastIndex]}\n")
    }
    w.flush()
    w.close()
    close()
}