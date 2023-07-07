package baekjoon.`브루트포스(12)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 *
 * 입력받은 값이 5로 나누어 떨어지면 해당 몫을 출력한다. 만약, 나누어 떨어지지 않으면 3을 빼고 봉지의 개수를 1 추가한 뒤 다시 5로 나누어보면서 반복한다
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var n = readLine().toInt()
    var bag = 0

    while (n >= 0) {
        if (n % 5 == 0) {
            bag += n / 5
            w.write("$bag")
            w.flush()
            w.close()
            close()
            return
        }
        n -= 3
        bag++
    }

    w.write("-1")
    w.flush()
    w.close()
    close()
}