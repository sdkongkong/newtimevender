package vender.timevender.com.data.user

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface UserDao {
    @Query("select * from loginresponse")
    fun getToken(): LoginResponse
}