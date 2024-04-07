package ru.dinosaurus.problemsserver.models

import jakarta.persistence.*


@Entity
@Table(name = "rdeaders")
class BooksReader constructor
    (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        var ID: Long? = null,
        var name: String? = null,
        var phone: String? = null,
    )