import Player.Player
import Player.NavigationAndMenus
import Enemies.Goblin

fun main(arg: Array<String>){

    //TODO Make combat more procedural
    //Declares and initializes variables
    val combatTest: Combat = Combat()
    val log: Dialogue = Dialogue(Player)
    val goblin: Goblin = Goblin(2)
    val navAndMenu: NavigationAndMenus = NavigationAndMenus()


    log.playDialogue()
    Player.selectRole()
    println(Player.getPlayerRole().roleName)
    Player.setName()

    log.playDialogue3()
    navAndMenu.playerNavigationAndControl()
    //TODO give player full control of actions by using the NavigationAndMenus Class.
}