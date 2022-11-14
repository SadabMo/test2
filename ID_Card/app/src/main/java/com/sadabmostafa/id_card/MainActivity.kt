package com.sadabmostafa.id_card

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.textTest);
        val tv2 = findViewById<TextView>(R.id.MainName);
        val btn = findViewById<Button>(R.id.btn_info);
        tv.text = "A+"
        tv2.text = "Sadab mostafa"
        btn.setOnClickListener{
            Toast.makeText(this,"Update your Informations",Toast.LENGTH_SHORT).show();
            val intents2 = Intent(this, update::class.java)
            startActivity(intents2)
        }
        val profileName=intent.getStringExtra("Username")
        val blood=intent.getStringExtra("blood")


        tv.text = blood
        tv2.text = profileName

    }
}