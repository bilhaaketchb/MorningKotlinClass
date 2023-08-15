import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the first number: ")
    var fnumber=reader.nextInt()

    println("Enter the second number: ")
    var snumber=reader.nextInt()

    var quotients=fnumber/snumber
    var modulus=fnumber%snumber
    println("The quotient of the two numbers is $quotients. The remainder after dividing fnumber and snumber is $modulus")
}