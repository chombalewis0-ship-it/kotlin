fun main(){

    var myobject=square()
    myobject.area()
    myobject.perimeter()
    


}

class square{
    var side=5
    var width=5

    fun area(){
        var area=side*width
        println("The area of the square is $area")
    }

    fun perimeter(){
        var perimeter=2*(side+width)
        println("The perimeter of the square is $perimeter")
    }

}