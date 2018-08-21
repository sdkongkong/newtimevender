package vender.timevender.com.timevender.launcher.login

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var  loginResponse: LiveData<LoginResponse>? = null

    lateinit var userRepository: UserRepository

    fun init(loginBody: PhoneLogin) {
        loginResponse = userRepository.getLoginResponse(loginBody)
    }

}