fun main(){
    letters()
    fizzBuzz()

}
fun letters(){
    for (letters in 'A'..'Z'){
        println(letters)
    }
}


fun fizzBuzz(){
  var number=9
  

  if (number%5==0 && number%3==0){
    println("FizzBuzz")

  }

  else if(number%5==0){
    println("Fizz")

  }

  else if(number%3==0){
    println("Buzz")

  }

  else{
    println("Invalid number")
  }




  }



