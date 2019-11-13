package Player
import Items.ItemBase
import Items.Rope
import Items.Weapons.RustyDagger
import Items.Weapons.WeaponsBase
import Roles.RoleBase
import Roles.Warrior

object Player {

    //Declaring and initializing player variables
    private var name: String = "Chosen"
    private var age: Int = 27
    private var roleInput: String = "warrior"
    private var roleClass: RoleBase = Warrior()
    private var location: String = "Grand Oak Tree"
    private var inventory: Array<ItemBase> = arrayOf(RustyDagger(), Rope())

    //Prompts the player to select a role and then goes through what they put in and assigns a role to the roleclass variable
    fun selectRole(){
        println("Select your role \n 1.Warrior")
        Player.roleInput = readLine().toString()

        when(roleInput){
            "warrior","Warrior","1" -> roleClass = Warrior()
            else -> selectRole()
        }
    }

    //Prompts the player to input a name that is then stored in the name variable
    fun setName(){
        println("What's your name?")
        name = readLine().toString()
        println("Are you sure you want $name as your name? Y/N")
        if (readLine().toString() == "N" || readLine().toString() == "n"){
            setName()
        }

    }

    //Gets and returns the "name" variable
    fun getPlayerName(): String{
        return name
    }

    //Gets and returns the "age" variable
    fun getPlayerAge(): Int{
        return age
    }

    //gets and returns the "roleClass" variable
    fun getPlayerRole(): RoleBase{
        return roleClass
    }

    //Gets all the items in the players inventory
    fun getInventory(): Array<ItemBase>{
        return inventory
    }


}