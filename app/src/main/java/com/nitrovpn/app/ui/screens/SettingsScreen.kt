package com.nitrovpn.app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nitrovpn.app.ui.navigation.Routes

@Composable
fun SettingsScreen(onNavigate: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Settings", style = MaterialTheme.typography.headlineSmall)
        Button(onClick = { onNavigate(Routes.SPLIT_TUNNELING) }) { Text("Split Tunneling") }
        Button(onClick = { onNavigate(Routes.ROUTING_RULES) }) { Text("Routing Rules") }
        Button(onClick = { onNavigate(Routes.SPEED_TEST) }) { Text("Speed Test") }
        Button(onClick = { onNavigate(Routes.AUTO_DETECT) }) { Text("Auto Detect") }
        Button(onClick = { onNavigate(Routes.LOGS) }) { Text("Logs") }
        Button(onClick = { onNavigate(Routes.LICENSES) }) { Text("Licenses") }
    }
}
