import java.util.*

fun generate(numRows: Int): List<List<Int>>
{
    var answer = mutableListOf<MutableList<Int>>()

    answer.add(mutableListOf<Int>(1))

    for(i in 1 until numRows)
    {
        var currRow = mutableListOf<Int>()
        currRow.add(1)

        for(j in 1 until i)
            currRow.add(answer[i-1][j] + answer[i-1][j - 1])

        currRow.add(1)
        answer.add(currRow)
    }

    return answer
}

fun main()
{
    print("The answer is ${generate(Scanner(System.`in`).nextInt())}")

}