fun main() {
 val name= "saurabh"
 val surname = "Chaudhary"

 val myage= 30
 val yourage= 30

 if((name!=surname) || (myage!=yourage)) //OR Operator
 {
  println("Hello OR Gate")
 }
 else
 {
  println("Bye OR Gate")
 }

 if((name!=surname) && (myage!=yourage)) // AND Operator
 {
  println("Hello AND Gate")
 }
 else
 {
  println("Bye AND Gate")
 }
}
