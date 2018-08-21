package vender.timevender.com.timevender.launcher.login


import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable


interface LoginService {

    @POST("api/v1/mobile-number/login")
    fun phoneLogin(@Body body: PhoneLogin): Call<LoginResponse>
}
