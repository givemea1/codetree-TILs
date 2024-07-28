import java.io.*

var arr: Array<Int> = emptyArray()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .toTypedArray()
    arr =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .toTypedArray()
    for (i in 0 until nums[1]) {
        search(br.readLine().toInt())
    }
}

fun search(target: Int) {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val mid = (left + right) / 2
        val num = arr[mid]
        if (num == target) {
            println(mid + 1)
            return
        } else if (num > target) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    println(-1)
}