package baekjoon.단계별.`일반수학1(8)`


import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 상근이는 친구들과 함께 SF영화를 찍으려고 한다. 이 영화는 외계 지형이 필요하다. 실제로 우주선을 타고 외계 행성에 가서 촬영을 할 수 없기 때문에, 컴퓨터 그래픽으로 CG처리를 하려고 한다.
 * 외계 지형은 중앙 이동 알고리즘을 이용해서 만들려고 한다.
 * 알고리즘을 시작하면서 상근이는 정사각형을 이루는 점 4개를 고른다. 그 후에는 다음과 같은 과정을 거쳐서 지형을 만든다.
 *
 * 정사각형의 각 변의 중앙에 점을 하나 추가한다.
 * 정사각형의 중심에 점을 하나 추가한다.
 * 초기 상태에서 위와 같은 과정을 한 번 거치면 총 4개의 정사각형이 새로 생긴다. 이와 같은 과정을 상근이가 만족할 때 까지 계속한다.
 *
 * 아래 그림은 과정을 총 2번 거쳤을 때까지의 모습이다.
 * 상근이는 어떤 점은 한 개 보다 많은 정사각형에 포함될 수 있다는 사실을 알았다.
 * 메모리 소모량을 줄이기 위해서 중복하는 점을 한 번만 저장하려고 한다. 과정을 N번 거친 후 점 몇 개를 저장해야 하는지 구하는 프로그램을 작성하시오.
 *
 *
 * 몬말이야?
 *
 * 패턴을 우선 보면 모든 점의 수는 한변의 점의 제곱이다. 점의 갯수는 늘어날때마다 현재 점의 -1만큼 늘어난다.
 * 처음에 2개였던 점이 다음에 2+(2-1)가 되어서 3이 되고, 다음엔 3+(3-1) = 5, 또 다음엔 5+(5-1) = 9 이렇게 늘어난다.
 * 그렇다면 반복문으로 입력값만큼 한 변의 점의 갯수를 늘리고 그 갯수를 제곱해서 출력한다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var d = 2

    for (i in 0 until n){
        d += (d - 1)
    }

    w.write("${d*d}")
    w.flush()
    w.close()
    close()
}