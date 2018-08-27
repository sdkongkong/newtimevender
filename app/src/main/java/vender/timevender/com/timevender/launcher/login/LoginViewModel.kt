package vender.timevender.com.timevender.launcher.login

import android.arch.lifecycle.ViewModel
import android.util.Log
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import vender.timevender.com.data.user.LoginResponse
import vender.timevender.com.data.user.PhoneLogin
import vender.timevender.com.data.user.RemoteUserRepository

class LoginViewModel : ViewModel() {

    lateinit var userRepository: RemoteUserRepository

    fun init(loginBody: PhoneLogin) {
        userRepository.getToken(loginBody)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(io.reactivex.schedulers.Schedulers.io())
                .subscribeWith(object : Observer<LoginResponse> {
                    override fun onComplete() {
                        Log.d("LoginViewModel", "oncomplete")
                    }

                    override fun onSubscribe(d: Disposable) {
                        Log.d("LoginViewModel", d.toString())
                    }

                    override fun onNext(t: LoginResponse) {
                        Log.d("LoginViewModel:token ", t.token)
                    }

                    override fun onError(e: Throwable) {
                        Log.d("LoginViewModel", e.message)
                    }
                })
    }

}
