package baekjoon.단계별.`반복문(3)`

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    for(i in 1 ..readLine().toInt()){
        StringTokenizer(readLine()).run { //공백을 기준으로 나눠줌
            val a = nextToken().toInt()
            val b = nextToken().toInt()
            w.write("Case #$i: ${a+b}\n")
        }
    }
    w.flush()
    w.close()
    close()

}