package com.elyeproj.issue_android_fragment_onactivityresult_requestcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_target.*

class TargetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        btn_return.setOnClickListener {
            setResult(1)
            finish()
        }
    }
}
