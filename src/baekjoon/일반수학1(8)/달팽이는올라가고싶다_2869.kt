package baekjoon.`일반수학1(8)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오
 *
 *
 * if((V - A) % (A - B) == 0) (V - A) / (A - B) + 1 else (V - A) / (A - B) + 2
 * 심지어 얘도 어려움둥,,,
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b, v) = readLine().split(" ").map(String::toInt)
    if((v-a) % (a-b) == 0) w.write("${(v-a) / (a-b) + 1}") else w.write("${(v-a) / (a-b) + 2}")
    w.flush()
    w.close()
    close()
}