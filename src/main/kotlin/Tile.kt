package org.example

class Tile {
    val units = mutableListOf<Unit>()

    fun addUnit(unit: Unit) {
        units.add(unit)
    }

    fun removeUnit(unit : Unit){
        units.remove(unit)
    }
}