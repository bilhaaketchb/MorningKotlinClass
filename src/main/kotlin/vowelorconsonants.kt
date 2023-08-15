import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter the letters: ")
    var letters=reader.next().single()

    if (letters=='a'|| letters=='e'||letters=='i'||letters=='o'||letters=='u') {
        println("letter is vowel")
    }
    else{
        println("letter is consonants")
    }
}
// || means or
// write a program that culculates the area of a rectangle