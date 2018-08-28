package vender.timevender.com.data.user

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [LoginResponse::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}