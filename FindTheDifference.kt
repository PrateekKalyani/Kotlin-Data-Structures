fun findTheDifference(s: String, t: String): Char
{
    var mapper = HashMap<Char,Int>()

    for(character in s)
    {
        if(!mapper.containsKey(character))
        {
            mapper[character] = 0
        }

        mapper[character] = mapper[character]!! + 1
    }

    for(character in t)
    {
        if(!mapper.containsKey(character))
            return character

        mapper[character] = mapper[character]!! - 1

        if(mapper[character] == 0)
            mapper.remove(character)
    }

    return ' '
}

fun main()
{
    var s = readLine()
    var t = readLine()

    println("the answer is ${findTheDifference(s!!, t!!)}")
}