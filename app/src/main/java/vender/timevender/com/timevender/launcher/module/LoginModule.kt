package vender.timevender.com.timevender.launcher.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import vender.timevender.com.data.user.LoginService
import javax.inject.Singleton

@Module
class LoginModule {

    @Provides
    @Singleton
    fun provideLoginService(retrofit: Retrofit): LoginService {
        return retrofit.create(LoginService::class.java)
    }
}