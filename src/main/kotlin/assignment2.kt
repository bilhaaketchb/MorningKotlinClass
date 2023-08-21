import java.util.Scanner
 fun main() {
     var reader = Scanner(System.`in`)

     println("Enter the first number: ")
     var letters=reader.next().single()

     println("Enter the first operators")
     var operators=reader.next().single()

     if (operators == '+' || operators == '-' || operators == '*' || operators == '/') {
         println("operators are valid")
     }
     else{
         println("operators are invalid")

     }
 }

