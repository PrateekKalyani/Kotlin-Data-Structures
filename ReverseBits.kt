import java.util.*

fun reverseBits(n:Int):Int
{
    var ans = 0

    for(i in 0 until 32)
    {
        if(n and (1 shl i) != 0)
            ans += 1 shl (31 - i)
    }

    return ans
}

fun main()
{
    print("The answer is ${reverseBits(Scanner(System.`in`).nextInt())}")
}