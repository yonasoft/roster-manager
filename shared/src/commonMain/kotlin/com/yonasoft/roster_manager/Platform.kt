package com.yonasoft.roster_manager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform