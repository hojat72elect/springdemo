package ca.on.hojat.springdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringdemoApplication {

    @GetMapping("/")
    fun hello() = listOf("Hello", "World")
}

fun main(args: Array<String>) {
    runApplication<SpringdemoApplication>(*args)
}
