package com.example.satrialemanaputra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.satrialemanaputra.viewmodel.ProfileViewModel

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent { ProfileScreen() }
 }
}

@Composable
fun ProfileScreen(vm: ProfileViewModel = viewModel()) {
 val uiState by vm.uiState.collectAsState()

 var name by remember { mutableStateOf(uiState.name) }
 var bio by remember { mutableStateOf(uiState.bio) }

 MaterialTheme {
  Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
   Text("Profile App MVVM", style = MaterialTheme.typography.headlineSmall)
   Text("NIM: 123140088")

   OutlinedTextField(value=name,onValueChange={name=it},label={Text("Nama")})
   OutlinedTextField(value=bio,onValueChange={bio=it},label={Text("Bio")})

   Button(onClick={ vm.updateProfile(name,bio) }) { Text("Simpan") }

   Row {
    Text("Dark Mode")
    Spacer(Modifier.width(8.dp))
    Switch(checked=uiState.darkMode,onCheckedChange={ vm.toggleDarkMode() })
   }

   HorizontalDivider()

   Text("Nama: ${uiState.name}")
   Text("Bio: ${uiState.bio}")
  }
 }
}
