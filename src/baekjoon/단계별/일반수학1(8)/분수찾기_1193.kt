package baekjoon.단계별.`일반수학1(8)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    /**
     * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로
     * 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
     *
     * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
     *
     * 몽테소리?
     * 분자+분모 합이 홀수면 -> 내려가고 (분모가작아지고)
     * 분자+분모 합이 짝수면 -> 올라간다 (분모가올라간다)
     *
     */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val x = readLine().toInt() //x번째
    var sum = 1 //1부터..
    var index = 0

    //분모분자합 구하기
    while (index < x) {
        index += sum
        sum++
    }

    //분모분자합이 짝수인경우
    if (sum % 2 == 0) {
        var 분자 = (index - x + 1)
        var 분모 = sum - 분자
        w.write("$분자/$분모")
    } else{
        var 분모 = (index - x + 1)
        var 분자 = sum - 분모
        w.write("$분자/$분모")
    }
    w.flush()
    w.close()
    close()
}