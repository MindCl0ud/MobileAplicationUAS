package com.example.mobileaplicationuas.Login

import androidx.lifecycle.ViewModel
import com.example.mobileaplicationuas.repository.AuthRepository

class LoginViewModel(
    private val repository: AuthRepository = AuthRepository()
):ViewModel() {
}

data class LoginUiState(
    val userName:String =" ",
    val password:String =" ",
    val UserNameSignUp:String =" ",
    val PasswordSignUp:String =" ",
    val confirmpasswordSignUp:String = " ",
    val isLoading:Boolean = false,
    val isSuccessLogin:Boolean = false,
    val signupError:String? = null,
    val loginError:String? = null,
)