import java.util.*
import kotlin.math.abs

fun convertToBase7(num: Int): String
{
    if(num == 0)
    {
        return "0"
    }

    var answer = ""
    var temp = abs(num)

    while(temp > 0)
    {
        answer = (temp % 7).toString() + answer
        temp /= 7
    }

    if(num < 0)
        answer = "-$answer"

    return answer
}

fun main()
{
    print("The answer is ${convertToBase7(Scanner(System.`in`).nextInt())}")
}
