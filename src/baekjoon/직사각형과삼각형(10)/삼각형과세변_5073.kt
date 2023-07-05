package baekjoon.`직사각형과삼각형(10)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
 *
 * Equilateral :  세 변의 길이가 모두 같은 경우
 * Isosceles : 두 변의 길이만 같은 경우
 * Scalene : 세 변의 길이가 모두 다른 경우
 * 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
 *
 * 세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true){
        val triangle : IntArray = readLine().split(" ").map(String::toInt).toIntArray()
        triangle.sort()
        var result = ""

        if(triangle[0] == 0) break
        else{
            if (triangle[2] >= triangle[0] + triangle[1]) {
                w.write("Invalid")
            } else {
                when (triangle.groupBy { it }.size) {
                    1 -> w.write("Equilateral")
                    2 -> w.write("Isosceles")
                    else -> w.write("Scalene")
                }
            }
        }
        w.write("$result\n")
    }
    w.flush()
    w.close()
    close()
}