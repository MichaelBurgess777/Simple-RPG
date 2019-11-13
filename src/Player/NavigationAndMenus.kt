package Player

import Player.Player.getInventory

class NavigationAndMenus(val playerClass: Player = Player) {

    //the player has the ability to access his menus or move through this function
    fun playerNavigationAndControl(){
        when(readLine()){
            "Menu", "menu" -> menu()
        }
    }

    //Prompts the player with their own little "Pause Menu" and they are able to use it to access in game knowledge
    private fun menu(){
        println("\n\n\n[inventory][map][quests][skills]")
        when(readLine()){
            "inventory", "i", "I", "Inventory" -> inventory()
            "map", "M", "m", "Map" -> map()
            "quests", "q", "Q", "Quests" -> quests()
            "skills", "s", "S", "Skills" -> skills()
        }
    }

    //TODO Make a functional inventory menu (Check if item in list is consumables, display names, use and equip)
    private fun inventory(){
        for (i in Player.getInventory().indices){
            println(
            Player.getInventory()[i].name
            )
        }

        //Stores 2 variables from user input. The first variable is to see if the player is using or studying the item. The second is the item that the player is doing something with.
        val (a, b) = readLine()!!.split(' ')

        //We are then checking what the player wants to do with that item
        when(a.toUpperCase()){
            "USE" -> useItem(b)
            }
        }
    }

    //We then see what Item is being used.
    private fun useItem(item: String){
        for (i in Player.getInventory().indices){
            if (item.toUpperCase() == Player.getInventory()[i].name.toUpperCase()){
                println("\n\n\nYou have used the ${Player.getInventory()[i].name.capitalize()}")
            }
        }
    }

    //TODO Have the map function get the current location and displays the map with: /, _, \, |, (, etc
    private fun map(){

    }

    //TODO Make a quests class that contains variables such as: quest Giver, Location, Description, and title. Have this function display those variables in the quest menu.
    private fun quests(){

    }

    //TODO Have this display the players skills and allow them to read descriptions.
    private fun skills(){

    }
