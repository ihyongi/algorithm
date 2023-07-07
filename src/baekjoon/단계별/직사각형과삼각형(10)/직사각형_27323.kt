package baekjoon.단계별.`직사각형과삼각형(10)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().toInt()
    val b = readLine().toInt()
    w.write("${a*b}")
    w.flush()
    w.close()
    close()
}