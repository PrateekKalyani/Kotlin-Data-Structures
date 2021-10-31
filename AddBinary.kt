class Solution3
{
    fun helper(sum : Int) : IntArray
    {
        var carry: Int
        var curr : Int

        if(sum == 0)
        {
            curr = 0
            carry = 0
        }
        else if(sum == 1)
        {
            curr = 1
            carry = 0
        }
        else if(sum == 2)
        {
            carry = 1
            curr = 0
        }
        else
        {
            curr = 1
            carry = 1
        }

        var ans = intArrayOf(curr, carry)
        return ans
    }

    fun addBinary(a: String, b: String): String {

        var ans: String = ""
        var i = a.length - 1
        var j = b.length - 1
        var carry = 0

        while(i >= 0 && j >= 0)
        {
            var sum : Int = a[i].digitToInt() + b[j].digitToInt() + carry

            var arr : IntArray = helper(sum)

            ans = arr[0].toString() + ans
            carry = arr[1]

            i -= 1
            j -= 1
        }

        while(i >= 0)
        {
            var sum : Int = a[i].digitToInt() + carry

            var arr : IntArray = helper(sum)

            ans = arr[0].toString() + ans
            carry = arr[1]

            i -= 1
        }

        while(j >= 0)
        {
            var sum : Int = b[j].digitToInt() + carry

            var arr : IntArray = helper(sum)

            ans = arr[0].toString() + ans
            carry = arr[1]

            j -= 1
        }

        if(carry == 1)
        {
            ans = "1$ans"
        }

        return ans
    }
}

fun main()
{
    var str1 = readLine()
    var str2 = readLine()

    var obj = Solution3()

    print("The answer is ${obj.addBinary(str1!!, str2!!)}")
}