package com.example.ui_jetpack.ui.Screens.util

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComponent(
    textValue:String,
    textSize: TextUnit,
    colorValue: Color = Color.Black
){
    Text(
        text = textValue,
        fontSize = textSize,
        color= colorValue,
        fontWeight = FontWeight.Light
    )
}