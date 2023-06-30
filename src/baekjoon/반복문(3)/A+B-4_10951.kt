package baekjoon.`반복문(3)`

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * npe때문에 돌아버리겠다
 * StringTokenizer(s) <- 여기에 readLine() 넣고있엇음,, ;
 */
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var s :String?

    while (readLine().also { s = it } != null){
        val run = StringTokenizer(s)
        val a = run.nextToken().toInt()
        val b = run.nextToken().toInt()
        w.write("${a+b}\n")
    }
    w.flush()
    w.close()
    close()
}