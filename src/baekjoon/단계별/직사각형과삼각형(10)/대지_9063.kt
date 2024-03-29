package baekjoon.단계별.`직사각형과삼각형(10)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *임씨는 1950 년 한국전쟁으로 많은 손해를 본 사람들 중 하나다. 전쟁 통에 손해보지 않은 사람이 어디 있을까 만은 그는 6.25 가 일어나기 전만 해도 충청도 지방에 넓은 대지를 소유한 큰 부자였다.
 * 전쟁이 나자 임씨는 땅문서와 값 나가는 것들만 챙겨서 일본으로 피난을 가지만 피난 중에 그만 땅문서를 잃어버리고 만다.
 * 전쟁이 끝난 후에 임씨의 땅은 이미 다른 사람들의 논밭이 되어 있었고, 임씨는 땅을 되찾으려 했지만 문서가 없으니 생떼 쓰는 것과 다를 바 없었다. 이러다가 임씨는 길바닥에 나앉게 생겼다.
 * 이때, 임씨에게 좋은 생각이 떠올랐으니 바로 자신이 습관처럼 땅 깊숙이 뭔가 표식을 해놓았던 사실이다. 임
 * 씨는 한적할 때마다 자신의 논밭을 거닐다가 땅속 깊은 곳에 자신의 이름이 씌어진 옥구슬을 묻어놓았던 것이다. 즉, 어떤 지점에서 그의 이름이 적힌 옥구슬이 나온다면 그 지점은 예전에 임씨의 땅이었다는 것을 증명하는 것이다.
 * 임씨는 즉시 민사소송을 통해 자신의 땅을 찾고자 했고 논리적인 근거를 들어 옥구슬이 나오는 지점이 원래 자신의 땅의 한 지점이었다는 것을 주장하여 결국 담당판사를 설득하는 데에 성공하였다.
 * 담당판사는 다음과 같은 판결을 내렸다. “ 6.25 이전의 개인소유 대지들은 99%가 남북, 동서 방향으로 평행한 직사각형 모양이었으므로, 임씨의 이름이 새겨진 옥구슬이 나오는 모든 지점을 포함하는 가장 작은 남북,
 * 동서 방향으로 평행한 변을 갖는 직사각형의 대지를 임씨의 소유로 인정한다.” 임씨는 많은 손해를 보는 셈이지만 더 이상을 요구할 만한 근거가 없었기 때문에 이 판결을 따르기로 했다.
 * 임씨의 이름이 새겨진 옥구슬의 위치 N 개가 주어질 때에, 임씨에게 돌아갈 대지의 넓이를 계산하는 프로그램을 작성하시오.
 * 단, 옥구슬의 위치는 2 차원 정수 좌표로 주어지고 옥구슬은 같은 위치에 여러 개가 발견될 수도 있으며, x 축의 양의방향을 동쪽, y 축의 양의방향을 북쪽이라고 가정한다.
 *
 * 직사각형의 최소크기를 구하려면?
 * 직사각형의 윗 변의 y좌표가 작을수록, 아랫 변의 y좌표가 클 수록,
 * 오른쪽 변의 x 좌표가 작을 수록, 왼쪽 변의 x 좌표가 클 수록
 * 직사각형의 넓이가 작아집니다.
 *
 * coerceAtLeast 들어온값중에 젤 작은거?
 * coerceAtMost 들어온값중에 젤 큰거?
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    var top = -10001
    var bottom = 10001
    var left = 10001
    var right = -10001

    repeat(n){
        val(x, y) = readLine().split(" ").map(String::toInt)
        top = top.coerceAtLeast(y) //윗변의 y좌표가 작을수록
        bottom = bottom.coerceAtMost(y) //아랫변의 y좌표가 클수록
        left = left.coerceAtMost(x) //왼쪽변의 x좌표가 클수록
        right = right.coerceAtLeast(x) //오른쪽변의 x좌표가 작을수록
    }
    w.write("${(top - bottom) * (right - left)}")
    w.flush()
    w.close()
    close()
}