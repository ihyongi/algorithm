package baekjoon.단계별.`약수배수와소수(9)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val min = -1
    val m = readLine().toInt()
    val n = readLine().toInt()
    var result = mutableListOf<Int>()
    for(i in m..n){
        var list = mutableListOf<Int>()
        for(j in 1..i){
            if(i % j == 0) {
                list.add(i)
            }
        }
         list = list.groupBy { it }.filter { it.value.size == 2 }.map { it.key }.toMutableList()
         if(list.size != 0) result.add(list[0])
    }
    if(result.size != 0) w.write("${result.sum()}\n${result.min()}")
    else w.write("$min")
    w.flush()
    w.close()
    close()
}