import java.util.*

fun missingNumber(nums: IntArray): Int
{
    nums.sort()

    var n = nums.size

    for(i in nums.indices)
    {
        if(i != nums[i])
        {
            return i
        }
    }

    return nums.size
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

    println("The missing number in array is ${missingNumber(arr)}")
}