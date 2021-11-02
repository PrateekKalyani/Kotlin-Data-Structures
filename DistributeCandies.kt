import java.util.*
import kotlin.collections.HashMap

fun distributeCandies(candyType: IntArray): Int
{
    var mapper = HashMap<Int, Boolean>()

    for(candy in candyType)
    {
        mapper[candy] = true
    }

    return Math.min(candyType.size / 2, mapper.size)
}

fun main()
{
    var read = Scanner(System.`in`)

    var n = read.nextInt()

    var arr = IntArray(n)

    for(i in 0 until n)
        arr[i] = read.nextInt()

    print("The answer is ${distributeCandies(arr)}")
}