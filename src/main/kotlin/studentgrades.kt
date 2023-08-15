import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first grade: ")
    var fgrade=reader.nextDouble()

    println("Enter second grade: ")
    var sgrade=reader.nextDouble()

    println("Enter third grade: ")
    var tgrade=reader.nextDouble()

    if(fgrade>sgrade && fgrade>tgrade){
        println("$fgrade  with 71-80 marks is A")
    }
    else if(sgrade>fgrade && sgrade>tgrade){
        println("$sgrade  with 61-70 marks is B")
    }
    else{
        println("$tgrade with 51-60 marks is C")
    }
}