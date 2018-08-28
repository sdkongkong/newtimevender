package vender.timevender.com.data.user

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface UserDao {
    @Query("select * from login_response")
    fun getToken(): LoginResponse

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveToken(response: LoginResponse)
}