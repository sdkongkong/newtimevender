package vender.timevender.com.data.user

import io.reactivex.Observable


class RemoteUserRepository(loginService: LoginService) : IUserRepository {


    var mLoginService: LoginService = loginService

    override fun getToken(phoneLoginBody: PhoneLogin): Observable<LoginResponse> {
        return mLoginService.phoneLogin(phoneLoginBody)
    }
}