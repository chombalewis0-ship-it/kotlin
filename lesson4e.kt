fun main(){
    // A function that  print a number  n and print all numbers from N downwards

    numbers(20)
    numbers2(15)



}

fun numbers(N:Int){
    var number=N
    while (number>=0){
        println(number)
        number--
    }

println(".........")

}


fun numbers2(N:Int){
    for (number in N downTo 0){
        println(number)
    }
}