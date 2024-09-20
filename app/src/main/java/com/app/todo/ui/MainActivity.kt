package com.app.todo.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.app.todo.ui.components.TopNavBar
import com.app.todo.ui.theme.ToDoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoTheme {
                Scaffold(
                    topBar = { TopNavBar() },
                    modifier = Modifier
                        .fillMaxSize()
                ) { innerPadding ->
                    App(innerPadding = innerPadding)
                }
            }
        }
    }
}
