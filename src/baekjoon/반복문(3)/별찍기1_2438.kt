package baekjoon.`반복문(3)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     */
    var answer = ""
    val w = BufferedWriter(OutputStreamWriter(System.out))
    for (i in 1..readLine().toInt()){
        answer += "*"
        w.write(answer+"\n")
    }
    w.flush()
    w.close()
    close()
}