package baekjoon.`일차원배열(4)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
 * 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
 * 바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
 *
 * reverse(fromIndex, toIndex)
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val tokenizer = StringTokenizer(readLine()) //1
    val n = tokenizer.nextToken().toInt()
    val m = tokenizer.nextToken().toInt()
    val basket = IntArray(n){ it + 1}

    for (index in 1 until m + 1){
        val st = StringTokenizer(readLine()) //2~나머지줄
        val i = st.nextToken().toInt() - 1
        val j = st.nextToken().toInt() - 1
        basket.reverse(i, i + (j - i + 1)) //시작지점(fromIndex)에서 뒤집고 싶은 갯수를 더하면 계산할 수 있다
    }
    basket.forEach { w.write("$it ") }
    w.flush()
    w.close()
    close()
}