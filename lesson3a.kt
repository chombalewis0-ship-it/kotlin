fun main(){
    // for loops-This is used to execute a block of code for a certain number of times

    for(number in 1..10){
        println(number)
    }

    println("...")

    for(number in 20..50){
        println(number)
    }

    println("...")

    for(counter in 30..40){
        println("The counter is $counter")
    }

    println("....")


    for(number in 50..70 step 2){
        println("The number is $number")
    }

    println("...")

    for(value in 10..100 step 10){
        println("The value is $value")
    }

    println("...")

    for(y in 10 downTo 1){
        println("Y is $y")
    }

    println(">>")

    for(x in 20 downTo 5){
        println("x is $x")
    }

}