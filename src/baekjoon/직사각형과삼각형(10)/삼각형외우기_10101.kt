package baekjoon.`직사각형과삼각형(10)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashSet

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.
 * 삼각형의 세 각을 입력받은 다음,
 *
 * 세 각의 크기가 모두 60이면, Equilateral
 * 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
 * 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
 * 세 각의 합이 180이 아닌 경우에는 Error
 * 를 출력하는 프로그램을 작성하시오.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    if( a+b+c == 180){
        var set = mutableSetOf<Int>()
        set.add(a)
        set.add(b)
        set.add(c)
        if(set.size == 1) w.write("Equilateral")
        if(set.size == 2) w.write("Isosceles")
        if(set.size == 3) w.write("Scalene")

    }else{
        w.write("Error")
    }
    w.flush()
    w.close()
    close()
}