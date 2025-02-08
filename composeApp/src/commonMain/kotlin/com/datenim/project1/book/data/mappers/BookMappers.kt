package com.datenim.project1.book.data.mappers

import com.datenim.project1.book.data.dto.SearchedBookDto
import com.datenim.project1.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imageUrl = if (coverKey != null) {
            "https://covers.openlibrary.org/b/olid/{$coverKey}-L.jpg"
        } else {
            "https://covers.openlibrary.org/b/id/{$coverAlternativeKey}-L.jpg"
        },
        authors = authorKeys ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        firstPublishYear = firstPublishYear?.toString(),
        averageRating = ratingsCount?.toDouble(),
        ratingsCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions ?: 0
    )
}