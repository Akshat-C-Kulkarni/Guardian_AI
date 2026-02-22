package com.akshat.guardian_ai.ui.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(
    onPredictionsClick: () -> Unit,
    onProfileClick: () -> Unit,
    onEmergencyClick: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        Text("Dashboard", style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(20.dp))

        Button(onClick = onPredictionsClick, modifier = Modifier.fillMaxWidth()) {
            Text("Go to Predictions")
        }

        Spacer(Modifier.height(8.dp))

        Button(onClick = onProfileClick, modifier = Modifier.fillMaxWidth()) {
            Text("Go to Profile")
        }

        Spacer(Modifier.height(8.dp))

        Button(onClick = onEmergencyClick, modifier = Modifier.fillMaxWidth()) {
            Text("Emergency Center")
        }
    }
}
