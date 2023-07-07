package baekjoon.단계별.`약수배수와소수(9)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *4 × 3 = 12이다.
 * 이 식을 통해 다음과 같은 사실을 알 수 있다.
 * 3은 12의 약수이고, 12는 3의 배수이다.
 * 4도 12의 약수이고, 12는 4의 배수이다.
 * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
 *
 * 첫 번째 숫자가 두 번째 숫자의 약수이다.
 * 첫 번째 숫자가 두 번째 숫자의 배수이다.
 * 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
 * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))

    while (true){
        val (a, b) = readLine().split(" ").map(String::toInt)
        if(a == 0 ) break
        else {
            if(a > b) {
                if (a % b == 0) w.write("multiple\n")
                else w.write("neither\n")
            } else {
                if (b % a == 0) w.write("factor\n")
                else w.write("neither\n")
            }
        }
    }
    w.flush()
    w.close()
    close()
}