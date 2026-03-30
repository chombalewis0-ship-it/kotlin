fun main(){

    // OOP-Object Oriented Programming
    // OOP:It's a programming paradigm based on the concept of object which contain data or code.
    // it's a way of arranging our code into classes

    var myobject=Person()
    myobject.speak()
    myobject.eat()
    myobject.walk()
}

class Person{

    // state of class person

    var name="Joe"
    var age=20

    // behaviours or functions or methodes

    fun speak(){
        println("The person $name can speak")

    }

    fun eat(){
        println("The person $name can eat and is $age years old")
    }

    fun walk(){
        println("The person $name can walk")
    }

}