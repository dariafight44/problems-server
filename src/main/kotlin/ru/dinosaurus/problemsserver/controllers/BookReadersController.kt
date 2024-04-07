package ru.dinosaurus.problemsserver.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.dinosaurus.problemsserver.models.BooksReader
import ru.dinosaurus.problemsserver.repositories.ReadersRepository

@RestController
class BookReadersController @Autowired constructor(
    private val repository: ReadersRepository
)
{
    @GetMapping("/readers")
    fun getAllReaders():List<BooksReader?>
    {
        return repository.findAll()
    }
}