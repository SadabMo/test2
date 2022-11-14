package com.sadabmostafa.id_card

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.view.View

class update : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)
        val btn = findViewById<Button>(R.id.btn_home);
        btn.setOnClickListener{
            Toast.makeText(this,"Back to Home", Toast.LENGTH_SHORT).show();
            val intentNew = Intent(this, MainActivity::class.java)
            startActivity(intentNew)
        }
        val btn2= findViewById<Button>(R.id.but_update);
        btn2.setOnClickListener{

            val tx = findViewById<View>(R.id.nam) as EditText
            val str = tx.text.toString()
            val txB = findViewById<View>(R.id.blood) as EditText
            val strB = txB.text.toString()
            println(str)
            Toast.makeText(this,"Updated", Toast.LENGTH_SHORT).show();

            val intent = Intent(this@update,MainActivity::class.java)
            intent.putExtra("Username",str)
            intent.putExtra("blood",strB)
            startActivity(intent)
        }



    }
}