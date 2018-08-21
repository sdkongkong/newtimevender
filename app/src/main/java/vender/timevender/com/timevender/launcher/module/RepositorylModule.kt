package vender.timevender.com.timevender.launcher.module

import dagger.Module
import dagger.Provides
import vender.timevender.com.timevender.launcher.login.UserRepository

@Module
class RepositorylModule {

    @Provides
    fun provideUserRepository() = UserRepository()
}