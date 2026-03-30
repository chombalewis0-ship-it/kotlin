fun main(){

    var myobject=circle()
    myobject.area()



}

class circle{
    var radius=5

    fun area(){
        var area=3.14*radius*radius
        println("The area of the circle is $area")
    }

 
}