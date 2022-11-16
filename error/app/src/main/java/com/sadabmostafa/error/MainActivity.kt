package com.sadabmostafa.error

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    fun logging() {
        Log.v(TAG, "Hello, world!")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
    }
}