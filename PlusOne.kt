import java.util.*

class Solution4 {
    fun plusOne(digits: IntArray): IntArray
    {
        var carry = 1

        for (i in digits.size - 1 downTo 0)
        {
            var sum = digits[i] + carry

            carry = sum / 10
            digits[i] = sum % 10
        }

        if(carry == 0)
            return digits

        var answer = IntArray(digits.size + 1)

        answer[0] = carry

        for(i in 0 until digits.size)
            answer[i + 1] = digits[i]

        return answer
    }
}

fun main()
{
    var read = Scanner(System.`in`)

    var n : Int = read.nextInt()

    var arr : IntArray = IntArray(n)

    for(i in 0 until n)
    {
        arr[i] = read.nextInt()
    }

    var answer = Solution4().plusOne(arr)

    for(x in answer)
    {
        print("$x ")
    }
}