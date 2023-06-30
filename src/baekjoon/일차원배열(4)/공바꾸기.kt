package baekjoon.`일차원배열(4)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
 * 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
 * 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
 *
 *   1. 입력 받은 바구니 갯수 N 크기 만큼의 int array 생성
 *   2. 바구니 위치 번호에 해당하는 공 번호 저장
 *   3. i번과 j번 바구니의 공 번호 교환
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val tokenizer = StringTokenizer(readLine()) //1

    val n = tokenizer.nextToken().toInt()
    val m = tokenizer.nextToken().toInt()
    val baskets = IntArray(n){ it + 1 }

    for (i in 0 until m){
        val st = StringTokenizer(readLine()) //2
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()

        val beforeValue = baskets[i - 1]
        baskets[i - 1] = baskets[j - 1]
        baskets[j - 1] = beforeValue
    }
    baskets.forEach { w.write("${it} ") }
    w.flush()
    w.close()
    close()
}