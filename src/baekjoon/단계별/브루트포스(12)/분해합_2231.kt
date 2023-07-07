package baekjoon.단계별.`브루트포스(12)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
 * 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
 * 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
 * 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 *
 * 분해합은 출력될 숫자(생성자) + 해당 수의 각 자릿수의 합이다.
 * 이때, 가장 작은 생성자의 경우는 각 자릿수의 합이 최대가 되는 경우이다.
 * 각 자릿수의 합이 최대가 되는 경우는 모든 자릿수의 값이 9일때 이므로
 * for문을 이용해 9 * 입력받은 수의 자릿수부터 입력받은 수까지 분해합을 계산해 비교한다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var ans = 0
    for (i in 1..n) {
        val lsum: Int = lineSum(i)
        if (i + lsum == n) {
            ans = i
            break
        }
    }
    w.write("$ans")
    w.flush()
    w.close()
    close()
}

private fun lineSum(n: Int): Int {
    var n = n
    var sum = 0
    while (n > 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}