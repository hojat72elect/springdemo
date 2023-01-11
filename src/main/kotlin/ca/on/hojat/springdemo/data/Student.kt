package ca.on.hojat.springdemo.data

import java.time.LocalDate

data class Student(
    val id: Long,
    val name: String,
    val age: Int,
    val dateOfBirth: LocalDate,
    val email: String
)
