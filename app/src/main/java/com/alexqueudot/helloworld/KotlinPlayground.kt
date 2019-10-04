package com.alexqueudot.helloworld

import kotlin.random.Random

/**
 * Created by alex on 2019-10-04.
 */


class KotlinPlayground {

    val classText: String = "someText"
    var nullableClassInt: Int? = null

    fun main() {
        // Immutability
        var mutable = ""
        mutable = "Hello"

        val immutable = ""
        //immutable = "NOPE"

        // Types
        var text: String
        var number: Int
        val logic: Boolean

        // Lists
        var arrayList: ArrayList<String> = arrayListOf("text1", "text2")
        val list: List<String> = listOf("text1", "text2")

        // Operators
        val condition = false
        if (condition) {
            // Do something
        } else {
            // Do something else
        }

        // Loops
        for (item in arrayList) {
            println(item) // Prints to console
        }

        // Functions
        var random = randomNumber()
        val random2 = randomNumber(1, 5)


        // Nullables
        var nullable: Int? = null
        nullable?.toBigDecimal()

        // Example
        // Get from Database
        val user = User("Alex", null)
        // Provide default value
        val userList = user.username?.toList() ?: listOf("nothing")
        userList?.indexOf('l')
        userList.indexOf('t')

        // Let / Else
        user.username?.let { username ->
            println("username is $username")
        } ?: run {
            // Username is null
        }

        // Nullables in functions
        //randomNumber(from = 0, to = user.points) // Requires Int (not Int?)
        // 1 - Default Value
        randomNumber(from = 0, to = user.points ?: 0)
        // 2 - Unbox (let)
        user.points?.let {
            randomNumber(from = 0, to = it)
        }
        // 3 - Force unbox [Don't use]
        randomNumber(from = 0, to = user.points!!) // points is null -> CRASH!
    }


    /*
    Returns a random Number
     */
    fun randomNumber(): Int {
        return Math.random().toInt()
    }

    fun randomNumber(from: Int, to: Int, fake: Boolean = false): Int {
        if (fake) {
            return 2
        }
        return Random.nextInt(from = from, until = to)
        // from:
    }


}


data class User(val username: String?, val points: Int?): GameEntity(points) {
    // Class Init
    init {

    }

    // Secondary Constructor
    constructor() : this(username = "", points = 1) {
        // Do some work
    }

    public fun publicFunction() {

    }

    private fun privateFunction() {
        username // Class Variable
        // points // Constructor only
    }
}

// Can be sub-classed
open class GameEntity(points: Int?)