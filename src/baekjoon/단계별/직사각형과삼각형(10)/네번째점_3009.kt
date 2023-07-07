package baekjoon.단계별.`직사각형과삼각형(10)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var xList = mutableListOf<Int>()
    var yList = mutableListOf<Int>()
    val (x1, y1) = readLine().split(" ").map(String::toInt)
    xList.add(x1)
    yList.add(y1)
    val (x2, y2) = readLine().split(" ").map(String::toInt)
    xList.add(x2)
    yList.add(y2)
    val (x3, y3) = readLine().split(" ").map(String::toInt)
    xList.add(x3)
    yList.add(y3)

    val xGroupBy = xList.groupBy { it }.filter { it.value.size == 1 }.map { it.key }[0]
    val yGroupBy = yList.groupBy { it }.filter { it.value.size == 1 }.map { it.key }[0]
    w.write("$xGroupBy $yGroupBy")
    w.flush()
    w.close()
    close()
}