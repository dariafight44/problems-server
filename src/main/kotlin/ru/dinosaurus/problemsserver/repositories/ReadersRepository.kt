package ru.dinosaurus.problemsserver.repositories

import org.springframework.data.jpa.repository.JpaRepository
import ru.dinosaurus.problemsserver.models.BooksReader

interface ReadersRepository: JpaRepository<BooksReader?,Long?>