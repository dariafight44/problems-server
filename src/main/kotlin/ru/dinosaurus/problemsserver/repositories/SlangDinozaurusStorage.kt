package ru.dinosaurus.problemsserver.repositories

import org.springframework.data.jpa.repository.JpaRepository
import ru.dinosaurus.problemsserver.models.SlangDinozaurus


interface SlangDinozaurusStorage: JpaRepository<SlangDinozaurus?,Long?>
