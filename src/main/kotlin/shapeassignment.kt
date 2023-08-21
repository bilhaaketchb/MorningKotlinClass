//Parent class
open class Shape{
    fun area(){
        println("squared")
    }
    fun circumference(){
        println("pyrsquared")
    }
}
//child class
class Rectangle:Shape(){
    fun lenghth() {
        println("length,breath")
    }
}
class Circle:Shape(){
    fun radius(){
        println("radius")
    }
}
fun main(){
    var b=Rectangle()
    b.area()

     var c=Circle()
    c.radius()
}
