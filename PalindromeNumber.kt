import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

import kotlin.math.abs
class Solution
{
    fun isPalindrome(x: Int): Boolean
    {
        if(x < 0)
            return false

        var arr = ArrayList<Int>()
        var temp = x


        while(temp > 0)
        {
            arr.add(temp % 10)
            temp /= 10
        }

        var start = 0
        var end = arr.size - 1

        while(start < end)
        {
            if(arr[start] != arr[end])
                return false

            start += 1
            end -= 1
        }

        return true
    }
}

fun main()
{
    val read = Scanner(System.`in`)

    var num = read.nextInt()
    var obj = Solution()

    print("The answer is ${obj.isPalindrome(num)}")
}