package org.example

class Board(private val height : Int, private val width : Int) {
    var tiles = mutableListOf<MutableList<Tile>>()

    init{
        for (i in 1..height){
            val row = mutableListOf<Tile>()
            for (j in 1..width){
                row.add(Tile())
            }
            tiles.add(row)
        }
    }

    fun getTotalTiles(): Int {
        return tiles.size * tiles[0].size;

    }

    fun getTile(x: Int, y: Int): Tile {
        return tiles[x-1][y-1]
    }

    fun addUnit(unit: Unit, x: Int, y: Int) {
        val tile = getTile(x,y)
        tile.addUnit(unit)
    }

    fun removeUnit(unit: Unit, x: Int, y: Int){
        val tile = getTile(x,y)
        tile.removeUnit(unit)
    }

    fun removeUnits(x: Int, y: Int) {
        val tile = getTile(x,y)
        tile.units.clear()
    }

    fun getUnits(x: Int, y: Int): List<Unit> {
        return getTile(2,2).units
    }

}
