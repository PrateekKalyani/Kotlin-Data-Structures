import java.util.*
import kotlin.collections.HashMap

fun containsDuplicate(nums: IntArray): Boolean
{
    var mapper = HashMap<Int, Boolean>()

    for(num in nums)
    {
        if(mapper.containsKey(num))
        {
            return true
        }

        mapper[num] = true
    }

    return false
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

    if(containsDuplicate(arr))
    {
        println("This array contains duplicate")
    }
    else
    {
        println("This array do not contains any duplicate")
    }

}