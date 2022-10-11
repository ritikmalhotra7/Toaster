package com.example.toastsamplelibrary

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.toasty.Toaster

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Here is a working example of Toaster
        findViewById<TextView>(R.id.text_one).setOnClickListener {
            //Instantiate Toaster class and use this function called customToast
            Toaster().customToast(
                this,
                "example for toast",
                cornerRadius = 100f,
                iconDrawable = this.getDrawable(R.drawable.ic_launcher_foreground)
            )
        }
    }
}