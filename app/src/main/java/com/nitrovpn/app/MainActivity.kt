package com.nitrovpn.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.nitrovpn.app.ui.navigation.NitroNavGraph
import com.nitrovpn.app.ui.theme.NitroVPNTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NitroVPNTheme {
                NitroNavGraph()
            }
        }
    }
}
