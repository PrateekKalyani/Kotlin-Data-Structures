import java.util.*

fun isPowerOfTwo(n: Int): Boolean
{
    if(n == 1)
        return true

    if(n % 2 != 0)
        return false

    return isPowerOfTwo(n / 2)
}

fun main()
{
    var n = Scanner(System.`in`).nextInt()

    if(isPowerOfTwo(n))
    {
        println("$n is Power of Two")
    }
    else
    {
        println("$n is not Power of Two")
    }

}
