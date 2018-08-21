package vender.timevender.com.timevender.launcher.login

import android.arch.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository {
    var loginService: LoginService? = null

    fun getLoginResponse(phoneLoginBody: PhoneLogin): MutableLiveData<LoginResponse> {
        val data = MutableLiveData<LoginResponse>()

        loginService?.phoneLogin(phoneLoginBody)?.enqueue(object : Callback<LoginResponse> {
            override fun onFailure(call: Call<LoginResponse>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<LoginResponse>?, response: Response<LoginResponse>?) {
                data.value = response?.body()
            }
        })
        return data
    }
}