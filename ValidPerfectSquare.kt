import java.util.*
import kotlin.math.sqrt

fun isPerfectSquare(num: Int): Boolean
{
    var root: Int = sqrt(num.toFloat()).toInt()

    return root * root == num
}

fun main()
{
    var n = Scanner(System.`in`).nextInt()

    if(isPerfectSquare(n))
    {
        println("$n is a perfect square")
    }
    else
    {
        println("$n is not a perfect square")
    }
}