package com.example.custombottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import com.example.custombottomnavigation.customCom.CustomBottomNav
import com.example.custombottomnavigation.ui.theme.CustomBottomNavigationTheme

private val currentRoute = mutableStateOf(Screens.Home.route)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomBottomNavigationTheme {
                window.statusBarColor = MaterialTheme.colors.background.toArgb()
                Scaffold(
                    bottomBar = {
                        CustomBottomNav(
                            selectedRoute = currentRoute.value,
                            onItemSelected = { screen ->
                                currentRoute.value = screen.route
                            },
                        )
                    },
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = MaterialTheme.colors.onSurface
                ){}
            }
        }
    }
}