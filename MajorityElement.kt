import java.util.*

class Solution8
{
    fun majorityElement(nums: IntArray): Int
    {
        nums.sort()

        var n = nums.size

        return nums[n / 2];
    }
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

    println("The answer is ${Solution8().majorityElement(arr)}")

}