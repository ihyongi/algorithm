package baekjoon.조건문

import java.util.*

fun main() = with(Scanner(System.`in`)) {
/**
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 */

    val a = nextInt()
    val b = nextInt()
    println(
        if(a.compareTo(b) == -1) "<"
        else if (a.compareTo(b) == 1) ">"
        else "=="
    )
}

