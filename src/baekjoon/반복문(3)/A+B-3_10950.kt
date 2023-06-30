package baekjoon.`반복문(3)`

import java.util.*

fun main() = with(Scanner(System.`in`)) {
/**
 *두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

    val t = nextInt()
    for (i in 1..t){
        println(nextInt() + nextInt())
    }
}