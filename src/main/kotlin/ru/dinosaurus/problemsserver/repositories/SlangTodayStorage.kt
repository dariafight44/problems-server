package ru.dinosaurus.problemsserver.repositories

import org.springframework.data.jpa.repository.JpaRepository
import ru.dinosaurus.problemsserver.models.SlangToday


interface SlangTodayStorage: JpaRepository<SlangToday?,Long?>
