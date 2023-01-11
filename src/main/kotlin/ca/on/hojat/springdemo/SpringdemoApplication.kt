package ca.on.hojat.springdemo

import ca.on.hojat.springdemo.data.Student
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.time.Month

@SpringBootApplication
@RestController
class SpringdemoApplication {

    @GetMapping("/")
    fun hello() = listOf(
        Student(
            1L,
            "Hojat",
            29,
            LocalDate.of(1993, Month.JULY, 2),
            "hojat72elect@gmail.com"
        )
    )
}

fun main(args: Array<String>) {
    runApplication<SpringdemoApplication>(*args)
}
