import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
    val arr = IntArray(nums[0])
    for (i in 0 until nums[0]) {
        arr[i] = br.readLine().toInt()
    }
    var result = -1
    for (i in 0 until nums[0] - 1) {
        if (arr[i] < result) {
            continue
        }
        for (j in i + 1..i + nums[1]) {
            if (j == nums[0]) {
                break
            }
            if (arr[i] == arr[j]) {
                result = arr[i]
                break
            }
        }
    }
    println(result)
}