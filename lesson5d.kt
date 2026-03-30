fun main(){

    var mycat=Cat()
    mycat.sleep()
    mycat.meow()

    var myrabbit=Rbbit()
    myrabbit.sleep()
    myrabbit.eat()


}

open class Animal{

    fun sleep(){
        println("The animal can sleep")
    }


}

class Cat:Animal(){

    fun meow(){
        println("The cat can meow")

    }

}

class Rbbit:Animal(){

    fun eat(){
        println("The rabbit can eat")
    }


}