package me.lincolnstuart.funblocks.playground.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import me.lincolnstuart.funblocks.essentials.core.list.SimpleListItem
import me.lincolnstuart.funblocks.essentials.core.surface.Surface
import me.lincolnstuart.funblocks.foundation.ui.theme.FunBlocksTheme

class HomeComponentsScreen : Screen {

    @Composable
    override fun Content() {
        FunBlocksTheme {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                val navigator = LocalNavigator.currentOrThrow
                val scrollState = rememberScrollState()
                Column(Modifier.verticalScroll(scrollState)) {
                    SimpleListItem(title = "Chart", description = "Bar, Line, Pie/Donut.") {
                        navigator.push(ChartComponentsScreen())
                    }
                    SimpleListItem(title = "Form", description = "Button, Input, Checkbox, RadioButton, etc.") {
                        navigator.push(FormComponentsScreen())
                    }
                    SimpleListItem(title = "Miscellaneous", description = "Alert, Avatar, Badge, Chip, etc.") {
                        navigator.push(MiscComponentsScreen())
                    }
                }
            }
        }
    }
}
