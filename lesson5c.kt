fun main(){
    var dogObject=Dog()
    dogObject.eat()
    dogObject.bark()
    println(dogObject.name)

   





}

// Inheritance-childclass inheriting from parentclass

 open class Animal{
    var name="Tom"
   
    fun eat(){
        println("The animal can eat")
    }

  
}

class Dog:Animal(){
    fun bark(){
        println("The dog can bark")
    }
}