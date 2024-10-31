package com.njoguamos.recipe

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform