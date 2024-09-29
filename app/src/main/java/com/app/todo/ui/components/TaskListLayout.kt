package com.app.todo.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TaskListLayout() {
    LazyColumn (
        content = {
            items(count = 50) {
                item -> TaskTile()
            }
        }
    )
}

@Composable
fun TaskTile() {
    var isChecked by remember { mutableStateOf(false) }
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier
            .background(Color(0xFFE9CDD1))
            .padding(top = 12.dp),
       content = {
           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceBetween,
               verticalAlignment = Alignment.CenterVertically,
             content = {
                 Checkbox(
                     checked = isChecked ,
                     onCheckedChange = {if (isChecked == true) isChecked = false else isChecked = true},
                 )

                 Column (
                     modifier = Modifier.weight(1f),
                     content = {
                         Spacer(modifier = Modifier.height(12.dp))
                         Text(text = "Title",
                             fontSize = 18.sp,
                             fontWeight = FontWeight.SemiBold
                         )
                         Text(text = "10/10/2002 - 10:00 PM ",
                             fontSize = 15.sp,
                             fontWeight = FontWeight.Normal
                         )
                         Text(text = "Description")
                     }
                 )
                 Icon(Icons.Default.MoreHoriz, contentDescription = "done")
             }
           )
       }
    )
    HorizontalDivider()
}