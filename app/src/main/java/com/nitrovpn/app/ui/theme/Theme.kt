package com.nitrovpn.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColors = darkColorScheme(
    primary = NitroLime,
    onPrimary = NitroBg,
    secondary = NitroCyan,
    tertiary = NitroPurple,
    background = NitroBg,
    onBackground = NitroOnBg,
    surface = NitroSurface,
    onSurface = NitroOnBg,
    error = NitroDanger,
)

private val LightColors = lightColorScheme(
    primary = NitroPurple,
    secondary = NitroCyan,
)

@Composable
fun NitroVPNTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = NitroTypography,
        content = content,
    )
}
