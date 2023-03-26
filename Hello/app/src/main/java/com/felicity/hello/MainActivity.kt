package com.felicity.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val btnClickM = findViewById<Button>(R.id.btnClickMe) //Java old coding
       var txtView= findViewById<TextView>(R.id.txtView) // Java old coding
        // set on-click listener
        var clickCount=0;

        btnClickM.setOnClickListener {
            // your code to perform when the user clicks on the button
            clickCount+=1;
            txtView.text= clickCount.toString();
            Toast.makeText(this@MainActivity, "Hi Tendai.", Toast.LENGTH_SHORT).show();
            checkFun();
        }
    }

   private fun checkFun() {
        Toast.makeText(this@MainActivity, "In a function.", Toast.LENGTH_SHORT).show();
    }

}