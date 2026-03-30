fun main(){

    addition()
    subtraction()
    division()
    multiplication()
    modulus()
    simpleinterest()
    BMI()



}

fun addition(){

    var num1=1
    var num2=20
    var sum=num1+num2
    println("The sum is $sum")
}

fun subtraction(){
    var num3=20
    var num4=100
    var subtraction=num4-num3
    println("The difference is $subtraction")

}

fun division(){

    var num1=50
    var num2=5
    var division=num1/num2
    println("The division is $division")
}

fun multiplication(){
    var num1=2
    var num2=40
    var multiplication=num2*num1
    println("The multiplication is $multiplication")

}

fun modulus(){

    var num1=20
    var num2=4
    var modulus=num1%num2
    println("The modulus is $modulus")
}

fun simpleinterest(){
    var year=2
    var rate=15
    var principal=20000
    var simpleinterest=principal*rate*year/100
    println("The simpleinterest is $simpleinterest")
}

fun BMI(){
    var weight=60
    var height=1.75
    var BMI=weight/height*weight
    println("The BMI is $BMI")

}