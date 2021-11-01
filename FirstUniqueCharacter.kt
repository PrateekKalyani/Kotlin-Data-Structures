
fun firstUniqChar(s: String): Int
{
    var mapper = HashMap<Char, Int>()

    for(character in s)
    {
        if(!mapper.containsKey(character))
        {
            mapper[character] = 0
        }

        mapper[character] = mapper[character]!! + 1
    }

    for(index in s.indices)
    {
        var character = s[index]

        if(mapper[character]!! == 1)
            return index
    }

    return -1
}

fun main()
{
    var s = readLine()

    print("The answer is ${firstUniqChar(s!!)}")
}