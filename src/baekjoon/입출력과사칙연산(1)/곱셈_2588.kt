package baekjoon.`입출력과사칙연산(1)`

fun main() {
    /**
     * 세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
     * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
     *
     *
     * readLine도 값을 입력받을수 있구나
     * Character.getNumericValue(b[2]) 이걸사용하면 ascii 코드 안나온다
     */

    val a = readLine()!!.toInt()
    val b = readLine()!!
    println("${a*Character.getNumericValue(b[2])}")
    println("${a*Character.getNumericValue(b[1])}")
    println("${a*Character.getNumericValue(b[0])}")
    println("${a*b.toInt()}")
}