package com.datenim.project1

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.datenim.project1.book.domain.Book
import com.datenim.project1.book.presentation.book_list.BookListScreen
import com.datenim.project1.book.presentation.book_list.BookListState

//@Preview
//@Composable
//private fun BookSearchBarPreviews() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.White)
//    ) {
//        BookSearchBar(
//            searchQuery = "",
//            onSearchQueryChange = {},
//            onImeSearch = {},
//            modifier = Modifier
//                .fillMaxWidth()
//        )
//    }
//}


@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books,
        ),
        onAction = {}
    )
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://about.x.com/content/dam/about-twitter/x/large-x-logo.png.twimg.1920.png",
        authors = listOf("Author $it"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.6776,
        ratingsCount = 5,
        numPages = 100,
        numEditions = 3
    )
}
