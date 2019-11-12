import Player.Player

class Dialogue(val playerClass: Player) {

    //The intro dialogue to the game.
    fun playDialogue() {
        println("\"Hey. Are you ok?\"\n\n " +
                "You wake up laying against an enormously large oak tree.\n\n" +
            "You look up to see an old man trying to get your attention.\n" +
                "\"Yes you! \n" +
                " I'm glad to see you're still breathing\"\n" +
            "you stand up too drowsy and confused to speak.\n" +
                "\"You know not everyone just passes out here...\"\n" +
            "\"But you're not from here are you? You mind telling me who you are?\"")
    }

    //The old man repeats the players name and asks them what got them into being their chosen class. Prompting the player to select a background.
    fun playDialogue2(){
        println("\"${playerClass.getPlayerName()}? Quite the name you have there. So what got you into being a ${playerClass.getPlayerRole().roleName}?\"")
    }

    //The old man asks the player to go forward into a goblin infested cave
    fun playDialogue3(){
        println("\"Wow your abilities are incredible.\"\n " +
                "\"Hey maybe you can help me. The only safe way out was closed off when I got here. I need help going through the goblin cave so that I can trade in these\n" +
                "at the town. Will you help me?\"\n " +
                "You stop to think about it for a second and then decide to help the old man with getting through the cave. You need to anyways" +
                "\"Oh thank you so much ${playerClass.getPlayerName()}.\"\n" +
                "He takes you through the valley towards a cave that steeply runs downhill. You might fall\n" +
                "!HINT: type \"menu\" and then \"inventory\" and then \"use [ITEM]\"")
    }
}