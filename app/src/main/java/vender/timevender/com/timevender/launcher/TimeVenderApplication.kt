package vender.timevender.com.timevender.launcher

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import vender.timevender.com.timevender.launcher.module.AppComponent
import vender.timevender.com.timevender.launcher.module.AppModule
import vender.timevender.com.timevender.launcher.module.DaggerAppComponent

class TimeVenderApplication :Application() {


    lateinit var venderComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        venderComponent = initDagger(this)

    }

    private fun initDagger(app: TimeVenderApplication):AppComponent{
        return DaggerAppComponent.builder()
                .appModule(AppModule(app))
                .build()
    }
}