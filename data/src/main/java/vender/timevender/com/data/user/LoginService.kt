package vender.timevender.com.data.user


import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST


interface LoginService {

    @POST("api/v1/mobile-number/login")
    fun phoneLogin(@Body body: PhoneLogin): Observable<LoginResponse>
}
