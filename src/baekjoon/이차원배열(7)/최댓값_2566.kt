package baekjoon.`이차원배열(7)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val arr = Array(9) { IntArray(9) }
    var max = 0
    var row = 0
    var col = 0
    for(i in 0 until 9){
        val line = readLine()!!.split(" ").map(String::toInt).toTypedArray()
        for(j in 0 until 9){
            arr[i][j] = line[j]
            if(arr[i][j] > max){
                max = arr[i][j]
                row = i
                col = j
            }
        }
    }
    w.write("${max}\n${row+1} ${col+1}")
    w.flush()
    w.close()
    close()
}