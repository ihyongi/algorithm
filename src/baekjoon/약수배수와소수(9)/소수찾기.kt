package baekjoon.`약수배수와소수(9)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt() //거의뭐 의미없음
    val input = readLine().split(" ").map(String::toInt)
    var result = 0
    for (i in input) {
        val list = mutableListOf<Int>()
        for (j in 1.. i){
            if(i % j == 0) {
                list.add(i)
            }
        }
        if(list.size == 2) result ++
    }
    w.write("$result")
    w.flush()
    w.close()
    close()
}