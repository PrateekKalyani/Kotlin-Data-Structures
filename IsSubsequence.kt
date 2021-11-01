
fun isSubsequence(s: String, t: String, i: Int = 0, j : Int = 0): Boolean
{
    var n = s.length
    var m = t.length

    if(i == n)
        return true

    if(j == m)
        return false

    var ans = false

    if(s[i] == t[j])
    {
        ans = isSubsequence(s, t, i + 1, j + 1)
    }
    else
    {
        ans = isSubsequence(s, t, i, j + 1)
    }

    return ans
}

fun main()
{
    var s = readLine()
    var t = readLine()

    if(isSubsequence(s!!, t!!))
    {
        println("$s is subsequence of $t")
    }
    else
    {
        println("$s is not a subsequence of $t")
    }
}
