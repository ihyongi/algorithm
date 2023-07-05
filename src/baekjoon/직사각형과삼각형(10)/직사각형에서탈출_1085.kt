package baekjoon.`직사각형과삼각형(10)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고,
 * 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 */

    val ww = BufferedWriter(OutputStreamWriter(System.out))
    val( x, y, w, h) = readLine().split(" ").map(String::toInt)
    var list = mutableListOf<Int>()
    list.add( x - 0)
    list.add( y - 0)
    list.add( w - x)
    list.add( h - y)
    ww.write("${list.min()}")
    ww.flush()
    ww.close()
    close()
}