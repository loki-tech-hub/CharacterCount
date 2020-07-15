package org.example

import org.junit.Test

import org.junit.Assert.*

class stringTest {

    @Test
    fun testCount() {
        val str = string("lokesh")
        str.charactercounter()
        assert(str.getcount() == 6)
    }

    @Test
    fun testCount1() {
        val str = string("")
        str.charactercounter()
        assert(str.getcount() == 0)
    }
    @Test
    fun testCount2() {
        val str = string("test")
        str.charactercounter()
        assert(str.getcount() == 4)
    }




}