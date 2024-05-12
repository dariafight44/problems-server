package ru.dinosaurus.problemsserver.models

import jakarta.persistence.*

@Entity
@Table(name = "slang_today")
data class SlangToday constructor(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var desccrption: String? = null,
)
