package vender.timevender.com.timevender.launcher.login


import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import vender.timevender.com.timevender.R
import vender.timevender.com.timevender.launcher.LauncherActivity

class LoginFragment : Fragment() {


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as LauncherActivity).loginViewModel.loginResponse?.observe(this, Observer {
            Log.d("tag", it?.token)
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener {
            (activity as LauncherActivity).loginViewModel.init(PhoneLogin("+61410922278", "198311"))
        }
        return view
    }

}
