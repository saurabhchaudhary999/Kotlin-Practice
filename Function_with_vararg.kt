fun main()
{
   hello(32,"saurabh","smita","mau")


}
fun hello(age:Int, vararg name:String) //In function we can give multiple values to parameter using vararg.
{
    println("Hello your age is $age and your name is $name")//This will return information of array
    println("Hello your age is $age and your names are:")
    name.forEach { println(it) }// It is required to read array from due to vararg
}
