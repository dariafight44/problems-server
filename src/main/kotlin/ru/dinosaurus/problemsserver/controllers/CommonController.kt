package ru.dinosaurus.problemsserver.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.dinosaurus.problemsserver.models.FirstPageData

@RestController
class CommonController {

    @GetMapping ("/initialData")
    fun getFirstPageData(): FirstPageData
    {
        return FirstPageData()
    }
}