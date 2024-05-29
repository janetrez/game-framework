import org.example.Board
import org.example.Unit
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BoardTest {

    @Test
    fun `should create a Board with given height and width`(){
        val board = Board(3,3)
        val tiles = board.getTotalTiles()
        assertEquals(9,tiles)
    }

    @Test
    fun `should return a Tile given its coordinates`(){
        val board = Board(3,3)
        val tile = board.getTile(2,3)
        assertEquals(board.tiles[1][2], tile)

    }

    @Test
    fun `should add a unit to the given coordinates`(){
        val board = Board(3,3)
        board.addUnit(Unit(),2,2)

        val tile = board.getTile(2,2)
        assertEquals(1,tile.units.size)
    }
    @Test
    fun `should remove a unit from the given coordinates`(){
        val board = Board(3,3)
        val unit1 = Unit()
        val unit2 = Unit()
        board.addUnit(unit1,2,2)
        board.addUnit(unit2,2,2)

        board.removeUnit(unit1,2,2)

        val tile = board.getTile(2,2)
        assertEquals(1,tile.units.size)
    }

    @Test
    fun `should remove all units from the given coordinates`(){
        val board = Board(3,3)
        val unit1 = Unit()
        val unit2 = Unit()
        board.addUnit(unit1,2,2)
        board.addUnit(unit2,2,2)

        board.removeUnits(2,2)

        val tile = board.getTile(2,2)
        assertEquals(0,tile.units.size)
    }

    @Test
    fun `should return all units from the given coordinates`(){
        val board = Board(3,3)
        val unit1 = Unit()
        val unit2 = Unit()
        board.addUnit(unit1,2,2)
        board.addUnit(unit2,2,2)

        val units = board.getUnits(2,2)
        assertEquals(2,units.size)
    }

}