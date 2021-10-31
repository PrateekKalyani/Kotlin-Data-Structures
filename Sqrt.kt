import java.util.*

class Solution2
{
    fun mySqrt(x: Int): Int
    {
        var start : Long = 0
        var end = Math.pow(2.0, 16.0).toLong()

        var ans : Long = -1

        while(start <= end)
        {
            var mid : Long = ( (start + end) / 2).toLong()

            var square = mid * mid

            if(square > x)
            {
                end = mid - 1
            }
            else
            {
                ans = mid
                start = mid + 1
            }

        }

        return ans.toInt()
    }
}

fun main()
{
    var read = Scanner(System.`in`)

    var num = read.nextInt()
    var obj = Solution2()

    print("The square root is ${obj.mySqrt(num)}")
}
