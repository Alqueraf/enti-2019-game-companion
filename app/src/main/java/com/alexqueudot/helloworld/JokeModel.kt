package com.alexqueudot.helloworld

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

/**
 * Created by alex on 2019-10-04.
 */

@Serializable
data class JokeList(
    val jokes: ArrayList<JokeModel>?
)

@Serializable
data class JokeModel(
    @Transient val text: String? = null,
    @Transient val question: String? = null,
    @Transient val answer: String? = null,
    @Transient val author: String? = null
)