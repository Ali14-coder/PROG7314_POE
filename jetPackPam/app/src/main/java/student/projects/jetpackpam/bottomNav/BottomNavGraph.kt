package student.projects.jetpackpam.bottomNav

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import student.projects.jetpackpam.screens.GamesScreen
import student.projects.jetpackpam.screens.HomeScreen
import student.projects.jetpackpam.screens.VideoScreen

@Composable
fun BottomNavGraph(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Video.route) {
            VideoScreen()
        }
        composable(route = BottomBarScreen.Games.route) {
            GamesScreen()
        }
    }
}