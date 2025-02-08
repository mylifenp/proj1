package com.datenim.project1.book.presentation

import androidx.lifecycle.ViewModel
import com.datenim.project1.book.domain.Book
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SelectedBookViewModel : ViewModel() {
    private val _selectedBook = MutableStateFlow<Book?>(null)

    val selectedBook get() = _selectedBook.asStateFlow()

    fun onSelectedBook(book: Book?) {
        _selectedBook.value = book
    }
}