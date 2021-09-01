import java.util.*


fun main()
{
    val read = Scanner(System.`in`)

    println("Enter Number1:")
    val num1 = read.nextFloat()

    println("Enter Number2:")
    val num2 = read.nextFloat()

    add(num1, num2)
    minus(num1, num2)
    multiply(num1, num2)
    divide(num1, num2)

}

fun add(num1:Float, num2:Float)
{
    val result = (num1 + num2)
    println("Result is $result")


}

fun minus(num1:Float, num2:Float)
{
    val result = (num1 - num2)
    println("Result is $result")


}

fun multiply(num1:Float, num2:Float)
{
    val result = (num1 * num2)
    println("Result is $result")


}

fun divide(num1:Float, num2:Float)
{
    val result = (num1 / num2)
    println("Result is $result")


}
