package Items.Weapons

import Items.ItemBase

abstract class WeaponsBase(name: String,
                           val equipText: String,
                           val damage: Int,
                           var isMagical: Boolean,
                           var magicalEffect: String): ItemBase(name, equipText) {}