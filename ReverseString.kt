import java.util.*

fun reverseString(s: CharArray): Unit
{
    var start = 0
    var end = s.size - 1

    while(start < end)
    {
        var temp = s[start]
        s[start] = s[end]
        s[end] = temp
    }

        end--
        start++
}


fun main()
{
    var read = Scanner(System.`in`)
    var n = read.nextInt()
    var arr = CharArray(n)

    for(i in 0 until n)
    {
        arr[i] = read.next().single()
    }

    reverseString(arr)

    for(curr in arr)
    {
        print("$curr ")
    }
}