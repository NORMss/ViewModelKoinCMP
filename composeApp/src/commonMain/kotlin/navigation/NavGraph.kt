package navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import screen.detail.DetailScreen
import screen.home.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String = Screen.Home.rote,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(
            route = Screen.Home.rote
        ) {
            HomeScreen(
                navigateToDetails = {
                    navController.navigate(Screen.Detail.rote)
                }
            )
        }
        composable(
            route = Screen.Detail.rote
        ) {
            DetailScreen(
                navigateToHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}