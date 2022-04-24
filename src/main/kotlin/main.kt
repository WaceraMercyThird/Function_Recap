fun main(){
    println("Hello")
    myVal()
    con()
    myString()
    myconditions()
    col()
}
fun myVal(){
    val firstName: String = "Rahul"
    var weight: Int = 160
    val myVariable: Boolean = true
    println("My name is $firstName and I am very grade for weight which is $weight, be sure all of this is $myVariable")
    println(" ")
}
// concatenation
fun con(){
    val s1 = "Call me"
    val s2 = " may be"
    val combined = s1 + s2
    println(combined)
    val n1 = 9
    val n2 = 4
    val result = n1 % n2
    println(result)
    println(" ")

}

// strings
fun myString(){
    val subject = "Kotlin"
    println(subject[0].toString()+ subject[2]+ subject[4])
    println(subject[1])
    println(subject.isEmpty())
    println(subject.length)
    println(subject.substring(2, 4))
    // string interporation
   println("I take a subject called $subject")
    println(" ")
}
// conditions
fun myconditions(){
    var examScore = 88
    if (examScore > 70){
        println("You failed")
    }else{
        println("You Passed!")
    }
    println(" ")
}
// collection in arrays
fun col(){
//    val name = "Maggy"
//    val name2 = "Janet Adams"
//    val name3 = "Cisco"
    // immutable
    val names = listOf("maggy", "janet Adams", "cisco")
    println(names)
    println(" ")
    names.forEach{name ->
        println(name)
        println(name.capitalize())
        println(name.uppercase())
        println(name.length)
        println(" ")

    }
    println(" ")
    for (x in 1..5){
        println(x)
    }
    println(" ")
    for (x in 1 until 5){
        println(x)
    }
    println(" ")
    // mutable list
    val names2 = mutableListOf("Maggy", "Janet Adams", "Cisco")
    names2.add("Kendra")
    println(names2)
    names2.add(1,"Missy")
    println(names2)
}
