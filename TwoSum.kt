import java.util.*

fun TwoSum(firstNumber: Int, secondNumber: Int): Int
{
    return firstNumber + secondNumber
}

fun main()
{
    val read = Scanner(System.`in`)

    print("Enter first Number = ")

    var firstNumber = read.nextInt()

    print("Enter Second Number = ")

    var secondNumber = read.nextInt()

    var answer = TwoSum(firstNumber, secondNumber)

    println("The Sum is $answer")
}