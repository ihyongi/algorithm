import java.util.*

/**
 * 내가 이거 풀 단계는 아닌거같은데 .. ?
 */
object Main {
    var N: String? = null
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var temp = 0
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        N = sc.nextLine()
        divide(N)
        println("$min $max")
    }

    private fun divide(input: String?) {
        if (input!!.length >= 3) {
            var i = 1
            while (i < input.length - 1) {
                var j = i + 1
                while (j < input.length) {
                    val a = input.substring(0, i)
                    val b = input.substring(i, j)
                    val c = input.substring(j)

                    temp += calc(a)
                    temp += calc(b)
                    temp += calc(c)
                    divide((a.toInt() + b.toInt() + c.toInt()).toString())
                    temp -= calc(a)
                    temp -= calc(b)
                    temp -= calc(c)

                    j++
                }
                    i++
            }
        } else if (input.length == 2) {
            temp += input[0].code % 2
            temp += input[1].code % 2
            divide((input[0].toString().toInt() + input[1].toString().toInt()).toString())
            temp -= input[0].code % 2
            temp -= input[1].code % 2
        } else if (input.length == 1) {
            temp += input.toInt() % 2
            max = Math.max(temp, max)
            min = Math.min(temp, min)
            temp -= input.toInt() % 2
            return
        }
    }

    private fun calc(number: String): Int {
        var count = 0
        for (element in number) {
            if (element.code % 2 != 0) {
                count++
            }
        }
        return count
    }
}