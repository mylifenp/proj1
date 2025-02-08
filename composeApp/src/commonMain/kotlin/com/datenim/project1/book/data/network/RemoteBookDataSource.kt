package com.datenim.project1.book.data.network

import com.datenim.project1.book.data.dto.SearchResponseDto
import com.datenim.project1.core.domain.DataError
import com.datenim.project1.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>
}