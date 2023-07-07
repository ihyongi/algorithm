package baekjoon.단계별.`심화(6)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
 * 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
 * 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
 * 인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.
 * P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
 * 과연 치훈이는 무사히 졸업할 수 있을까?
 *
 * (학점 × 과목평점)의 합 / 학점의 총합 값
 *
 * '' -> char로 인식
 *  "" -> 문자로 인식
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val map = mapOf("A+" to 4.5, "A0" to 4.0, "B+" to 3.5, "B0" to 3.0, "C+" to 2.5, "C0" to 2.0, "D+" to 1.5, "D0" to 1.0, "F" to 0.0)
    var total = 0.0
    var totalScore = 0.0

    for(i in 0 until 20){
        //학점이랑 등급을 줬는데 뭐어쩌라는겨
        val list= readLine().split(" ")
        if(list[2] == "P") {
            continue
        }else{
            total += map[list[2]]!! * list[1].toDouble()
            totalScore += list[1].toDouble()
        }
    }
    w.write("${total / totalScore}")
    w.flush()
    w.close()
    close()
}