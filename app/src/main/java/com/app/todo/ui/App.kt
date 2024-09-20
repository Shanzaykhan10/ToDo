package com.app.todo.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.app.todo.ui.components.TaskGridLayout


@Composable
fun App(innerPadding : PaddingValues) {
    Surface (
        modifier = Modifier
            .padding(innerPadding),
        content = {
            TaskGridLayout()
        }
    )
}