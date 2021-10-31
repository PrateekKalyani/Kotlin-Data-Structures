import java.util.*

fun summaryRanges(nums: IntArray): List<String>
{
    var answer = mutableListOf<String>()

    var n = nums.size
    var index = 0

    while (index < n)
    {
        var temp = index + 1

        while(temp < n && nums[temp] - nums[temp - 1] == 1)
            temp++

        var currRange: String

        if(index != temp - 1)
        {
            currRange = nums[index].toString() + "->" + nums[temp - 1].toString()
        }
        else
        {
            currRange = nums[index].toString()
        }

        index = temp

        answer.add(currRange)
    }

    return answer
}

fun main()
{
    var read = Scanner(System.`in`)

    var n = read.nextInt()

    var arr = IntArray(n)

    for(i in 0..n)
    {
        arr[i] = read.nextInt()
    }

    var answer: List<String> = summaryRanges(arr)

    for(range in answer)
    {
        println(range)
    }
}