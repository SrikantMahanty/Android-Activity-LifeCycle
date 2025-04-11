package com.srikant.android_activity_lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.e("onCreate ------ ", "MainActivity: onCreate()")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Log.e("onStart ------ ", "MainActivity: onStart()")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Log.e("onResume ------ ", "MainActivity: onResume()")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause ------ ", "MainActivity: onPause()")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.e("onStop ------ ", "MainActivity: onStop()")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy ------ ", "MainActivity: onDestroy()")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart ------ ", "MainActivity: onRestart()")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }
    fun switchActivity(view: View) {
        val intent = Intent(this, AnotherActivity::class.java)
        startActivity(intent)
    }
}