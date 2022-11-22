open class Dog{
    open fun say_hi(){
        println("Wow wow")
    }
}

class Terrier : Dog(){
    override fun say_hi(){
        println("wif wif")
    }
}

fun main(){
    val dog: Dog = Terrier()
    dog.say_hi()
}
