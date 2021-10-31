import java.util.*

class Solution9
{
    private fun findSum(n : Int) : Int {
        if (n == 0)
            return 0

        var curr = n % 10

        return curr * curr + findSum(n / 10)
    }

    fun isHappy(n: Int) : Boolean
    {
        if(n in 0..9)
        {
            when (n)
            {
                1 , 7 -> {
                    return true;
                }
                else -> {
                    return false;
                }
            }
        }

        var sum = findSum(n)

        if(isHappy(sum))
        {
            return true
        }

        return false
    }
}

fun main()
{
    var read = Scanner(System.`in`)
    var n = read.nextInt()

    if(Solution9().isHappy(n))
    {
        println("$n is a Happy Number")
    }
    else
    {
        println("$n is not a Happy Number")
    }
}