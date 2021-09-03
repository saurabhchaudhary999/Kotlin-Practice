fun main()
{
    //object and instance are the same thing
    var manager = User("Saurabh", "Chaudhary") //Accessing peoperties through constructor directly

    manager.printfullname() //Accessing function in class
    manager.printwithprefix("Ms")

    var friend = User("John", "Smith") //Accessing peoperties through constructor directly

    friend.printfullname()  //Accessing function in class
    friend.printwithprefix("mr")

}

class User (var firstname:String , var lastname:String) //Primary Constructor without annotation defined here
//If the primary constructor does not have any annotations or visibility modifiers, the constructor
{

    fun printfullname()
    {
        println("$firstname $lastname")
    }

    fun printwithprefix(prefix:String)
    {
        println("$prefix $lastname")
    }
}
