fun main()
{
    //object and instance are the same thing
    var manager = User() //Oject or Instances of class /*manager is object or Instance of class*/
    manager.firstname ="Saurabh" //Accessing properties of class though instance
    manager.lastname = "Chaudhary" //Accessing properties of class though instance
    manager.printfullname() //Accessing function in class

    var friend = User() // Another Object or Instances of class /*friend is object or Instance of class*/
    friend.firstname = "John" //Accessing properties of class though instance
    friend.lastname= "Smith" //Accessing properties of class though instance
    friend.printfullname()  //Accessing function in class

}

class User //Names of classes and objects start with an uppercase letter
{
    var firstname:String= "" //Constructor declaration of class
    var lastname:String= "" //Constructor declaration of class

    fun printfullname()
    {
        println("$firstname $lastname")
    }
    
}
