package baekjoon.알고리즘기초1.`200`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 *
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var t= readLine().toInt()
    while (t --> 0){
        var result = ""
        var arr = readLine().split(" ")
        for(i in arr){
            result += i.reversed() + ' '
        }
        w.write("$result\n")
    }
    w.flush()
    w.close()
    close()
}