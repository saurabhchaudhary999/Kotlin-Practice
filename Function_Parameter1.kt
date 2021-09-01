 fun main()
    {
        hello(age= 32,name = "Golu" )
        hello(age=15 , name = "John")

}

fun hello(age:Int,name:String)
{
    println("Hello $name your age is $age")

    if (age< 25)
    {
        println("$name you are eligible with age $age")
    }
    else
    {
        println("$name you are not eligible with age $age")
    }
}
