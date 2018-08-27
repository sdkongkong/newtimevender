package vender.timevender.com.timevender.launcher.module

import dagger.Component
import vender.timevender.com.timevender.launcher.LauncherActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RepositorylModule::class, NetworkModule::class, LoginModule::class])
interface AppComponent {

    fun inject(target: LauncherActivity)

}