package com.sadabmostafa.diceroller
import org.junit.Test
import org.junit.Assert.*
class ExampleUnitTest {
    private val dice = Dice(6)
    private val rollResult = dice.roll()
    private val utility = Utility()
    @Test
    fun check_result_of_the_game(){
        assertEquals("The value of result is working perfect",true,utility.checkResult(5,5))
        assertEquals("The value of result is working perfect",false,utility.checkResult(5,6))
    }
    @Test
    fun find_occurance() {
        val occurrence=utility.stringLenCalculator("hello, Its an elephant","e");
        assertEquals("The occurrence of the given char is right", 3,occurrence)
    }
    @Test
    fun find_index() {
        val occurrence=utility.findIndex("hello","l");
        assertEquals("The index of the given char is right", 3,occurrence)
    }
    @Test
    fun removalOfChar(){
        val occurrence=utility.removeChar("hello","l");
        assertEquals("The index of the given char is right", "heo",occurrence)
    }
    @Test
    fun generates_number_outOfRange(){
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 10..60)
    }
}