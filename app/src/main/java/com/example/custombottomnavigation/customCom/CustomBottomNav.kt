package com.example.custombottomnavigation.customCom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.custombottomnavigation.Screens

@Composable
fun CustomBottomNav(
    selectedRoute: String,
    onItemSelected: (Screens) -> Unit,
) {
    val items = listOf(
        Screens.Home,
        Screens.Favorites,
        Screens.Profile,
        Screens.Settings
    )

    val navShape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(navShape)
            .background(MaterialTheme.colors.surface)
            .padding(vertical = 18.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        items.forEach { screen ->
            val isSelected = screen.route == selectedRoute
            val color =
                if (isSelected)
                    MaterialTheme.colors.primary
                else
                    MaterialTheme.colors.onSurface.copy(alpha = 0.7f)

            IconButton(onClick = {
                if (!isSelected) onItemSelected(screen)}) {
                Icon(
                    imageVector = screen.icon,
                    contentDescription = null,
                    tint = color
                )
            }
        }
    }
}