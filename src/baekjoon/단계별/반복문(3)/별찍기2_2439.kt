package baekjoon.단계별.`반복문(3)`

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
     */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val toInt = readLine().toInt()
    for (i in 1..toInt){
        for(j in toInt downTo 1){
            if (i >= j) w.write("*")
            else w.write(" ")
        }
        w.write("\n")
    }
    w.flush()
    w.close()
    close()
}