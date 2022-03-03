package structured

fun main(args: Array<String>) {
    var a:String
    var b:String
    var c:Int
    var d:Double
    a = "100"
    b = "200"
    println(a + b)
    c = a.toInt()
    d = b.toDouble()
    println(c + d)
    var total = c + d
    println("%.2f".format(total))

}