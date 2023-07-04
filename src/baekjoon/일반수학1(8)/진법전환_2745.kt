package baekjoon.`일반수학1(8)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 *
 * ZZZZZ 36
 * (35*36^4)+(35*36^3)+(35*36^2)+(35*36)+(35*1)
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n , b) = readLine().split(" ")
    var result = 0

    for (i in n.indices){
        result = if (n[i] in '0'..'9') { //char
            result * b.toInt() + (n[i] - '0')
        } else {
            result * b.toInt() + (n[i] - 'A' + 10)
        }
    }
    w.write("$result")
    w.flush()
    w.close()
    close()
}