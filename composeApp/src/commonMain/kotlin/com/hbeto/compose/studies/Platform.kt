package com.hbeto.compose.studies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform