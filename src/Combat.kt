import Player.Player

class Combat() {

    fun combatEncountered(playerCharacter: Player, enemy: Enemies.EnemyBase){
        println("You have encountered ${enemy.enemyName}. what do you do?")
        calculateCombat(playerOutput(playerCharacter), enemy.attackOutput())
    }

    //TODO make an array in player character that uses a combination of weapons and players role. Magical effects and special skills that is granted by conditions. ie. being a rogue and high stealth along with a dagger gives the backstab if not noticed by the enemy

    fun playerOutput(playerCharacter: Player): String {
        println("1.Attack \n 2.Feint \n 3.Counter")

        when(readLine().toString()){
            "attack", "Attack", "1" -> return "attack"
            "feint", "Feint", "2" -> return "feint"
            "counter", "Counter", "3" -> return "counter"
            else -> "Please input either a number or check your spelling. \n ${playerOutput(playerCharacter)}"
        }
        return "Error 1029"
    }

    fun calculateCombat(playersAttack: String, enemiesAttack: String){

        if(playersAttack == "attack" && enemiesAttack == "attack"){
            println("You both swing at each other and collide on your weapons.")
        }else if(playersAttack == "attack" && enemiesAttack == "feint"){
            println("He goes in to feint you but you land a hit before he can get it out.")
        }else if(playersAttack == "attack" && enemiesAttack == "counter"){
            println("You go in for an attack but he blocks and counters it, landing a successful hit.")
        }else if(playersAttack == "feint" && enemiesAttack == "attack"){
            println("You try to feint an block but he goes straight for an attack and gets a hit on you.")
        }else if(playersAttack == "feint" && enemiesAttack == "feint"){
            println("Both of you feint each other and collide into the others weapon")
        }else if (playersAttack == "feint" && enemiesAttack == "counter"){
            println("He tries to block your first attack but you feint it and go from a vulnerable area, landing the hit")
        }else if(playersAttack == "counter" && enemiesAttack == "attack"){
            println("You successfully block his attack and then counter him immediately!")
        }else if(playersAttack == "counter" && enemiesAttack == "feint"){
            println("You try to block his oncoming attack but he hits you with a feint.")
        }else if (playersAttack == "counter" && enemiesAttack == "counter"){
            println("Both of you stand there waiting for the other to attack...awkward.")
        }else { println("Error 5019" + playersAttack)}
    }

}