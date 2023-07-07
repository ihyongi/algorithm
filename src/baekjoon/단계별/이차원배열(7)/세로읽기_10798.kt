package baekjoon.이차원배열

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 아직 글을 모르는 영석이가 벽에 걸린 칠판에 자석이 붙어있는 글자들을 붙이는 장난감을 가지고 놀고 있다.
 * 이 장난감에 있는 글자들은 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’이다.
 * 영석이는 칠판에 글자들을 수평으로 일렬로 붙여서 단어를 만든다.
 * 다시 그 아래쪽에 글자들을 붙여서 또 다른 단어를 만든다. 이런 식으로 다섯 개의 단어를 만든다.
 * 아래 그림 1은 영석이가 칠판에 붙여 만든 단어들의 예이다.
 *
 * 2차원 char형 배열의 인덱스에 대한 이해가 필요한 문제였습니다.
 * null에 해당하는 아스키코드인 '\0' 그리고, 공백을 구분할 수 있어야 했습니다.
 *
 * 왜케어려워!!!!!!!!!!!!!!!!!!!!!!!!!
 * 눈물이 나는 돌대가리상태
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val arr = Array(5){ CharArray(15) { ' ' } }
    var result = ""
    var max = 0

    for(i in 0 until 5){
        var row = readLine()
        max = max(max, row.length)
        arr[i] = row.toCharArray()
    }

    for(i in 0 until max){
        for(j in 0 until 5){
            if(arr[j].getOrNull(i) == null) continue
            result += arr[j][i]
        }
    }

    w.write("$result")
    w.flush()
    w.close()
    close()

}