package baekjoon.단계별.`브루트포스(12)`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/**
 *지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
 * 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
 * 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
 * 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다.
 * 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
 * 보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
 * 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
 *
 *
 * 너무 어려워.............
 */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val(row, col) = readLine().split(" ").map(String::toInt) //n줄에 m개
    val box = Array(row) { IntArray(col) }
    var min = row * col

    // 시작점(0,0)을 흰색(W)으로 가정
    // row + column = 짝수 -> W
    // row + column = 홀수 -> B
    for(i in 0 until row){
        val line = readLine().toCharArray()
        for(j in 0 until col){
            if (((i+j) % 2 == 0 && line[j] != 'W') || ((i+j) % 2 != 0 && line[j] != 'B')) box[i][j]++ //다시칠해야할거
            if (j > 0) box[i][j] += box[i][j-1]
//            w.write("${box[i][j]} ")
        }
//            w.write("\n")
    }

    // 체스판의 시작점을 (i,j)로 잡고 8*8 체스판으로 자르면서 최소값 찾기
    for (i in 0 .. row-8) {
        for (j in 0 .. col-8) {
            var count = 0

            // 체스판 안에 다시 칠해야 하는 개수 계산
            for (k in i until i+8) {
                // 0칸부터 j+7칸 사이의 다시 칠해야 하는 칸 수
                count += box[k][j+7]

                // j칸 이전에 존재하는 다시 칠해야 하는 칸 수는 제외
                if (j > 0) count -= box[k][j-1]
            }

            // 첫 칸을 흰색으로 가정했을 경우 칠해야 할 개수가 과반수를 넘는 경우
            // 첫 칸을 검은색으로 가정하여 64에서 뺀 값을 칠해야 할 개수로 설정
            if (count > 64 - count) count = 64 - count

            // 최소값인 경우 min 값 업데이트
            if (count < min) min = count
        }
    }
    w.write("$min")
    w.flush()
    w.close()
    close()
}