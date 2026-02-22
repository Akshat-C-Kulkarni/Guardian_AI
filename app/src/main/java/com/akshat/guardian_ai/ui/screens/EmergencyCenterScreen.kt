package com.akshat.guardian_ai.ui.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EmergencyCenterScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        Text("Emergency Center", style = MaterialTheme.typography.headlineMedium)
    }
}
