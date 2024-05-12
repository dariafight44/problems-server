package ru.dinosaurus.problemsserver.models

import jakarta.persistence.*

@Entity
@Table(name = "slang_dinozaurus")
data class SlangDinozaurus constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null,
)