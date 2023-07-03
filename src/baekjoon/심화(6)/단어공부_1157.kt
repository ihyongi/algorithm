package baekjoon.`심화(6)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 맵에 담아서 plus 1 할 수 있구나,,
 * Mississipi
 *         m{m=1}
 *         i{m=1, i=1}
 *         s{m=1, i=1, s=1}
 *         s{m=1, i=1, s=2}
 *         i{m=1, i=2, s=2}
 *         s{m=1, i=2, s=3}
 *         s{m=1, i=2, s=4}
 *         i{m=1, i=3, s=4}
 *         p{m=1, i=3, s=4, p=1}
 *         i{m=1, i=4, s=4, p=1}
 *
 * //println(max)          i =4
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val map = mutableMapOf<Char, Int>()
    val origin = readLine()
    for (c in origin) {
        val lower = c.lowercaseChar()
        if(map.containsKey(lower)) map[lower] = map[lower]!!.plus(1)
        else map[lower] = 1
    }
    val max = map.maxByOrNull { it.value }
    if(map.filter { it.value == max!!.value }.count() > 1) w.write("?")
    else w.write("${max!!.key.uppercase()}")
    w.flush()
    w.close()
    close()
}