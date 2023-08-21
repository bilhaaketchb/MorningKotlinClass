class Person{
    //Attributes/Property/Variable
    var name="Bilha"
    var skintone="lightskin"
    var age=45

    //Method/Function
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }
    fun type(){
        println("Typing")
    }

}
fun main(){
    //object1
    var teacher=Person()
    println(teacher.age)

    teacher.walk()

    //object2
    var accountant=Person()
    println(accountant.name)

    accountant.type()
}