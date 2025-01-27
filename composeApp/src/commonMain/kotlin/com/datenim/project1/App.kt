package com.datenim.project1

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.datenim.project1.book.presentation.book_list.BookListScreenRoot
import com.datenim.project1.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {}
    )
}