package baekjoon.`약수배수와소수(9)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var n = readLine().toInt()
    var cnt = 2
    while ( n > 1){
        if(n % cnt == 0) {
            w.write("$cnt\n")
            n /= cnt
        }else {
            cnt ++
        }
    }
    w.flush()
    w.close()
    close()
}