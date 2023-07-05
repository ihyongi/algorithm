import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    /**
     * 영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
     * 영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
     *
     * 각 막대의 길이는 양의 정수이다
     * 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
     * 삼각형의 둘레를 최대로 해야 한다.
     * a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
     *
     * 세 막대의 길이가 주어졌을 때 삼각형이 되려면 가장 긴 막대의 길이가 나머지 막대의 길이의 합보다 작아야 합니다.
     * 아닐 경우는 가장 긴 막대의 길이를 줄여야 만들 수 있는 가장 큰 둘레를 만들어야 합니다.
     * a + b > c
     * a + b 보다 1만큼 작으면 삼각형의 조건을 만족
     */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val triangle = readLine().split(" ").map(String::toInt).toIntArray()
    triangle.sort()
    if(triangle[0] + triangle[1] > triangle[2]) w.write("${triangle.sum()}")
    else w.write("${(triangle[0] + triangle[1]) * 2 -1 }")

    w.flush()
    w.close()
    close()
}