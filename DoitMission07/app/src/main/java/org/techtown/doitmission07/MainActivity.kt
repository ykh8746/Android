package org.techtown.doitmission07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginButton : Button = findViewById(R.id.button)

        loginButton.setOnClickListener {

            var intent : Intent = Intent(this, mainmenu::class.java)
            startActivityForResult(intent, 101)
        }
    }
}