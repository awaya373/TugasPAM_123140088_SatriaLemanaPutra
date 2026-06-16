package com.example.satrialemanaputra.viewmodel

import androidx.lifecycle.ViewModel
import com.example.satrialemanaputra.data.ProfileUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ProfileViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState = _uiState.asStateFlow()

    fun updateProfile(name:String,bio:String){
        _uiState.update { it.copy(name=name,bio=bio) }
    }

    fun toggleDarkMode(){
        _uiState.update { it.copy(darkMode=!it.darkMode) }
    }
}
