import java.util.*

fun maxSubArray(nums: IntArray): Int
{
    var ans = Integer.MIN_VALUE
    var sum = 0

    for(x in nums)
    {
        sum += x

        if(sum > ans)
            ans = sum

        if(sum < 0)
            sum = 0
    }

    return ans
}

fun main()
{
    var read = Scanner(System.`in`)

    var n = read.nextInt()
    var arr = IntArray(n)

    for(i in 0 until n)
        arr[i] = read.nextInt()

    print("The answer is ${maxSubArray(arr)}")
}