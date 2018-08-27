package vender.timevender.com.timevender

import android.app.Application
import android.content.Context
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import vender.timevender.com.data.user.PhoneLogin
import vender.timevender.com.data.user.RemoteUserRepository
import vender.timevender.com.timevender.launcher.login.LoginViewModel

class LoginViewModelTest {

    @Mock
    private lateinit var context: Application
    @Mock
    private lateinit var userRepository: RemoteUserRepository
    private lateinit var loginViewModel: LoginViewModel

    @Before
    fun setupTasksViewModel() {
//        MockitoAnnotations.initMocks(this)
//        setupContext()
//        loginViewModel = LoginViewModel()
//        loginViewModel.userRepository = userRepository

    }

//    val retrofit = getRetrofit()
//    val behavior = NetworkBehavior.create()
//    val mockRetrofit = MockRetrofit.Builder(retrofit).networkBehavior(behavior).build()

    @Test
    fun testLogin() {

//        with(loginViewModel) {
//            init(PhoneLogin("+61410922278", "198311"))
//        }
    }

    private fun setupContext() {
       // `when`<Context>(context.applicationContext).thenReturn(context)

    }

}