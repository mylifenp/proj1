package com.datenim.project1.book.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchedBookDto(
    @SerialName("key") val id: String,
    @SerialName("title") val title: String,
    @SerialName("language") val languages: List<String>? = null,
    @SerialName("cover_i") val coverKey: Int? = null,
    @SerialName("author_key") val authorKeys: List<String>? = null,
    @SerialName("cover_edition_key") val coverAlternativeKey: String? = null,
    @SerialName("first_publish_year") val firstPublishYear: Int? = null,
    @SerialName("ratings_count") val ratingsCount: Int? = null,
    @SerialName("number_of_pages_median") val numPagesMedian: Int? = null,
    @SerialName("edition_count") val numEditions: Int? = null,
)