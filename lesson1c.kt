fun main(){
    // Arithmetic operaters -addition,subtraction,multiplication,modulus,division
    val num1=80
    val num2=20

    val addition:Int=num1+num2
    println("The sum is :$addition")

    val subtraction:Int=num1-num2
    println("The difference is :$subtraction")

    val multiplication:Int=num1*num2
    println("The product is :$multiplication")

    val division:Int=num1/num2
    println("The quotient is :$division")

    val modulus:Int=num1%num2
    println("The modulus is :$modulus")

    val principal=100
    val rate=5
    val year=2


    val simpleInterest:Int=(principal*rate*year/100)
    println("The simple interest is :$simpleInterest")

    val weight=70.5
    val height=1.75

    val BMI:Double=weight/(height*height)
    println("The BMI is :$BMI")

}