package structured

import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter username")
    var username = chukua.next()
    println("Enter password")
    var password = chukua.next()

    userCheck(username, password)

}
fun userCheck(username:String,password:String){  if (username.equals("eMobilis") && password.equals("eMobilis@123")){
        //Calculate the bmi
    var chukua = Scanner(System.`in`)
    println("Enter weight")
    var weight = chukua.nextDouble()
    println("Enter height")
    var height = chukua.nextDouble()
        bmi(weight, height)
    }else{
        println("Wrong username or password")
    }
}
fun bmi(weight:Double, height:Double){
    var bmi = weight/Math.pow(height,2.0)
    if (bmi < 18){
        println("Underweight")
    }else if (bmi < 24.9){
        println("Normal weight")
    }else if (bmi < 34.9){
        println("Overweight")
    }else{
        println("Obese")
    }
}





