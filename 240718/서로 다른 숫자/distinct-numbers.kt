import java.io.*
import kotlin.collections.*
fun main()  {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val set: HashSet<Int> =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .toHashSet()
    println(set.size)
}