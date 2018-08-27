package vender.timevender.com.timevender.launcher.login

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import vender.timevender.com.data.user.PhoneLogin
import vender.timevender.com.timevender.R
import vender.timevender.com.timevender.launcher.LauncherActivity

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener {

            val loginResponse = (activity as LauncherActivity).loginViewModel.init(PhoneLogin("+61410922278", "198311"))

        }
        return view
    }

}
