package org.techtown.doitmission07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mainmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        var returnButton : Button = findViewById(R.id.button2)

        returnButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, 100)
        }
    }
}