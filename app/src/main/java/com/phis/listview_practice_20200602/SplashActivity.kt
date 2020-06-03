package com.phis.listview_practice_20200602

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setValues()
        setupEvents()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        val myHandler = Handler()
        myHandler.postDelayed({
            val myIntent = Intent(mContext,MainActivity::class.java)
            startActivity(myIntent)
            finish()
        },3000)

    }

}
