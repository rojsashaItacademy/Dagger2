package ru.trinitydigital.dagger2.data

data class BaseListingResponse<T>(
    val total_count: Int,
    val rows: List<T>
)