package vender.timevender.com.timevender.launcher.login

import java.io.Serializable

/**
 * Created by Kevin Song on 18/12/2016.
 * Copyright (c) 2016 Woolworths. All rights reserved.
 */

open class BaseResponse : Serializable {
    var status = ""
    var res: Boolean = false
    var message = ""

    val isSuccess: Boolean
        get() = "ok" == status
}
