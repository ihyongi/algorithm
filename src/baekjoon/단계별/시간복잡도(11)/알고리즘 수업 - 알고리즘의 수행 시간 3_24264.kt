package baekjoon.단계별.`시간복잡도(11)`


import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 * 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
 * MenOfPassion 알고리즘은 다음과 같다.
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n
 *         for j <- 1 to n
 *             sum <- sum + A[i] × A[j]; # 코드1
 *     return sum;
 * }
 *
 * 첫째 줄에 코드1 의 수행 횟수를 출력한다.
 * 둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 *
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toBigInteger() //500,000 intㄴㄴ bigIntegerㅇㅇ
    w.write("${n*n}\n") //어쨋든 한번만 수행하는거아녀
    w.write("2")
    w.flush()
    w.close()
    close()
}