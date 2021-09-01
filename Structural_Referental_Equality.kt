fun main() {
 //structural Equality
 var name= "saurabh"
 var name1 = "Chaudhary"

 println(name!=name1)
 println(name==name1)

 //Referential Equality
 var val1= 44
 var val2= 44
 println(val1 === val2)//in Refrential equal denoted by sign ===, sice everything equal in both objects O/P wil be True
 println(val1 !== val2)

 var a= person(name="amit")
 var b= person(name="amit")
 println( a===b)  //it is not equal as memory location of object is not same, so it's output false
 println(a!==b)
}
class person(var name:String)
