package vender.timevender.com.timevender.launcher

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import vender.timevender.com.data.user.LoginResponse
import vender.timevender.com.data.user.UserDao
import vender.timevender.com.timevender.BuildConfig

@Database(entities = [LoginResponse::class], version = BuildConfig.VERSION_CODE )
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}