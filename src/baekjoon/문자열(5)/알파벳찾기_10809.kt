package baekjoon.`문자열(5)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 *
 * 몬 개소리지?
 * 소문자 a == 97
 * char 아스키코드 구하려면 code
 * indices >>  get() = 0..length - 1 앞으로 이걸로..
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var alphabet = IntArray(26) { -1 } //abcd...
    val str = readLine()
    for (i in str.indices) {
        val i1 = alphabet[str[i].code - 97]
        if( i1 == -1) alphabet[str[i].code - 97] = i
    }
    alphabet.forEach { w.write("$it ") }
    w.flush()
    w.close()
    close()
}