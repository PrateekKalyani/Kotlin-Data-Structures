import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*
import kotlin.collections.ArrayList

fun calPoints(ops: Array<String>): Int
{
    var stk = Stack<String>()

    for(chr in ops)
    {
        if(chr == "+")
        {
            var first = stk.pop().toInt()
            var second = stk.pop().toInt()

            stk.push(second.toString())
            stk.push(first.toString())
            stk.push((first + second).toString())
        }
        else if(chr == "C")
        {
            stk.pop()
        }
        else if(chr == "D")
        {
            stk.push((2 * stk.peek().toInt()).toString())
        }
        else
        {
            stk.push(chr)
        }
    }

    var ans = 0

    while(stk.size != 0)
    {
        ans += stk.peek().toInt()
        stk.pop()
    }

    return ans
}

fun main()
{
    var n = Scanner(System.`in`).nextInt()

    var arr = Array<String>(n, {i -> ""})

    for(i in 0 until n)
        arr[i] = readLine()!!

    print("The answer is ${calPoints(arr)}")
}
