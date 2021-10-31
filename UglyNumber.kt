import java.util.*


fun helper(n : Int, x: Int) : Int
{
    var n = n

    while(n % x == 0)
    {
        n /= x
    }

    return n
}

fun isUgly(n: Int): Boolean
{
    if(n == 0)
        return false

    var n = n

    n = helper(n, 2)
    n = helper(n, 3)
    n = helper(n, 5)

    return n == 1
}

fun main()
{
    var n = Scanner(System.`in`).nextInt()

    if(isUgly(n))
    {
        println("$n is an ugly number")
    }
    else
    {
        println("$n is not an ugly number")
    }
}