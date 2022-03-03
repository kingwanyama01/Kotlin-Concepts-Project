package structured

fun main(args: Array<String>) {
    var names = arrayOf("King","Tom","Purity","Ian","Jasmin")
    println(names[2])
    for (name in names){
        println(name)
    }
    if ("Tom" in names){
        println("Tom is here")
    }
}