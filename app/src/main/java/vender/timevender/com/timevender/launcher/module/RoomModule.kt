package vender.timevender.com.timevender.launcher.module

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import vender.timevender.com.timevender.launcher.AppDatabase
import javax.inject.Singleton


@Module
class RoomModule {
    @Singleton
    @Provides
    fun providesRoomInstance(context: Context): AppDatabase {
        return Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "timevender").build()
    }
}