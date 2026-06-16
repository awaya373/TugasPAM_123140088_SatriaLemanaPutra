package com.example.tugas2pam_123140088_satrialemanaputra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tugas2pam_123140088_satrialemanaputra.ui.theme.Tugas2PAM_123140088_SatriaLemanaPutraTheme
import com.example.tugas2pam_123140088_satrialemanaputra.tampilan.NewsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Tugas2PAM_123140088_SatriaLemanaPutraTheme {
                NewsScreen()
            }
        }
    }
}
