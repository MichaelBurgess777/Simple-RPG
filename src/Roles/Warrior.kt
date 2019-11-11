package Roles

import Items.Weapons.WeaponsBase

class Warrior: RoleBase() {

    override val roleName: String = "Warrior"
    override var isMagicUser: Boolean = false
    override var level: Int = 1
    override var xp: Int = 0
    override var hp: Int = 20
    override var maxHP: Int = 20
    override var weaponProf: Array<WeaponsBase> = arrayOf()
}