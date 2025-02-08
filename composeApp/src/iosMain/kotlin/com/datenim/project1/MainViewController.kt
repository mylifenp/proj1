package com.datenim.project1

import androidx.compose.ui.window.ComposeUIViewController
import com.datenim.project1.app.App
import com.datenim.project1.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {

    App()
}