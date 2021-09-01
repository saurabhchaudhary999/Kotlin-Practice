fun main()
{
   hello(32,"saurabh")
    hello(45)
   //It is function overloading

}
fun hello(age:Int,  name:String)
{
    println("Hello your age is $age and your name is $name")

}

fun  hello(age:Int)
{
    println("Hello Your age is $age")
}

