package Enemies

import Items.Weapons.WeaponsBase
import kotlin.random.Random

abstract class EnemyBase() {

    abstract val enemyName: String
    abstract var currentHP: Int
    abstract var maxHP: Int
    abstract var weapons: Array<WeaponsBase>

    fun takeDamage(dam: Int){
        currentHP - dam
    }

    open fun attackOutput(): String{

        return when((1..3).random()){
            1 -> "attacks"
            2 -> "feint"
            3 -> "counters"
            else -> "Error 9801"
        }
    }
}