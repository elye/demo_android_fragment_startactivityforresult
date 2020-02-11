package com.elyeproj.issue_android_fragment_onactivityresult_requestcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainBugActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, BlankFragment())
            .commit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d("Track", "MainBugActivity:onActivityResult Pre ${requestCode.toString(16)} $resultCode")
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("Track", "MainBugActivity:onActivityResult Pro ${requestCode.toString(16)} $resultCode")
    }
}
