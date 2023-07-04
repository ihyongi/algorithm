package baekjoon.`일반수학1(8)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 왜 bigInteger여..?
 * 무한대로 정수계산을 가능하게 하기떄문이라고 한다 ㅇㅇ... 지금 알았음둥
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = readLine().split(" ").map(String::toBigInteger)
    w.write("${a+b}")
    w.flush()
    w.close()
    close()
}