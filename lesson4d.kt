fun main(){
    addition(num1=30,num2=40)
    subtraction(num1=20,num2=50)
    division(num1=20,num2=5)
    multiplication(num1=4,num2=20)
    BodyMassIndex(weight=60,height=1.75)
    modulus(num1=19,num2=4)
    simpleinterest(year=3,rate=23,principal=23000)


}

fun addition(num1:Int,num2:Int){
    var sum=num1+num2
    println("The sum is $sum")

}

fun subtraction(num1:Int,num2:Int){
    var subtraction=num2-num1
    println("The difference is $subtraction")

}

fun division(num1:Int,num2:Int){
    var division=num2/num1
    println("The division is $division")
}

fun multiplication(num1:Int,num2:Int){

    var multiplication=num1*num2
    println("The multiplication is $multiplication")

}

fun BodyMassIndex(weight:Int,height:Double){
    var bodyMassIndex=weight/height*height
    println("The BMI is $bodyMassIndex")
}

fun modulus(num1:Int,num2:Int){
    var modulus=num1%num2
    println("The modulus is $modulus")
}

fun simpleinterest(rate:Int,year:Int,principal:Int){
    var simpleinterest=rate*year*principal/100
    println("The simpleinterest is $simpleinterest")
}



