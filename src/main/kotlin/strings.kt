fun main(){
    var text="Hello world"
    var school="eMobilis"
    var day="It's a 'Saturday'" //never use a double quote inside a doule quote`
    println(text[0]) //Accessing an element
    println(text[10])
    println(text.indexOf('H'))
    println(text.indexOf("world"))

    println(text.toUpperCase())

    println(text+" "+school) //Concatenation
    println(text.plus(school))
    println(text+" I study at "+school)
    println("I study at $school") //String interpolation
}