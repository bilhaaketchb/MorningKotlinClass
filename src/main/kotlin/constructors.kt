class Dog( var breed:String, var color:String) {


    fun main() {
        var c = Dog("Chiwawa", "White")
        println(c.breed)

        var d = Dog("Siberian Husky", "Brown")
        println(d.color)

    }
}
    class Employee(var jobdescription: String, var salary: Double, var yearsofexperience: Int, var age: Int){}


    fun main() {
        var a = Employee("Manager", 250000.00, 5, 30)
        println(a.jobdescription)

        var b = Employee("Secretary", 45000.00, 7, 25)
        println(b.jobdescription)
    }


