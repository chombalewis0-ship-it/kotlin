fun main(){
    // when statement-used when you don't want to write too many if eld=se statements

    var marks=100

    when(marks){
        in 1..30->println("Below average")
        in 31..50->println("Average")
        in 51..70->println("Above Average")
        in 71..100->println("You passed")

        else->println("Invalid marks")
    }

    val day=4
    val results=when(day){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else->"Invalud day."
    }

    println(results)
}