class Animal(var color:String,var mysize:Int){
    var colour="white"
    var size=34

    fun eat(){
        println("It is eating")
    }
    fun sleep(name:String){
        println("It is $name")
    }
    fun woof(){
        println("Woofing")
    }
}
fun main(){
    var a=Animal("white",34)
    var f=Animal("brown",56)
    f.sleep("Fish")
    var l=Animal("White",67)
    l.sleep("Leopard")
}