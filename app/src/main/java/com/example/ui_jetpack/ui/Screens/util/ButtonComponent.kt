package com.example.ui_jetpack.ui.Screens.util

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ButtonComponent(
    goToDetailsScreen : () -> Unit
){
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = { goToDetailsScreen() }
    ) {
        TextComponent(
            textValue = "Go to Details Screen",
            textSize = 18.sp,
            colorValue = Color.White,
        )
    }
}