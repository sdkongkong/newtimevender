package vender.timevender.com.timevender.launcher

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import vender.timevender.com.data.user.RemoteUserRepository
import vender.timevender.com.timevender.R
import vender.timevender.com.timevender.launcher.login.LoginFragment
import vender.timevender.com.timevender.launcher.login.LoginViewModel
import javax.inject.Inject

class LauncherActivity : AppCompatActivity() {

    @Inject
    lateinit var userRepository: RemoteUserRepository

    @Inject
    lateinit var database: AppDatabase

    lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as TimeVenderApplication).venderComponent.inject(this)
        setContentView(R.layout.activity_launcher)
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        loginViewModel.userRepository = userRepository
        loginViewModel.database = database
        supportFragmentManager.beginTransaction().replace(R.id.frame, LoginFragment()).commit()
    }
}
