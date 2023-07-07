package baekjoon.단계별.`심화(6)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
 * 0 1 2 3 4
 *
 *
 * reversed! 키키 오지네
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val string = readLine()
    val reversed = string.reversed()
    if(string == reversed) w.write("1")
    else w.write("0")
    w.flush()
    w.close()
    close()
}
