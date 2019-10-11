package com.alexqueudot.helloworld

/**
 * Created by alex on 2019-10-04.
 */

data class JokeList(
    var jokes: ArrayList<JokeModel>?
)

data class JokeModel(
    var text: String?,
    var question: String? = null,
    var answer: String? = null,
    var author: String? = null
)