import java.util.*
import kotlin.collections.HashMap

fun singleNumber(nums: IntArray): Int
{
    var mapper = HashMap<Int, Int>()

    for(x in nums)
    {
        if(mapper.containsKey(x) == false)
            mapper[x] = 0

        mapper[x] = mapper[x]!! + 1
    }

    for(key in mapper.keys)
    {
        if(mapper[key] == 1)
            return key
    }

    return -1
}

fun main()
{
    var read = Scanner(System.`in`)

    var n = read.nextInt()
    var arr = IntArray(n)

    for(i in 0 until n)
    {
        arr[i] = read.nextInt()
    }

    print("The answer is ${singleNumber(arr)}")
}