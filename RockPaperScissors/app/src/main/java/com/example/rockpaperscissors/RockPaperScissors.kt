package com.example.rockpaperscissors

fun main(){


    var computerChoice=""
    var playerChoice=""
    println("Rock,Paper and Scissors ? Enter your choice")
    playerChoice=readln()

    val randomNumber=(1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice="rock"
        }
        2 -> {
            computerChoice="paper"
        }
        3 -> {
            computerChoice="scissors"
        }
    }
    println(computerChoice)

    val winner = when{
        playerChoice==computerChoice -> "Tie"
        playerChoice=="rock" && computerChoice=="scissors" -> "player"
        playerChoice=="paper" && computerChoice=="rock" -> "player"
        playerChoice=="scissors" && computerChoice=="paper" -> "player"
        else -> "computer"

    }

    if(winner=="Tie"){
        println("It's a tie!")
    }
    else{
        println("$winner won!")
    }












}
