package com.sadabmostafa.diceroller
import org.junit.Test
import org.junit.Assert.*
class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
    @Test
    fun generates_number_outOfRange(){
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 10..60)
    }
    @Test
    fun check_result_of_the_game(){
        val utility = Utility()
        val result = utility.checkResult(5,5)
        assertEquals("The value of result is working perfect", result,true)
        val result_false = utility.checkResult(5,6)
        assertEquals("The value of result is working perfect", result_false,false)

    }s
    @Test
    fun find_occurance() {
        val utility = Utility()
        val occurrence=utility.stringLenCalculator("hello, Its an elephant","e");
        assertEquals("The occurrence of the given char is right", occurrence,3)
    }
    @Test
    fun find_index() {
        val utility = Utility()
        val occurrence=utility.findIndex("hello","l");
        assertEquals("The index of the given char is right", occurrence,3)
    }


}