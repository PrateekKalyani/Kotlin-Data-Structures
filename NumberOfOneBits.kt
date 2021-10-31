import java.util.*

class Solution6
{
    fun hammingWeight(n:Int):Int
    {
        var answer = 0
        var temp = n

        while(temp != 0)
        {
            answer += 1
            temp = temp and (temp - 1)
        }

        return answer
    }
}

fun main()
{
    var read = Scanner(System.`in`)

    var n = read.nextInt()

    print("The Answer is ${Solution6().hammingWeight(n)}")
}