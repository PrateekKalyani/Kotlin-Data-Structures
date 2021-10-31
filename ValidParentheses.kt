import java.util.*

class Solution1
{
    fun isValid(s: String?): Boolean
    {
        var stk = Stack<Char>()

        for(index in 0 until  s!!.length)
        {
            var curr : Char = s[index]

            if(curr == '(')
            {
                stk.add(curr)
            }
            else
            {
                if(stk.size > 0 && stk.peek() == '(')
                {
                    stk.pop()
                }
                else
                {
                    return false
                }
            }
        }

        if(stk.size != 0)
            return false

        return true
    }
}

fun main()
{
    var str = readLine()

    print("string is $str")

    var obj = Solution1()

    print("The answer is ${obj.isValid(str)}")
}