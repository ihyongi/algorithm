package baekjoon.단계별.`브루트포스(12)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 수현이는 4차 산업혁명 시대에 살고 있는 중학생이다.
 * 코로나 19로 인해, 수현이는 버추얼 학교로 버추얼 출석해 버추얼 강의를 듣고 있다.
 * 수현이의 버추얼 선생님은 문자가 2개인 연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.
 *
 * 다음 연립방정식에서 $x$와 $y$의 값을 계산하시오.
 * \[\begin{cases}ax+by=c\\
 *                dx+ey=f\end{cases}\] 
 * 4차 산업혁명 시대에 숙제나 하고 앉아있는 것보다 버추얼 친구들을 만나러 가는 게 더 가치있는 일이라고 생각했던 수현이는
 * 이런 연립방정식을 풀 시간이 없었다. 다행히도, 버추얼 강의의 숙제 제출은 인터넷 창의 빈 칸에 수들을 입력하는 식이다.
 * 각 칸에는 $-999$ 이상 $999$ 이하의 정수만 입력할 수 있다. 수현이가 버추얼 친구들을 만나러 버추얼 세계로 떠날 수 있게 도와주자.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val array = readLine().split(" ").map(String::toInt).toTypedArray()
    var answerX = 0
    var answerY = 0
    for (i in -999..999) {
        for (j in -999..999) {
            if (array[0] * i + array[1] * j === array[2] && array[3] * i + array[4] * j === array[5]) {
                answerX = i
                answerY = j
                break
            }
        }
    }
    w.write("$answerX $answerY")
    w.flush()
    w.close()
    close()
}