package baekjoon.`일반수학1(8)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (n , b) = readLine().split(" ").map(String::toInt)
    var result = ""

    while (n > 0){
        if (n % b < 10) {
            result += ((n % b + '0'.code).toChar())
        } else {
            result += ((n % b - 10 + 'A'.code).toChar())
        }
        n /= b
    }

    w.write("${result.reversed()}") //아 거꾸로 넣어야하는구나 맞네 ;
    w.flush()
    w.close()
    close()
}