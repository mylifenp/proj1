package com.datenim.project1.book.presentation.book_list

import com.datenim.project1.book.domain.Book
import com.datenim.project1.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResult: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)