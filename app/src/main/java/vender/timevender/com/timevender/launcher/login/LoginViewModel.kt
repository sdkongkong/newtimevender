package vender.timevender.com.timevender.launcher.login

import android.arch.lifecycle.ViewModel
import android.util.Log
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import vender.timevender.com.data.user.PhoneLogin
import vender.timevender.com.data.user.RemoteUserRepository
import vender.timevender.com.timevender.launcher.AppDatabase

class LoginViewModel : ViewModel() {

    lateinit var userRepository: RemoteUserRepository
    lateinit var database: AppDatabase

    fun init(loginBody: PhoneLogin) {
        userRepository.getToken(loginBody)
                .map {
                    database.userDao().saveToken(it)

                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<Unit> {
                    override fun onComplete() {
                        Log.d("room", "completed")
                    }

                    override fun onSubscribe(d: Disposable) {
                        Log.d("room", "onSubscribe")

                    }

                    override fun onNext(t: Unit) {
                        Log.d("room", "onNext")

                    }

                    override fun onError(e: Throwable) {
                        Log.d("room", e.message)
                    }

                })
    }

}
