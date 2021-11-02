import java.util.*

fun checkPerfectNumber(num: Int): Boolean
{
    var sum = 0

    for(x in 1 until num)
    {
        if(num % x == 0)
            sum += x
    }

    return sum == num
}

fun main()
{
    print("The answer is ${checkPerfectNumber(Scanner(System.`in`).nextInt())}")
}
