package com.phishexplorer.musicservice.models

import java.time.LocalDate

data class Show(
    val id: String,
    val date: LocalDate,
    val location: String,
    val venue: String,
    val setlist: List<String>
)
