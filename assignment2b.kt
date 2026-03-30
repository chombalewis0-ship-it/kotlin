fun main(){
    val points=-1200

    if (points>0 && points<=100)
    println("you do not qualify")

    else if(points>100 && points<=400)
    println("You win a smartphone")

    else if(points>400 && points<=1000)
    println("You Win a laptop")

    else if(points>1000)
    println("You Win a Trip to Canada")

    else{
    println("Invalid points")

    }
}