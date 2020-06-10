package com.nodir

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RunProject
fun main(args: Array<String>) {
    runApplication<RunProject>(*args)
}

