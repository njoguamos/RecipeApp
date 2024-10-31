package com.njoguamos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun RootNavigationGraph(
    root: @Composable (navigateToSettings: () -> Unit) -> Unit
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Root
    ) {
        composable<Screen.Root> {
            root { navController.navigate(Screen.Settings) }
        }
        composable<Screen.Settings> {

        }
    }
}