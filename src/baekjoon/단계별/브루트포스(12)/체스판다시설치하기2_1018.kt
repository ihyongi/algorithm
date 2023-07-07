import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    /**
     * 세진님꺼 코틀린으로바꾸기ver
     */

    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map(String::toInt)
    val maps = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        val row = readLine().toCharArray()
        for (j in 0 until m) {
            maps[i][j] = row[j].code
        }
    }

    //logic
    var result = Int.MAX_VALUE
    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            val standard = maps[i][j]
            var equalStandardCnt = 0
            var notEqualStandardCnt = 0
            for (x in i until i + 8) {
                for (y in j until j + 8) {
                    if (x % 2 == 0 && y % 2 == 0 || x % 2 == 1 && y % 2 == 1) {
                        if (maps[x][y] == standard) equalStandardCnt++
                    } else {
                        if (maps[x][y] == standard) notEqualStandardCnt++
                    }
                }
            }
            val sum = (32 - equalStandardCnt + notEqualStandardCnt).coerceAtMost(32 - notEqualStandardCnt + equalStandardCnt)
            if (result > sum) result = sum
        }
    }
    w.write("$result")
    w.flush()
    w.close()
    close()
}
