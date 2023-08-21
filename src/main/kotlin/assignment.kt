import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the first number: ")
    var fnumber=reader.nextInt()

    println("Enter the second number: ")
    var snumber=reader.nextInt()

    var sum=fnumber+snumber
    println("The sum of the two numbers is $sum")

    var subtraction=fnumber-snumber
    println("The subtraction of the two numbers is $subtraction")

    var product=fnumber*snumber
    println("The product of the two numbers is $product")

    var division=fnumber/snumber
    println("The division of the two numbers is $division")


}