fun main(){
    var myobject=Employee()
    myobject.manager()
    myobject.work()

}

 open class manager(){
    fun manager(){
        println("The manager can assign tasks to the employee")
    }


}

class Employee:manager(){

    fun work(){
        println("The employee can do any task assigned by the manager")
    }


}