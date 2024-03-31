package ru.dinosaurus.problemsserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProblemsServerApplication

fun main(args: Array<String>) {
	runApplication<ProblemsServerApplication>(*args)
}
