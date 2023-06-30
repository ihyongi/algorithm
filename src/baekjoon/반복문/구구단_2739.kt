package baekjoon.반복문

import java.util.*

fun main() = with(Scanner(System.`in`)) {
/**
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */

    val a = nextInt()
    for(i in 1 .. 9){
        println("$a * $i = ${a*i}")
    }
}