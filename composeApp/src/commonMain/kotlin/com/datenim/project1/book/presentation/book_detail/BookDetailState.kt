package com.datenim.project1.book.presentation.book_detail

import com.datenim.project1.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
