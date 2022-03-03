package oop

class User {
    var name:String
    var email:String
    var password:String
    var repeatPassword:String

    constructor(name: String, email: String, password: String, repeatPassword: String) {
        this.name = name
        this.email = email
        this.password = password
        this.repeatPassword = repeatPassword
    }
    fun login(){
        if (!password.equals(repeatPassword)){
            println("Passwords don\'t match")
        }else if (password.length < 4){
            println("Password must be more than 3 characters")
        }else if (email.equals("king@gmail.com") && password.equals("king")){
            println("Welcome home $name")
        }else{
            println("Wrong username or password")
        }
    }

    fun register(){
        println("Registered $name using email $email and password $password")
    }
}

fun main(args: Array<String>) {
    var userOne = User("King","king@gmail.com",
                        "king","king")
    var userTwo = User("King","king@gmail.com",
                        "king","king123")
    var userThree = User("Purity","purity@gmail.com",
        "purity","purity")

    userOne.login()
    userTwo.login()
    userThree.login()
    userOne.register()
}









