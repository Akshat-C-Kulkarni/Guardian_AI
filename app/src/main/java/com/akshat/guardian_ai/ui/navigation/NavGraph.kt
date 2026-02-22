package com.akshat.guardian_ai.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.akshat.guardian_ai.ui.Screens.*

@Composable
fun NavGraph(startDestination: String = "signin") {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("signin") {
            SignInScreen(
                onSignIn = { navController.navigate("dashboard") },
                onSignUp = { navController.navigate("signup") }
            )
        }

        composable("signup") {
            SignUpScreen(
                onSignUpSuccess = { navController.navigate("onboard1") }
            )
        }

        composable("onboard1") {
            OnboardingStep1(
                onNext = { navController.navigate("onboard2") }
            )
        }

        composable("onboard2") {
            OnboardingStep2(
                onNext = { navController.navigate("onboard3") }
            )
        }

        composable("onboard3") {
            OnboardingStep3(
                onNext = { navController.navigate("onboard4") }
            )
        }

        composable("onboard4") {
            OnboardingStep4(
                onFinish = { navController.navigate("dashboard") }
            )
        }

        composable("dashboard") {
            DashboardScreen(
                onPredictionsClick = { navController.navigate("predictions") },
                onProfileClick = { navController.navigate("profile") },
                onEmergencyClick = { navController.navigate("emergency") }
            )
        }

        composable("predictions") {
            PredictionsScreen()
        }

        composable("profile") {
            ProfileScreen()
        }

        composable("emergency") {
            EmergencyCenterScreen()
        }
    }
}
