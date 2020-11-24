fun main(args: Array<String>) {
    //create variable to track player's karma
    var karma = 0

    //Set up the player's current situation
    println("You need the key.")
    println("She has the key.")
    println("If you can't get the key, you're as good as dead.")
    println("The girl is in front of you.")
    println("How will you get the key?")
    println("1 = Use Force; 2 = Ask for the Key")

    //Choose from list of options with when to set variable
    val choice1 = readLine() ?:""
    val path1 = when(choice1) {
        "1" -> "Force"
        "2" -> "Finesse"
        else -> println("Error.")
    }

    //Use conditionals to begin the player's path

    //PATH 1 : NEGATIVE
    if (path1 == "Force")
    {
        karma--
        println("You've chosen $path1")
        println("You push the girl to the ground and steal her purse")
        println("You check her purse and find the key.")
        println("You go to the door that the key unlocks.")
        println("You use the key to open the door.")
        println("On the other side, there is a man in a suit.")
        println("The man congratulates you on opening the door.")
        println("He asks if you would like a drink, to  celebrate.")

        //ask a true/false questions. Use if/else to store variable
        println("Yes = Take Drink; No = Refuse")
        val choice2 = readLine()
        val path2: String

        //PATH 2 : POSITIVE
        if(choice2 == "Yes") {
            path2 = "Polite"

            println("You take a drink.")
            println("You begin to feel drowsy.")
            println("...")
            println("You wake up in a dark room, bound at the hands and feet.")
            println("A person is brought into the room.")
            println("A voice says: kill the prisoner and you will be free")
            println("1 = Refuse; 2 = Kill")

            val choice3 = readLine()
            val path3: String

            //Final karma increment
            if (choice3 == "1")
            {
                karma++

            }

            //Final karma increment
            else if (choice3 == "2")
            {
                karma--
            }

            //ERROR STATEMENT
            else
            {
                println("Error.")
            }
        }
        //PATH 2 : NEGATIVE
        else if(choice2 == "No"){
            path2 = "Rude"

            println("The man attacks you with the glass he would have poured for you.")
            println("You avoid his first blow and grab the glass from his hand.")
            println("You can choose to kill the man or have mercy.")
            println("1 = Mercy; 2 = Kill")

            val choice3 = readLine()

            //Final karma increment
            if (choice3 == "1")
            {
                karma++
            }

            else if (choice3 == "2")
            {
                karma--
            }

            else
            {
                println("Error")
            }
        }

        //ERROR STATEMENT
        else {
            println("Error.")
        }
    }

    //PATH 1 : NEGATIVE
    else if (path1 == "Finesse")
    {
        karma++
        println("You ask the girl for the key.")
        println("The girl looks around, as if she's being watched.")
        println("She tells you that you have to come with her.")
        println("'What about the key?' you ask.")
        println("'There is no key'")
        println("The girl brings you to her grandmother's house.")
        println("She says you will be safe there.")
        println("You hear a ruckus in the home.")
        println("'Oh no they're here!'")
        println("You burst into the home and see there are men in suits,")
        println("handcuffing an elderly woman.")
        println("1 = Intervene; 2 = Run")

        val choice2 = readLine()

        //PATH 2 : POSITIVE
        if(choice2 == "1")
        {
            karma++

            println("You notice there are white trucks outside the house.")
            println("They still have the keys inside them (they must belong to the men in the suits.)")
            println("You and the girl drive quickly towards the men, who flee to avoid getting hit.")
            println("You tell grandma and the girl to get in your car.")
            println("You drive far away to a vacant spot and ask if grandma is okay.")
            println("She tells you that she has been poisoned and will die in agony in a few hours.")
            println("She asks you for a merciful end.")
            println("1 = Mercykill; 2 = Refuse")

            val choice3 = readLine()

            //Final karma increment
            if (choice3 == "1")
            {
                karma++
            }

            else if (choice3 == "2")
            {
                karma--
            }

            //Error message
            else
            {
                println("Error")
            }
        }

        //PATH 2 : NEGATIVE
        else if(choice2 == "2")
        {
            karma--

            println("You run as fast and far as you can.")
            println("You've found a spot where you're alone.")
            println("Out of nowhere, 4 white vans pull up.")
            println("You believe this is your end, these are the men who told you about the key.")
            println("The men tell you that you have two choices: ")
            println("Tell them what the girl looks like or die.")
            println("1 = Tell; 2 = Die")

            val choice3 = readLine()
            if (choice3 == "1")
            {
                karma--
            }

            else if (choice3 == "2")
            {
                karma++
            }

            else
            {
                println("Error.")
            }
        }

        //ERROR STATEMENT
        else
        {
            println("Error.")
        }

    }
    //ALTERNATE ENDINGS

    //when statement with range to set a variable
    val ending = when(karma)
    {
        in -3..-2 -> "Nightmare"
        in -1..0 -> "Bad"
        in 1..2 -> "Good"
        in 3..4 -> "Heavenly"
        else -> "Error"
    }
    //NIGHTMARE ENDING
    if(ending == "Nightmare")
    {
        println("Suddenly you begin feel woozy.")
        println("You're beginning to forget your own name.")
        println("1s and 0s... 1s and 0s whirl through your head.")
        println("You realize you are merely a line of code in a mediocre programming project.")
        println("You are transported somewhere new... you hear terrifying sounds.")
        println("It sounds like zombies are outside your door.")
        println("Oh no, you're now the main character in Left 4 Dead.")

        println("You finished with $karma karma! You're a bad person!")
    }
    //BAD ENDING
    else if (ending == "Bad")
    {
        println("Your vision goes black.")
        println("You wake up in a dark room, bound at the hands and feet.")
        println("The girl is in front of you.")
        println("She looks at you in disgust.")
        println("You plead with her for help.")
        println("'You had your chance' she replies. ")
        println("She leaves the room and closes the door.")
        println("Trapped in the darkness, unable to move.")
        println("This is your fate.")

        println("You finished with $karma karma! Let's hope you've never paid for a philosophy class!")
    }
    //GOOD ENDING
    else if(ending == "Good")
    {
        println("Everything goes black.")
        println("You wake up and see the girl.")
        println("She is armed and looks as if she's been fighting.")
        println("She looks at you and asks if you will fight the men in the suits with her.")
        println("How could you say no?")

        println("You finished with $karma karma! You're a good person!")
    }
    //HEAVENLY ENDING
    else
    {
        println("You suddenly realize you are a line of code in a mediocre Kotlin program.")
        println("You smile, because you.isHappy() == true.")
        println("Your benevolent programmer just coded some money into your bank account.")
        println("Life is good!")

        println("You finished with $karma karma! You are a saint!")
    }

}