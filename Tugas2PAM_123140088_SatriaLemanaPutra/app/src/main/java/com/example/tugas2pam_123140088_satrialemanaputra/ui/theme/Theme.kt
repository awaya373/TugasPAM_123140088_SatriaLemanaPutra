package com.example.tugas2pam_123140088_satrialemanaputra.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = DarkBlue,
    secondary = TealAccent
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryBlue,
    secondary = TealAccent,
    background = LightBlue,
    surface = White
)

@Composable
fun Tugas2PAM_123140088_SatriaLemanaPutraTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
