package com.srikant.android_activity_lifecycle

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class AnotherActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_another)
        Log.e("onCreate ------ ", "AnotherActivity: onCreate()")
        Toast.makeText(this, "AnotherActivity: onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart ------ ", "AnotherActivity: onStart()")
        Toast.makeText(this, "AnotherActivity: onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume ------ ", "AnotherActivity: onResume()")
        Toast.makeText(this, "AnotherActivity: onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause ------ ", "AnotherActivity: onPause()")
        Toast.makeText(this, "AnotherActivity: onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop ------ ", "AnotherActivity: onStop()")
        Toast.makeText(this, "AnotherActivity: onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy ------ ", "AnotherActivity: onDestroy()")
        Toast.makeText(this, "AnotherActivity: onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart ------ ", "AnotherActivity: onRestart()")
        Toast.makeText(this, "AnotherActivity: onRestart", Toast.LENGTH_SHORT).show()
    }
}