package baekjoon.단계별.`일차원배열(4)`

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    /**
     *정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     *
     * 개어렵노 ;
     */
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    //첫번째줄
    var tokenizer = StringTokenizer(readLine())
    val n = tokenizer.nextToken().toInt()
    val x = tokenizer.nextToken().toInt()
    //두번째줄
    tokenizer = StringTokenizer(readLine())

    for (i in 1..n) {
        val num: Int = tokenizer.nextToken().toInt() // 얘를 또 잘라서 x보다 작은 수인지 판별하는 과정을 거친다.
        if (num < x) writer.write("$num ")
    }

    writer.flush()
    writer.close()
    close()
}