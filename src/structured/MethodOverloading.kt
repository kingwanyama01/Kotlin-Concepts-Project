package structured

fun main(args: Array<String>) {
    average("King",100.0,200,300.0)
    average(10,30,34)
}
fun average(x:Double,y:Int,z:Double){
    var average = (x + y + z)/3.0
    println("Your average is $average")
}
fun average(name:String,x:Double,y:Int,z:Double){
    var average = (x + y + z)/3.0
    println("Hey $name Your average is $average")
}
fun average(x:Int,y:Int,z:Int){
    var average = (x + y + z)/3.0
    println("Your average is $average")
}