package com.example.ui_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ui_jetpack.ui.Screens.FunFactsNavigationGraph
import com.example.ui_jetpack.ui.Screens.Routes
import com.example.ui_jetpack.ui.Screens.UserInputScreen
import com.example.ui_jetpack.ui.Screens.WelcomeScreen
import com.example.ui_jetpack.ui.theme.UIjetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIjetpackTheme {
                FunFactsApp()
            }
        }
    }
}

@Composable
fun FunFactsApp(){
    FunFactsNavigationGraph()
}