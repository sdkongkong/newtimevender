package vender.timevender.com.timevender.launcher.module

import dagger.Module
import dagger.Provides
import vender.timevender.com.data.user.LoginService
import vender.timevender.com.data.user.RemoteUserRepository

@Module
class RepositorylModule {

    @Provides
    fun provideUserRepository(loginService: LoginService) = RemoteUserRepository(loginService)
}