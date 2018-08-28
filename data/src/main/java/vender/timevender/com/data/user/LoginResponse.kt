package vender.timevender.com.data.user

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class LoginResponse : BaseResponse() {
    @PrimaryKey
    var token: String = ""
}
