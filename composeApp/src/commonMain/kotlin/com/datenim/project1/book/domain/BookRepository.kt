package com.datenim.project1.book.domain

import com.datenim.project1.core.domain.DataError
import com.datenim.project1.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}