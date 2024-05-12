package ru.dinosaurus.problemsserver.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.dinosaurus.problemsserver.models.SlangDinozaurus
import ru.dinosaurus.problemsserver.models.SlangToday
import ru.dinosaurus.problemsserver.repositories.SlangDinozaurusStorage
import ru.dinosaurus.problemsserver.repositories.SlangTodayStorage


@RestController
class SlangController @Autowired constructor(
    private val slangToday: SlangTodayStorage,
    private val slangDinozaurus: SlangDinozaurusStorage
)
{
    @GetMapping("/slang/dinosaurus")
    fun getAllPhrases1(): List<SlangDinozaurus?>
    {
        return slangDinozaurus.findAll()
    }

    @GetMapping("/slang/today")
    fun getAllPhrases2(): List<SlangToday?>
    {
        return slangToday.findAll()
    }
}