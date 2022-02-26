package ru.vadlit.infoprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InfoProviderApplication

fun main(args: Array<String>) {
    runApplication<InfoProviderApplication>(*args)
}
