package com.elyeproj.issue_android_fragment_onactivityresult_requestcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_launch.*

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        btn_activity_bug.setOnClickListener {
            startActivity(Intent(this, MainBugActivity::class.java))
        }

        btn_activity_ok.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
