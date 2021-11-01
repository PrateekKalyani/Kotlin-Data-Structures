import java.util.*

fun arrangeCoins(n: Int): Int
{
    var start = 0
    var end = 100000
    var ans = -1

    while(start <= end)
    {
        var mid: Int = (start + end) / 2

        var square = (mid * (mid + 1)) / 2

        if(n >= square)
        {
            ans = mid
            start = mid + 1
        }
        else
        {
            end = mid - 1
        }
    }

    return ans
}

fun main()
{
    var n = Scanner(System.`in`).nextInt()

    print("The answer is ${arrangeCoins(n)}")
}