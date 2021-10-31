import java.util.*

class Solution5
{
    var dp : IntArray = IntArray(46)

    constructor()
    {
        for(i in 0 until 46)
            dp[i] = -1
    }

    fun climbStairs(n: Int): Int
    {
        if(n == 0 || n == 1)
            return 1

        if(dp[n] != -1)
            return dp[n]

        dp[n] = climbStairs(n - 1) + climbStairs(n - 2)

        return dp[n]
    }
}

fun main()
{
    var read = Scanner(System.`in`)

    var n = read.nextInt()

    print("The answer is ${Solution5().climbStairs(n)}")
}