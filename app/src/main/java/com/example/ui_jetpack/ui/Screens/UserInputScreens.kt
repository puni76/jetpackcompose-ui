package com.example.ui_jetpack.ui.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_jetpack.R
import com.example.ui_jetpack.data.UserDataUiEvents
import com.example.ui_jetpack.ui.Screens.util.AnimalCard
import com.example.ui_jetpack.ui.Screens.util.ButtonComponent
import com.example.ui_jetpack.ui.Screens.util.TextComponent
import com.example.ui_jetpack.ui.Screens.util.TextFieldComponent
import com.example.ui_jetpack.ui.TopBar
import com.example.ui_jetpack.viewModel.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface (
        modifier = Modifier.fillMaxSize()
    ){
       Column (
           modifier = Modifier
               .fillMaxSize()
               .padding(18.dp)
       ){
            TopBar("Hi there \uD83D\uDE0A")
            TextComponent(
                textValue = "Let's learn about You !",
                textSize = 24.sp,
            )

           Spacer(modifier = Modifier.size(18.dp))

           TextComponent(
               textValue = "This app will prepare a details page based on input provided by you !",
               textSize = 18.sp,
           )

           Spacer(modifier = Modifier.size(60.dp))

           TextComponent(textValue = "Name", textSize = 18.sp)

           Spacer(modifier = Modifier.size(10.dp))

           TextFieldComponent(onTextChanged = {
               userInputViewModel.onEvent(
                   UserDataUiEvents.UserNameEntered(it)
               )
           }
         )

           Spacer(modifier = Modifier.size(30.dp))

           TextComponent(textValue = "What do you like", textSize = 18.sp)

           Spacer(modifier = Modifier.size(20.dp))

           Row (modifier = Modifier.fillMaxWidth()){
                AnimalCard(image = R.drawable.cat1 , animalSelected = {
                        userInputViewModel.onEvent(
                            UserDataUiEvents.AnimalSelected(it)
                        )
                },
                    selected = userInputViewModel.uiState.value.animalSelected == "Cat"
                )

                AnimalCard(image = R.drawable.dog1, animalSelected = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.AnimalSelected(it)
                    )
                },
                    selected = userInputViewModel.uiState.value.animalSelected == "Dog"
                )
           }

           Spacer(modifier = Modifier.weight(1f))


           ButtonComponent (
               goToDetailsScreen = {
                println("=======coming here")
                println("=======${userInputViewModel.uiState.value.nameEntered} " +
                        "and ${userInputViewModel.uiState.value.animalSelected}")
                     }
                )
            }
        }
    }


