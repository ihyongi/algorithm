package baekjoon.단계별.`심화(6)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
///**
// *그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
// * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
// */
//
//    val w = BufferedWriter(OutputStreamWriter(System.out))
//    var n = readLine().toInt()
//    repeat(n){
//        readLine()!!.run {
//            var set = HashSet<Char>()
//            forEachIndexed { index, c ->
//                if(!set.contains(c)) set.add(c)
//                else if (get(index-1) != c) {
//                    n --
//                }
//            }
//        }
//    }
//    w.write("$n")
//    w.flush()
//    w.close()
//    close()
//}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 *
 *
 *   단어의 각 문자를 분리해서 해당 문자와 다음으로 오는 문자가 동일하면 계속 비교를 진행한다.
 *   그렇지 않으면 해당 문자 위치의 다음 문자부터 마지막 문자까지의 단어에 해당 문자가 존재하면 그룹단어가 아닌 수를 세는 결과값에 1을 더한다
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    var cnt = 0
    val n = readLine().toInt()
    repeat(n){
        val word = readLine()
        for (i in word.indices){
            if(i != word.length -1){
                if(word[i] == word[i+1]) continue //다음글자랑 같으면 넘어가고
                else if (word[i] in word.substring(i+1, word.length)) break //그 뒤에 같은 글자가 나오는지?!!
            }else{
                cnt += 1
            }
        }
    }
    w.write("$cnt")
    w.flush()
    w.close()
    close()
}