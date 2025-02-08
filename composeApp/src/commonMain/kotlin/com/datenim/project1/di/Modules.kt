package com.datenim.project1.di

import com.datenim.project1.book.data.network.KtorRemoteBookDataSource
import com.datenim.project1.book.data.network.RemoteBookDataSource
import com.datenim.project1.book.data.repository.DefaultBookRepository
import com.datenim.project1.book.domain.BookRepository
import com.datenim.project1.book.presentation.SelectedBookViewModel
import com.datenim.project1.book.presentation.book_list.BookListViewModel
import com.datenim.project1.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }

    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::SelectedBookViewModel)
}