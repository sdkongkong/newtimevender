package vender.timevender.com.timevender.launcher.login

data class UserBean(var id: String?, var name: String?,
                    var firstName: String?,
                    var lastName: String?,
                    var email: String? = null,
                    var avatar: String? = null,
                    var mobileNumber: String? = null,
                    var level: Int = 0,
                    var backgroundPicture: String? = null,
                    var description: String? = null,
                    var dataOfBirth: Int = 0,
                    var isFacebookVerified: Boolean = false,
                    var isPhoneNumberVerified: Boolean = false)

