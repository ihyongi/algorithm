package baekjoon.`일반수학1(8)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 위의 그림과 같이 육각형으로 이루어진 벌집이 있다.
 * 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
 * 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를
 * 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
 *
 * 솔직히 무슨말인지 잘 모르겠다
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val destination = readLine().toInt() //목적지
    var cnt = 1
    var roomNum = 1

    while (roomNum < destination){
        roomNum += cnt * 6
        cnt += 1
    }

    w.write("$cnt")
    w.flush()
    w.close()
    close()
}