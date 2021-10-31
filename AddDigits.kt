import java.util.*

fun findSum(n : Int) : Int
{
    if(n == 0)
        return 0

    return n % 10 + findSum(n / 10)
}

fun addDigits(num: Int): Int
{
    if(num in 0..9)
        return num

    var sum = findSum(num)

    return addDigits(sum)
}

fun main()
{
    var n = Scanner(System.`in`).nextInt()

    print("The answer is $()")
}
