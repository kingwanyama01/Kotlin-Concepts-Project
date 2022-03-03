package oop

abstract class FirstClass(open var name:String, open var age:Int) {
    abstract fun motto()
    abstract fun mission()
}
class SecondClass(override var name:String,
                  override var age:Int):FirstClass(name, age){
    override fun motto() {
        println("Education is the key to success")
    }
    override fun mission() {
        println("To educate the world")
    }
}
class ThirdClass(override var name:String,
                  override var age:Int):FirstClass(name, age){
    override fun motto() {
        println("Success is as a result of hard work")
    }
    override fun mission() {
        println("To nature the world through education")
    }
}
fun main(args: Array<String>) {
    var xyz = ThirdClass("King",100)
    xyz.motto()
}






