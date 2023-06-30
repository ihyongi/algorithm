package baekjoon.`반복문(3)`

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true){
        val run = StringTokenizer(readLine())
        val a = run.nextToken().toInt()
        val b = run.nextToken().toInt()
        if(a == 0 && b == 0) break
        w.write("${a+b}\n")
    }
    w.flush()
    w.close()
    close()
}