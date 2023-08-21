open class Employee1{
    fun name(){
        println("Bilha")
    }
    fun age(){
        println(40)
    }
    fun salary(){
        println(150000)
    }
}
class WebDeveloper:Employee1(){
    fun website(){
        println("Ecommerce")
    }
}
class AndroidDeveloper:Employee1(){
    fun Android(){
        println("My first app")
    }
}
class iosDeveloper:Employee1(){
    fun iosDeveloper(){
        println("Just print")
    }
}
fun main(){
    var w=WebDeveloper()
    w.salary()

    var a=AndroidDeveloper()
    a.age()

    var i=iosDeveloper()
    i.name()
}