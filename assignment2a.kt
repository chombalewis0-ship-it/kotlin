// Using the if statements or when statement, create a program to find if give year is leap or not

fun main(){
    val year=2020
     if (year%4==0){
        println("It's a leap year")

     }

     else{
        println("Not a leap year ")
     }


     val year=2020
     when (year%4){
        0->println("$year is  leap")
        else->println("$year is not a leap")
     }



     

     
}

