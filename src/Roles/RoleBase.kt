package Roles
import Items.Weapons.WeaponsBase

abstract class RoleBase() {

    abstract val roleName: String
    abstract var isMagicUser: Boolean
    abstract var level: Int
    abstract var xp: Int
    abstract var hp: Int
    abstract var maxHP: Int
    abstract var weaponProf: Array<WeaponsBase>
}