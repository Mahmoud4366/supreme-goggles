package com.nitrovpn.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nitrovpn.app.ui.screens.MainScreen
import com.nitrovpn.app.ui.screens.OnboardingScreen
import com.nitrovpn.app.ui.screens.PlaceholderScreen

@Composable
fun NitroNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.ONBOARDING) {
        composable(Routes.ONBOARDING) {
            OnboardingScreen(
                onFinish = {
                    navController.navigate(Routes.MAIN) {
                        popUpTo(Routes.ONBOARDING) { inclusive = true }
                    }
                },
            )
        }
        composable(Routes.MAIN) {
            MainScreen(rootNavController = navController)
        }
        composable(Routes.SPLIT_TUNNELING) {
            PlaceholderScreen(title = "Split Tunneling", onBack = { navController.popBackStack() })
        }
        composable(Routes.ROUTING_RULES) {
            PlaceholderScreen(title = "Routing Rules", onBack = { navController.popBackStack() })
        }
        composable(Routes.SPEED_TEST) {
            PlaceholderScreen(title = "Speed Test", onBack = { navController.popBackStack() })
        }
        composable(Routes.AUTO_DETECT) {
            PlaceholderScreen(title = "Auto Detect", onBack = { navController.popBackStack() })
        }
        composable(Routes.LOGS) {
            PlaceholderScreen(title = "Logs", onBack = { navController.popBackStack() })
        }
        composable(Routes.LICENSES) {
            PlaceholderScreen(title = "Open-source licenses", onBack = { navController.popBackStack() })
        }
    }
}
