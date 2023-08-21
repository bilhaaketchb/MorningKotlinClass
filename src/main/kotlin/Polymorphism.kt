//Parent class
open class Shapes{
    open fun draw(){
        println("It is a shape")
    }
}
//Child class
class Rectangle1:Shapes(){
    override fun draw(){
        println("Rectangle")
    }
}
class Square:Shapes(){
    override fun draw() {
        println("Square")
    }
}fun main(){
    var r=Rectangle1()
    r.draw()

    var s=Square()
    s.draw()

    var shapes=Shapes()
    shapes.draw()
}