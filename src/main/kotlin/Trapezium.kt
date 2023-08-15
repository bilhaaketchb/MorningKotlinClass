import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter side1: ")
    var side1=reader.nextDouble()

    println("Enter side2: ")
    var side2=reader.nextDouble()

    println("Enter height: ")
    var height=reader.nextDouble()

    println("The area of sides of  trapezium are defined as $side1, $side2, $height")
    var myResult=(height/2 * (side1+side2));
    println("The area of squire is: $myResult")
}