package baekjoon.단계별.`약수배수와소수(9)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
 * 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
 * n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var result: String
    while (true){
        val list = mutableListOf<Int>()
        var n = readLine().toInt()
        if(n == -1) break
        else{
            for(i in 1..n){
              if(n % i == 0) list.add(i)
            }

            val filter = list.filter { it != n }
            if(filter.sum() == n) result = "${n} = ${filter.joinToString(" + ")}"
            else result = "${n} is NOT perfect."
        }
        w.write("$result\n")
    }
    w.flush()
    w.close()
    close()
}