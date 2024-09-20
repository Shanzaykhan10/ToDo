package com.app.todo.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.app.todo.R

@Composable
fun TopNavBar() {
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp)
            .padding(horizontal = 16.dp),
        content = {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                content = {
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp_image_2024_08_10_at_11_48_29_63019837),
                        contentDescription = "My Pic",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape),
                    )
                    Row {
                        IconButton(modifier = Modifier
                            .size(width = 56.dp, height = 56.dp),
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color.Black,
                                contentColor = Color.White
                            ), onClick = { /*TODO*/ },
                            content = {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Add"
                                )
                            }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        IconButton(modifier = Modifier
                            .size(width = 56.dp, height = 56.dp),
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color(red = 225, green = 221, blue = 246),
                                contentColor = Color.White
                            ), onClick = { /*TODO*/ })
                            {
                                Icon(
                                    imageVector = Icons.Outlined.Notifications,
                                    contentDescription = "Notifications"
                                )
                            }

                    }
                }
            )
        }
    )
}




