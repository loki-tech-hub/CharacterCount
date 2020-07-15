package org.example

class string(string:String)
{
    private var str:String = ""
    private var count:Int = 0
    init
    {
        str = string
    }
    fun charactercounter ()
    {
        for (c in str)
        {
            count++
        }
    }
    fun getcount():Int
    {
        return count
    }
}

fun main()
{
    println("Enter a String")
    val str = string(readLine().toString())
    str.charactercounter()
    println("character count is ${str.getcount()}")
}