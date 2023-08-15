import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the year: ")
    var year=reader.nextInt()

    if (year%4==0){
        println("Year is leap")
    }
    else{
        println("Year is not")
    }
}