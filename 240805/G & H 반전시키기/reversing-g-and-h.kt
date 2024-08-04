import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine().toInt()
    var now = br.readLine().toCharArray()
    val target = br.readLine().toCharArray()
    var count = 0
    var result = 0
    for (i in now.indices) {
        if (now[i] != target[i])
            {
                count++
            } else {
            if (count != 0)
                {
                    result++
                    count = 0
                }
        }
    }
    if (count != 0)
        {
            result++
        }
    println(result)
}