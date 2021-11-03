
fun isIsomorphic(s: String, t: String): Boolean
{
    var n = s.length

    var mapper = HashMap<Char, Char>()
    var mapper1 = HashMap<Char, Char>()

    for(i in 0 until n)
    {
        var first = s[i]
        var second = t[i]

        if (!mapper.containsKey(first) && !mapper1.containsKey(second))
        {
            mapper[first] = second
            mapper1[second] = first
            continue
        }

        if (!mapper.containsKey(first) || !mapper1.containsKey(second))
            return false

        if(mapper[first] != second || mapper1[second] != first)
            return false
    }

    return true
}

fun main()
{
    print("The answer is ${isIsomorphic(readLine()!!, readLine()!!)}")
}