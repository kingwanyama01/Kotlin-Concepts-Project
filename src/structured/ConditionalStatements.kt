package structured

fun main(args: Array<String>) {
    //IF STATEMENTS
    var age = 10
    if (age < 18){
        println("Sorry, you are underage")
    }else{
        println("Welcome to the party")
    }
    var marks = 98
    if (marks < 40){
        println("E")
    }else if (marks < 50){
        println("D")
    }else if (marks < 60){
        println("C")
    }else if (marks < 70){
        println("B")
    }else{
        println("A")
    }

    //WHEN STATEMENTS
    var bettingNumber = 3
    when(bettingNumber){
        1->{
            println("Ooops!!! You have lost!!!")
        }
        2->{
            println("Ooops!!! You have lost!!!")
        }
        3->{
            println("Congratulations!!! You won!!!")
        }
        else->{
            println("Enter a number from 1 - 3 to bet")
        }
    }
}













