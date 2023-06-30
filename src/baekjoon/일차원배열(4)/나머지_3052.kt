package baekjoon.`일차원배열(4)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val baskets = IntArray(10)

    for(i in 0..9){
        val st = StringTokenizer(readLine())
        baskets[i] = st.nextToken().toInt()
    }
    val size = baskets.map { it % 42 }.distinct().size
    w.write("$size")
    w.flush()
    w.close()
    close()
}