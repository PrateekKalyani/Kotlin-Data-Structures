
fun countBinarySubstrings(s: String): Int
{
    var arr = mutableListOf<Int>()
    var index = 0

    while(index < s.length)
    {
        var count = 1
        index++

        while(index < s.length && s[index] == s[index - 1])
        {
            index++
            count++
        }

        arr.add(count)
    }

    var ans = 0

    for(i in 1 until arr.size)
    {
        ans += Math.min(arr[i], arr[i - 1])
    }

    return  ans
}

fun main()
{
    print("The answer is ${countBinarySubstrings(readLine()!!)}")
}