package com.example.custombottomnavigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(
    val route: String,
    @StringRes val title: Int,
    val icon: ImageVector
){
    object Home: Screens(route = "Home", title = R.string.home, icon = Icons.Rounded.Home)
    object Favorites: Screens(route = "Favorites", title = R.string.favorites, icon = Icons.Rounded.Favorite)
    object Profile: Screens(route = "Profile", title = R.string.profile, icon = Icons.Rounded.Person)
    object Settings: Screens(route = "Settings", title = R.string.settings, icon = Icons.Rounded.Settings)
}
