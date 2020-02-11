package com.elyeproj.issue_android_fragment_onactivityresult_requestcode


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    companion object {
        const val REQUEST_CODE = 0xFF
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_activity_start.setOnClickListener {
            Log.d("Track", "BlankFragment: startActivityForResult")
            startActivityForResult(Intent(context, TargetActivity::class.java), REQUEST_CODE)
        }

        btn_fragment_start.setOnClickListener {
            Log.d("Track", "BlankFragment: activity?.startActivityForResult")
            activity?.startActivityForResult(Intent(context, TargetActivity::class.java), REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d("Track", "BlankFragment:onActivityResult Pre ${requestCode.toString(16)} $resultCode")
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("Track", "BlankFragment:onActivityResult Pro ${requestCode.toString(16)} $resultCode")
    }
}
