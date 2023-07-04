package baekjoon.`이차원배열(7)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 * 아니 왜이렇게 어려워...
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    //첫줄에 행렬크기 입력받자 -- 3*3
    val (n, m) = readLine().split(" ").map(String::toInt)
    var arr = Array(n) { IntArray(m)}
    for(i in 0 until n){
        val row = readLine()!!.split(" ").map(String::toInt).toTypedArray() //입력받은값 ..
        for(j in 0 until m){
            arr[i][j] = row[j]
        }
    }
    //기존값에 더하기
    for(i in 0 until n){
        val row = readLine()!!.split(" ").map(String::toInt).toTypedArray()
        for(j in 0 until m){
            arr[i][j] += row[j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            w.write("${arr[i][j]} ")
        }
        w.write("\n")
    }
    w.flush()
    w.close()
    close()
}