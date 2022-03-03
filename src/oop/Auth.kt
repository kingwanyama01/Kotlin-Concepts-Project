package oop

import java.util.*

class Auth {
    var email:String
    var password:String
    constructor(email: String, password: String) {
        this.email = email
        this.password = password
    }
    fun register(){
        if (password.length < 4){
            println("The password must have 4 or more characters")
        }else{
            println("Registerd with emai> $email and password: $password")
        }
    }
    fun login(){
        if (email.equals("king@gmail.com") && password.equals("king@123")){
            //Proceed to calculate BMI from a different class
            var chukua = Scanner(System.`in`)
            println("Enter weight")
            var weight = chukua.nextDouble()
            println("Enter height")
            var height = chukua.nextDouble()
            var bmicalc = Bmicalc(weight, height)
            bmicalc.bmi()
        }else{
            println("Wrong username or password")
        }
    }
}

class Bmicalc{
    var weight:Double
    var height:Double

    constructor(weight: Double, height: Double) {
        this.weight = weight
        this.height = height
    }
    fun bmi(){
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
}
fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter email")
    var email = chukua.next()
    println("Enter password")
    var password = chukua.next()
    var userOne = Auth(email, password)
    userOne.login()
}





