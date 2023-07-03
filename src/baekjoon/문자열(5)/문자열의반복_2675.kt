package baekjoon.`문자열(5)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    repeat(t){
        var result = ""
        val st = StringTokenizer(readLine())
        val num = st.nextToken().toInt()
        val string = st.nextToken().toString().split("")
        for (i in string.indices){
            repeat(num) {
                result += string[i]
            }
        }
        w.write("${result}\n")
    }
    w.flush()
    w.close()
    close()
}