package vender.timevender.com.data.user

import java.io.Serializable


open class BaseResponse : Serializable {
    var status = ""
    var res: Boolean = false
    var message = ""

    val isSuccess: Boolean
        get() = "ok" == status
}
