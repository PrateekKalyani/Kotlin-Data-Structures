

fun isAnagram(s: String, t: String): Boolean
{
    var mapper = HashMap<Char, Int>()

    for(character in s)
    {
        if(!mapper.contains(character))
        {
            mapper[character] = 0
        }

        mapper[character] = mapper[character]!! +  1
    }

    for(character in t)
    {
        if(!mapper.contains(character))
        {
            return false
        }

        mapper[character] = mapper[character]!! -  1

        if(mapper[character] == 0)
        {
            mapper.remove(character)
        }
    }

    return mapper.size == 0
}

fun main()
{
    var s = readLine()
    var t = readLine()

    if(isAnagram(s!!, t!!))
    {
        println("$s and $t are Anagram")
    }
    else
    {
        println("$s and $t are not Anagram")
    }

}