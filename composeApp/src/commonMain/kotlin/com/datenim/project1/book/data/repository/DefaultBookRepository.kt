package com.datenim.project1.book.data.repository

import com.datenim.project1.book.data.mappers.toBook
import com.datenim.project1.book.data.network.RemoteBookDataSource
import com.datenim.project1.book.domain.Book
import com.datenim.project1.book.domain.BookRepository
import com.datenim.project1.core.domain.DataError
import com.datenim.project1.core.domain.Result
import com.datenim.project1.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
) : BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}