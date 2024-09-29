package com.app.todo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.app.todo.ui.components.TaskGridLayout
import com.app.todo.ui.components.TaskListLayout
import androidx.compose.ui.unit.dp


@Composable
fun App(innerPadding : PaddingValues) {
    Surface(
        modifier = Modifier
            .padding(innerPadding),
    )
    {
        Column(
            content = {
                TaskGridLayout()
                Spacer(modifier = Modifier.height(26.dp))
                TaskListLayout()
            }
        )
    }
}