package vender.timevender.com.data.user

import io.reactivex.Observable


interface IUserRepository {
    fun getToken(phoneLoginBody:PhoneLogin): Observable<LoginResponse>
}