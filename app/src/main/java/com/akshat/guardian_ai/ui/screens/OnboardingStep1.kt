package com.akshat.guardian_ai.ui.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OnboardingStep1(onNext: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        Text("Onboarding - Step 1")

        Spacer(Modifier.height(20.dp))

        Button(onClick = onNext, modifier = Modifier.fillMaxWidth()) {
            Text("Next")
        }
    }
}
