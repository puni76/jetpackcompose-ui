package com.example.ui_jetpack.ui.Screens.util

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_jetpack.R

@Composable
fun AnimalCard(
    image:Int,
    selected:Boolean,
    animalSelected : (animalName:String) -> Unit
){
    val localFocusManager= LocalFocusManager.current

    Card (
            modifier = Modifier
                .padding(24.dp)
                .size(130.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ){
        Box (
            modifier = Modifier.fillMaxSize()
                .border(
                    width = 1.dp,
                    color = if (selected) Color.Green else Color.Transparent,
                    shape = RoundedCornerShape(8.dp)
                )
        ){
        Image(
            modifier= Modifier
                .padding(16.dp)
                .wrapContentWidth()
                .wrapContentHeight()
                .clickable {
                    val animalName = if (image == R.drawable.cat1) " Cat" else "Dog"
                    animalSelected(animalName)
                    localFocusManager.clearFocus()
                },
            painter = painterResource(id = image) ,
            contentDescription = "cat",
            )
        }
    }
}