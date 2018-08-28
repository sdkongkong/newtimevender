package vender.timevender.com.data.user

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "login_response")
class LoginResponse : BaseResponse() {
    @PrimaryKey
    var token: String = ""
}
